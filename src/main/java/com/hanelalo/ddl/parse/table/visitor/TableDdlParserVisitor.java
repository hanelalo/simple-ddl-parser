package com.hanelalo.ddl.parse.table.visitor;

import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
import com.hanelalo.ddl.parse.table.Table;

import java.util.List;
import java.util.stream.Collectors;

public class TableDdlParserVisitor extends DdlParserBaseVisitor<List<Table>> {

    private final CreatTableVisitor creatTableVisitor;

    public TableDdlParserVisitor(CreatTableVisitor creatTableVisitor) {
        this.creatTableVisitor = creatTableVisitor;
    }

    @Override
    public List<Table> visitParse(DdlParser.ParseContext ctx) {
        List<DdlParser.CreatTableContext> creatTableContexts = ctx.creatTable();
        return creatTableContexts.stream().map(creatTableContext -> creatTableContext.accept(creatTableVisitor)).collect(Collectors.toList());
    }

}
