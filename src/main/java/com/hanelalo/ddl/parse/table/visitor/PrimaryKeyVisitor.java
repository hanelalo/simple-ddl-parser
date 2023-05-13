package com.hanelalo.ddl.parse.table.visitor;

import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
import com.hanelalo.ddl.parse.table.PrimaryKey;

import java.util.Objects;
import java.util.stream.Collectors;

public class PrimaryKeyVisitor extends DdlParserBaseVisitor<PrimaryKey> {

    @Override
    public PrimaryKey visitPrimaryKey(DdlParser.PrimaryKeyContext ctx) {
        PrimaryKey primaryKey = new PrimaryKey();
        DdlParser.IdContext nameContext = ctx.id();
        primaryKey.setName(Objects.nonNull(nameContext) ? nameContext.ID().getText() : null);
        primaryKey.setColumns(ctx.primaryKeyColumn().id().stream().map(id -> id.ID().getText()).collect(Collectors.toList()));
        return primaryKey;
    }
}
