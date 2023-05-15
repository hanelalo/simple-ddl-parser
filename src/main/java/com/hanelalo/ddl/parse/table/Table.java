package com.hanelalo.ddl.parse.table;

import cn.hutool.core.collection.CollectionUtil;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class Table {

    public Table(String tableName) {
        this.tableName = tableName;
    }

    private String tableName;

    private String engine;

    private Comment comment;

    private Long autoIncrement;

    private List<Column> columns = new ArrayList<>();

    private List<UniqueKey> uniqueKeys = new ArrayList<>();

    private PrimaryKey primaryKey;

    private List<Index> indices = new ArrayList<>();

    public void addColumn(Column column) {
        Optional.ofNullable(column).ifPresent(col -> columns.add(col));
    }

    public void addIndex(Index index) {
        Optional.ofNullable(index).ifPresent(idx -> indices.add(index));
    }

    public void addUniqueKey(UniqueKey uniqueKey) {
        Optional.ofNullable(uniqueKey).ifPresent(key -> uniqueKeys.add(uniqueKey));
    }

    public void populatePrimaryKey(PrimaryKey primaryKey) {
        Optional.ofNullable(primaryKey).ifPresent(key -> this.primaryKey = primaryKey);
    }

    @Override
    public String toString() {
        StringBuilder createTable = new StringBuilder("CREATE TABLE `");
        createTable.append(tableName).append("` (\n").append(tableDefinitionsString()).append("\n)");
        if (Objects.nonNull(comment)) {
            createTable.append(comment);
        }
        if (Objects.nonNull(autoIncrement)) {
            createTable.append(" AUTO_INCREMENT ").append(autoIncrement);
        }
        createTable.append(";");
        return createTable.toString();
    }

    private String tableDefinitionsString() {
        StringBuilder tableDefinitionsString = new StringBuilder(columns.stream().map(Column::toString).collect(Collectors.joining(",\n")));
        if(Objects.nonNull(primaryKey)){
            tableDefinitionsString.append(",\n");
            tableDefinitionsString.append(primaryKey);
        }
        if(CollectionUtil.isNotEmpty(uniqueKeys)){
            tableDefinitionsString.append(",\n");
            tableDefinitionsString.append(uniqueKeys.stream().map(UniqueKey::toString).collect(Collectors.joining(",\n")));
        }
        if(CollectionUtil.isNotEmpty(indices)){
            tableDefinitionsString.append(",\n");
            tableDefinitionsString.append(indices.stream().map(Index::toString).collect(Collectors.joining(",\n")));
        }
        return tableDefinitionsString.toString();
    }
}
