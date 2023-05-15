package com.hanelalo.ddl.parse.table.visitor;

import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
import com.hanelalo.ddl.parse.table.Comment;
import com.hanelalo.ddl.parse.table.Index;

import java.util.Objects;
import java.util.stream.Collectors;

public class IndexOptionVisitor extends DdlParserBaseVisitor<Index> {

    @Override
    public Index visitIndexOption(DdlParser.IndexOptionContext ctx) {
        Index index = new Index();
        DdlParser.IndexNameContext indexNameContext = ctx.indexName();
        if (Objects.nonNull(indexNameContext)) {
            DdlParser.IdContext nameContext = indexNameContext.id();
            index.setName(Objects.nonNull(nameContext) ? nameContext.ID().getText() : null);
        }
        index.setColumns(ctx.indexColumns().id().stream().map(id -> id.ID().getText()).collect(Collectors.toList()));
        if (Objects.nonNull(ctx.USING())) {
            index.setUsing("BTREE");
        }
        DdlParser.IndexCommentContext indexCommentContext = ctx.indexComment();
        if(Objects.nonNull(indexCommentContext)){
            String content = indexCommentContext.indexCommentContent().getText();
            Comment comment = new Comment();
            comment.setLimitedQuote(content.substring(0, 1));
            comment.setCommentContent(content.substring(1, content.length() - 1));
            index.setComment(comment);
        }
        return index;
    }
}
