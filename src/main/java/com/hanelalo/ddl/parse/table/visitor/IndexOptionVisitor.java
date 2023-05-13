package com.hanelalo.ddl.parse.table.visitor;

import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
import com.hanelalo.ddl.parse.table.Index;

import java.util.Objects;
import java.util.stream.Collectors;

public class IndexOptionVisitor extends DdlParserBaseVisitor<Index> {

    @Override
    public Index visitIndexOption(DdlParser.IndexOptionContext ctx) {
        Index index = new Index();
        DdlParser.IdContext nameContext = ctx.id();
        index.setName(Objects.nonNull(nameContext) ? nameContext.ID().getText() : null);
        index.setColumns(ctx.indexColumns().id().stream().map(id -> id.ID().getText()).collect(Collectors.toList()));
        if (Objects.nonNull(ctx.USING())) {
            index.setUsing("BTREE");
        }
        return index;
    }
}
