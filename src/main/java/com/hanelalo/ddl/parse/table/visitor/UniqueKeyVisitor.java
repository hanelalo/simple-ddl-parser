package com.hanelalo.ddl.parse.table.visitor;

import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
import com.hanelalo.ddl.parse.table.Comment;
import com.hanelalo.ddl.parse.table.UniqueKey;

import java.util.Objects;
import java.util.stream.Collectors;

public class UniqueKeyVisitor extends DdlParserBaseVisitor<UniqueKey> {

    @Override
    public UniqueKey visitUniqueKey(DdlParser.UniqueKeyContext ctx) {
        UniqueKey uniqueKey = new UniqueKey();
        DdlParser.UniqueKeyNameContext uniqueKeyNameContext = ctx.uniqueKeyName();
        uniqueKey.setName(Objects.nonNull(uniqueKeyNameContext) ? uniqueKeyNameContext.id().ID().getText() : null);
        uniqueKey.setColumns(ctx.uniqueKeyColumn().id().stream().map(id -> id.ID().getText()).collect(Collectors.toList()));
        DdlParser.UniqueKeyCommentContext uniqueKeyCommentContext = ctx.uniqueKeyComment();
        if(Objects.nonNull(uniqueKeyCommentContext)){
            String content = uniqueKeyCommentContext.uniqueKeyCommentContent().getText();
            Comment comment = new Comment();
            comment.setLimitedQuote(content.substring(0, 1));
            comment.setCommentContent(content.substring(1, content.length() - 1));
            uniqueKey.setComment(comment);
        }
        return uniqueKey;
    }
}
