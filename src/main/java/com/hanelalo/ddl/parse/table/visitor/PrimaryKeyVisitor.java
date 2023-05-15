package com.hanelalo.ddl.parse.table.visitor;

import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
import com.hanelalo.ddl.parse.table.Comment;
import com.hanelalo.ddl.parse.table.PrimaryKey;

import java.util.Objects;
import java.util.stream.Collectors;

public class PrimaryKeyVisitor extends DdlParserBaseVisitor<PrimaryKey> {

    @Override
    public PrimaryKey visitPrimaryKey(DdlParser.PrimaryKeyContext ctx) {
        PrimaryKey primaryKey = new PrimaryKey();
        DdlParser.PrimaryKeyNameContext primaryKeyNameContext = ctx.primaryKeyName();
        if(Objects.nonNull(primaryKeyNameContext)) {
            DdlParser.IdContext nameContext = primaryKeyNameContext.id();
            primaryKey.setName(Objects.nonNull(nameContext) ? nameContext.ID().getText() : null);
        }
        primaryKey.setColumns(ctx.primaryKeyColumn().id().stream().map(id -> id.ID().getText()).collect(Collectors.toList()));
        DdlParser.PrimaryKeyCommentContext primaryKeyCommentContext = ctx.primaryKeyComment();
        if(Objects.nonNull(primaryKeyCommentContext)){
            String content = primaryKeyCommentContext.primaryKeyCommentContent().getText();
            Comment comment = new Comment();
            comment.setLimitedQuote(content.substring(0, 1));
            comment.setCommentContent(content.substring(1, content.length() - 1));
            primaryKey.setComment(comment);
        }
        return primaryKey;
    }
}
