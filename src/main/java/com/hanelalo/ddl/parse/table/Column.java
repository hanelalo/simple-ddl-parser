package com.hanelalo.ddl.parse.table;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

@Data
public class Column {

    private String name;

    private ColumnType columnType;

    private boolean primaryKey;

    private boolean autoIncrement;

    private boolean nullable;

    private String defaultValue;

    private String comment;

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
        if(StrUtil.isNotBlank(comment)){
            column.append(" COMMENT ").append(comment);
        }
        return column.toString();
    }
}
