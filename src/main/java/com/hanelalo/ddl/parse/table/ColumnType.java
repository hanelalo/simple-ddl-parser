package com.hanelalo.ddl.parse.table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ColumnType {

    private String type;

    private Long length;

    public String toString(){
        return length == null ? type : type + "(" + length + ")";
    }

}
