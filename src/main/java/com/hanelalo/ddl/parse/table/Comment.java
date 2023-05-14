package com.hanelalo.ddl.parse.table;

import lombok.Data;

@Data
public class Comment {

    private String limitedQuote;

    private String commentContent;


    @Override
    public String toString() {
        return " COMMENT " + limitedQuote + commentContent + limitedQuote;
    }

}
