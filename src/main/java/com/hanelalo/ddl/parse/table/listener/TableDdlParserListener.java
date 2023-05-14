package com.hanelalo.ddl.parse.table.listener;

import cn.hutool.core.util.NumberUtil;
import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseListener;
import com.hanelalo.ddl.parse.table.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.stream.Collectors;

public class TableDdlParserListener extends DdlParserBaseListener {

    private final List<Table> list = new ArrayList<>();

    private final Map<String, Table> map = new HashMap<>();

    private TableHolder current;

    public List<Table> get() {
        return list;
    }

    @Override
    public void enterCreatTable(DdlParser.CreatTableContext ctx) {
        String tableName = ctx.tableName().id().ID().getText();
        Table table = map.computeIfAbsent(tableName, Table::new);
        list.add(table);
        current = TableHolder.with(table);
    }

    @Override
    public void enterTabelCommentContent(DdlParser.TabelCommentContentContext ctx) {
        String commentStr = ctx.getText();
        Comment comment = new Comment();
        comment.setLimitedQuote(commentStr.substring(0, 1));
        comment.setCommentContent(commentStr.substring(1, commentStr.length() - 1));
        current.get().setComment(comment);
    }

    @Override
    public void enterAutoIncrementTableOption(DdlParser.AutoIncrementTableOptionContext ctx) {
        current.get().setAutoIncrement(NumberUtil.parseLong(ctx.NUMBER().getText()));
    }

    @Override
    public void enterColumnOption(DdlParser.ColumnOptionContext ctx) {
        String columnName = ctx.columnName().id().ID().getText();
        Column column = new Column();
        column.setName(columnName);
        current.addColumn(column);
    }

    @Override
    public void enterIntType(DdlParser.IntTypeContext ctx) {
        populateColumnType(ctx.INT().getText());
    }

    @Override
    public void enterVarcharType(DdlParser.VarcharTypeContext ctx) {
        populateColumnType(ctx.VARCHAR().getText());
    }

    @Override
    public void enterTextType(DdlParser.TextTypeContext ctx) {
        populateColumnType(ctx.TEXT().getText());
    }

    @Override
    public void enterDatetimeType(DdlParser.DatetimeTypeContext ctx) {
        populateColumnType(ctx.DATETIME().getText());
    }

    @Override
    public void enterDateType(DdlParser.DateTypeContext ctx) {
        populateColumnType(ctx.DATE().getText());
    }

    @Override
    public void enterTimestampType(DdlParser.TimestampTypeContext ctx) {
        populateColumnType(ctx.TIMESTAMP().getText());
    }

    @Override
    public void enterColumnLength(DdlParser.ColumnLengthContext ctx) {
        Column column = current.currentColumn();
        ColumnType columnType = column.getColumnType();
        if (Objects.isNull(columnType)) {
            column.setColumnType(ColumnType.builder().length(NumberUtil.parseLong(ctx.NUMBER().getText())).build());
        } else {
            columnType.setLength(NumberUtil.parseLong(ctx.NUMBER().getText()));
        }
    }

    @Override
    public void enterNullOption(DdlParser.NullOptionContext ctx) {
        if (Objects.isNull(ctx.NOT())) {
            current.currentColumn().setNullable(true);
        }
    }

    @Override
    public void enterPrimaryKeyOption(DdlParser.PrimaryKeyOptionContext ctx) {
        current.currentColumn().setPrimaryKey(true);
    }

    @Override
    public void enterAutoincrementOption(DdlParser.AutoincrementOptionContext ctx) {
        current.currentColumn().setAutoIncrement(true);
    }


    @Override
    public void enterDefaultValue(DdlParser.DefaultValueContext ctx) {
        current.currentColumn().setDefaultValue(ctx.children.stream().map(ParseTree::getText).collect(Collectors.joining(" ")));
    }

    @Override
    public void enterCommentContent(DdlParser.CommentContentContext ctx) {
        String commentStr = ctx.getText();
        Comment comment = new Comment();
        comment.setLimitedQuote(commentStr.substring(0, 1));
        comment.setCommentContent(commentStr.substring(1, commentStr.length() - 1));
        current.currentColumn().setComment(comment);
    }

    @Override
    public void exitColumnOption(DdlParser.ColumnOptionContext ctx) {
        System.out.println("列[" + current.currentColumn().getName() + "]解析完成");
    }

    @Override
    public void enterUniqueKey(DdlParser.UniqueKeyContext ctx) {
        current.addUniqueKey(new UniqueKey());
    }

    @Override
    public void enterUniqueKeyName(DdlParser.UniqueKeyNameContext ctx) {
        current.currentUniqueKey().setName(ctx.id().ID().getText());
    }

    @Override
    public void enterUniqueKeyColumn(DdlParser.UniqueKeyColumnContext ctx) {
        current.currentUniqueKey().setColumns(ctx.id().stream().map(idContext -> idContext.ID().getText()).collect(Collectors.toList()));
    }

    @Override
    public void enterPrimaryKey(DdlParser.PrimaryKeyContext ctx) {
        current.setPrimaryKey(new PrimaryKey());
    }

    @Override
    public void enterPrimaryKeyName(DdlParser.PrimaryKeyNameContext ctx) {
        current.primaryKey().setName(ctx.id().ID().getText());
    }

    @Override
    public void enterPrimaryKeyColumn(DdlParser.PrimaryKeyColumnContext ctx) {
        current.primaryKey().setColumns(ctx.id().stream().map(idContext -> idContext.ID().getText()).collect(Collectors.toList()));
    }

    @Override
    public void enterIndexOption(DdlParser.IndexOptionContext ctx) {
        current.addIndex(new Index());
    }

    @Override
    public void enterIndexName(DdlParser.IndexNameContext ctx) {
        current.currentIndex().setName(ctx.id().ID().getText());
    }

    @Override
    public void enterIndexColumns(DdlParser.IndexColumnsContext ctx) {
        current.currentIndex().setColumns(ctx.id().stream().map(idContext -> idContext.ID().getText()).collect(Collectors.toList()));
    }

    private void populateColumnType(String type) {
        Column column = current.currentColumn();
        ColumnType columnType = column.getColumnType();
        if (Objects.isNull(columnType)) {
            column.setColumnType(ColumnType.builder().type(type).build());
        } else {
            columnType.setType(type);
        }
    }
}
