package com.hanelalo.ddl.parse.table;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.util.Objects;

@Data
public class Column {

    private String name;

    private ColumnType columnType;

    private boolean primaryKey;

    private boolean autoIncrement;

    private boolean nullable = true;

    private String defaultValue;

    private Comment comment;

    @Override
    public String toString() {
        StringBuilder column = new StringBuilder("\t`").append(name).append("`");
        column.append(" ").append(columnType);
        if(primaryKey){
            column.append(" PRIMARY KEY");
        }
        if (autoIncrement) {
            column.append(" AUTO_INCREMENT");
        }
        if (!nullable){
            column.append(" NOT NULL");
        }
        if(StrUtil.isNotBlank(defaultValue)){
            column.append(" DEFAULT ").append(defaultValue);
        }
        if(Objects.nonNull(comment)){
            column.append(comment);
        }
        return column.toString();
    }
}
