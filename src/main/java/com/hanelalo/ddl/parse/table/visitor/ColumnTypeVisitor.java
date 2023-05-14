package com.hanelalo.ddl.parse.table.visitor;

import cn.hutool.core.util.NumberUtil;
import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.engine.DdlParserBaseVisitor;
import com.hanelalo.ddl.parse.table.ColumnType;

public class ColumnTypeVisitor extends DdlParserBaseVisitor<ColumnType> {

    @Override
    public ColumnType visitIntType(DdlParser.IntTypeContext ctx) {
        return ColumnType.builder()
                .type(ctx.INT().getText())
                .length(ctx.columnLength() == null ? null : NumberUtil.parseLong(ctx.columnLength().NUMBER().getText()))
                .unsigned(ctx.UNSIGNED() != null)
                .build();
    }

    @Override
    public ColumnType visitBigintType(DdlParser.BigintTypeContext ctx) {
        return ColumnType.builder()
                .type(ctx.BIGINT().getText())
                .length(ctx.columnLength() == null ? null : NumberUtil.parseLong(ctx.columnLength().NUMBER().getText()))
                .unsigned(ctx.UNSIGNED() != null)
                .build();
    }

    @Override
    public ColumnType visitVarcharType(DdlParser.VarcharTypeContext ctx) {
        return ColumnType.builder()
                .type(ctx.VARCHAR().getText())
                .length(ctx.columnLength() == null ? null : NumberUtil.parseLong(ctx.columnLength().NUMBER().getText()))
                .build();
    }

    @Override
    public ColumnType visitTextType(DdlParser.TextTypeContext ctx) {
        return ColumnType.builder()
                .type(ctx.TEXT().getText())
                .length(ctx.columnLength() == null ? null : NumberUtil.parseLong(ctx.columnLength().NUMBER().getText()))
                .build();
    }

    @Override
    public ColumnType visitLongtextType(DdlParser.LongtextTypeContext ctx) {
        return ColumnType.builder()
                .type(ctx.LONGTEXT().getText())
                .length(ctx.columnLength() == null ? null : NumberUtil.parseLong(ctx.columnLength().NUMBER().getText()))
                .build();
    }

    @Override
    public ColumnType visitDateType(DdlParser.DateTypeContext ctx) {
        return ColumnType.builder()
                .type(ctx.DATE().getText())
                .build();
    }

    @Override
    public ColumnType visitDatetimeType(DdlParser.DatetimeTypeContext ctx) {
        return ColumnType.builder()
                .type(ctx.DATETIME().getText())
                .build();
    }

    @Override
    public ColumnType visitTimestampType(DdlParser.TimestampTypeContext ctx) {
        return ColumnType.builder()
                .type(ctx.TIMESTAMP().getText())
                .build();
    }

}
