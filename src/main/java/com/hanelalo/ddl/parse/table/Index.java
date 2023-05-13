package com.hanelalo.ddl.parse.table;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class Index {

    private String name;

    private List<String> columns;

    private String using;

    @Override
    public String toString() {
        StringBuilder index = new StringBuilder("\tKEY ");
        if(StrUtil.isNotBlank(name)){
            index.append("`").append(name).append("`");
        }
        index.append(" (").append(columns.stream().map(column -> "`" + column + "`").collect(Collectors.joining(","))).append(")");
        if(StrUtil.isNotBlank(using)){
            index.append(" USING ").append(using);
        }
        return index.toString();
    }
}
