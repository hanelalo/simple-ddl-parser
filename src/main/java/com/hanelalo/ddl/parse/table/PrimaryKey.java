package com.hanelalo.ddl.parse.table;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class PrimaryKey {

    private String name;

    private List<String> columns;

    private Comment comment;

    @Override
    public String toString() {
        StringBuilder primaryKey = new StringBuilder("\tPRIMARY KEY ");
        if(StrUtil.isNotBlank(name)){
            primaryKey.append("`").append(name).append("`");
        }
        primaryKey.append(" (").append(columns.stream().map(column -> "`" + column + "`").collect(Collectors.joining(","))).append(")");
        if(Objects.nonNull(comment)){
            primaryKey.append(comment);
        }
        return primaryKey.toString();
    }
}
