package com.hanelalo.ddl.parse.table;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class UniqueKey {

    private String name;

    private List<String> columns;

    private Comment comment;

    @Override
    public String toString() {
        StringBuilder uniqueKey = new StringBuilder("\tUNIQUE KEY ");
        if(StrUtil.isNotBlank(name)){
            uniqueKey.append("`").append(name).append("`");
        }
        uniqueKey.append(" (").append(columns.stream().map(column -> "`" + column + "`").collect(Collectors.joining(","))).append(")");
        if(Objects.nonNull(comment)){
            uniqueKey.append(comment);
        }
        return uniqueKey.toString();
    }
}
