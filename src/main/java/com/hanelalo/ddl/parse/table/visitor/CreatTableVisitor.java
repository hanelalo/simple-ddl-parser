package com.hanelalo.ddl.parse.table.visitor;

import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
import com.hanelalo.ddl.parse.table.Comment;
import com.hanelalo.ddl.parse.table.Table;

import java.util.Objects;

public class CreatTableVisitor extends DdlParserBaseVisitor<Table> {

    private final ColumnOptionVisitor columnOptionVisitor;
    private final IndexOptionVisitor indexOptionVisitor;
    private final PrimaryKeyVisitor primaryKeyVisitor;
    private final UniqueKeyVisitor uniqueKeyVisitor;

    public CreatTableVisitor(ColumnOptionVisitor columnOptionVisitor, IndexOptionVisitor indexOptionVisitor, PrimaryKeyVisitor primaryKeyVisitor, UniqueKeyVisitor uniqueKeyVisitor) {
        this.columnOptionVisitor = columnOptionVisitor;
        this.indexOptionVisitor = indexOptionVisitor;
        this.primaryKeyVisitor = primaryKeyVisitor;
        this.uniqueKeyVisitor = uniqueKeyVisitor;
    }

    @Override
    public Table visitCreatTable(DdlParser.CreatTableContext ctx) {
        String tableName = ctx.tableName().id().ID().getText();
        Table table = new Table(tableName);
        parseTableOptions(ctx, table);
        parseTableDefinitions(ctx.tableDefinitions(), table);
        return table;
    }

    private void parseTableDefinitions(DdlParser.TableDefinitionsContext tableDefinitionsContext, Table table) {
        tableDefinitionsContext.tableDefinition().forEach(tableDefinitionContext -> {
            if (Objects.nonNull(tableDefinitionContext.columnOption())) {
                table.addColumn(tableDefinitionContext.columnOption().accept(columnOptionVisitor));
                return;
            }
            if (Objects.nonNull(tableDefinitionContext.indexOption())) {
                table.addIndex(tableDefinitionContext.indexOption().accept(indexOptionVisitor));
                return;
            }
            if (Objects.nonNull(tableDefinitionContext.uniqueKey())) {
                table.addUniqueKey(tableDefinitionContext.uniqueKey().accept(uniqueKeyVisitor));
                return;
            }
            if (Objects.nonNull(tableDefinitionContext.primaryKey())) {
                table.populatePrimaryKey(tableDefinitionContext.primaryKey().accept(primaryKeyVisitor));
            }
        });
    }

    private void parseTableOptions(DdlParser.CreatTableContext ctx, Table table) {
        ctx.tableOptions().tableOption().forEach(tableOptionContext -> parseTableOption(tableOptionContext, table));
    }

    private void parseTableOption(DdlParser.TableOptionContext tableOptionContext, Table table) {
        DdlParser.TableCommentContext tableCommentContext = tableOptionContext.tableComment();
        if (Objects.nonNull(tableCommentContext)) {
            Comment comment = new Comment();
            String commentStr = tableCommentContext.tabelCommentContent().getText();
            comment.setLimitedQuote(commentStr.substring(0, 1));
            comment.setCommentContent(commentStr.substring(1, commentStr.length() - 1));
            table.setComment(comment);
        }
        DdlParser.AutoIncrementTableOptionContext autoIncrementTableOptionContext = tableOptionContext.autoIncrementTableOption();
        if (Objects.nonNull(autoIncrementTableOptionContext)) {
            table.setAutoIncrement(Long.parseLong(autoIncrementTableOptionContext.NUMBER().getText()));
        }
    }
}
