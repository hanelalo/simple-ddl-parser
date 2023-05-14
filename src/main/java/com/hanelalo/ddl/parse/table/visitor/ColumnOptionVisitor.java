package com.hanelalo.ddl.parse.table.visitor;

import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
import com.hanelalo.ddl.parse.table.Column;
import com.hanelalo.ddl.parse.table.Comment;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Objects;
import java.util.stream.Collectors;

public class ColumnOptionVisitor extends DdlParserBaseVisitor<Column> {

    private final ColumnTypeVisitor columnTypeVisitor;

    public ColumnOptionVisitor(ColumnTypeVisitor columnTypeVisitor) {
        this.columnTypeVisitor = columnTypeVisitor;
    }

    @Override
    public Column visitColumnOption(DdlParser.ColumnOptionContext ctx) {
        Column column = new Column();
        column.setName(ctx.columnName().id().ID().getText());

        parseComment(ctx, column);

        parseColumnType(ctx.columnType(), column);

        parseColumnOptions(ctx.columnAttrOptions(), column);

        return column;
    }

    private void parseComment(DdlParser.ColumnOptionContext ctx, Column column) {
        DdlParser.CommentContext commentContext = ctx.comment();
        if(Objects.isNull(commentContext)){
            return;
        }
        String commentStr = commentContext.commentContent().getText();
        Comment comment = new Comment();
        comment.setLimitedQuote(commentStr.substring(0, 1));
        comment.setCommentContent(commentStr.substring(1, commentStr.length() - 1));
        column.setComment(comment);
    }

    private void parseColumnOptions(DdlParser.ColumnAttrOptionsContext columnAttrOptionsContext, Column column) {
        for (DdlParser.ColumnAttrOptionContext columnAttrOptionContext : columnAttrOptionsContext.columnAttrOption()) {
            if (Objects.nonNull(columnAttrOptionContext.defaultOption())) {
                column.setDefaultValue(columnAttrOptionContext.defaultOption().defaultValue().children.stream()
                        .map(ParseTree::getText).collect(Collectors.joining(" ")));
                continue;
            }
            if (Objects.nonNull(columnAttrOptionContext.autoincrementOption())) {
                column.setAutoIncrement(true);
                continue;
            }
            if (Objects.nonNull(columnAttrOptionContext.nullOption()) && Objects.nonNull(columnAttrOptionContext.nullOption().NOT())) {
                column.setNullable(false);
                continue;
            }
            if (Objects.nonNull(columnAttrOptionContext.primaryKeyOption())) {
                column.setPrimaryKey(true);
            }
        }
    }

    private void parseColumnType(DdlParser.ColumnTypeContext columnTypeContext, Column column) {
        column.setColumnType(columnTypeContext.accept(columnTypeVisitor));
    }

}
