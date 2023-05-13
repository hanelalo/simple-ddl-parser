package com.hanelalo.ddl.parse.table.visitor;

import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
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
        return uniqueKey;
    }
}
