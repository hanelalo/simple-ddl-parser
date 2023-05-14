package com.hanelalo.ddl.parse;

import com.hanelalo.ddl.parse.engine.DdlLexer;
import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.table.Table;
import com.hanelalo.ddl.parse.table.visitor.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.util.List;

public class VisitorTest {

    @Test
    public void test() {
        DdlLexer ddlLexer = new DdlLexer(CharStreams.fromString("create table t_fans_info\n" +
                "(   id   int primary key auto_increment,\n" +
                "    name text(100) null default 'haha',\n" +
                "    time datetime default current_timestamp on update current_timestamp comment '时间',\n" +
                "    primary key pk_id  (id,name),\n" +
                "    unique key  (name),\n" +
                "    key idx_time (time)\n" +
                ") auto_increment 9991 comment '测试2';\n" +
                "create table t_fans_info_1\n" +
                "(   id   int primary key auto_increment,\n" +
                "    name text(100) null,\n" +
                "    time datetime default current_timestamp on update current_timestamp,\n" +
                "    primary key pk_id  (id,name),\n" +
                "    unique key  (name,time),\n" +
                "    key idx_time (time)\n" +
                ") comment='测试1';"));
        CommonTokenStream commonTokenStream = new CommonTokenStream(ddlLexer);
        DdlParser parser = new DdlParser(commonTokenStream);
        visitor(parser);
    }

    private void visitor(DdlParser parser) {
        ColumnTypeVisitor columnTypeVisitor = new ColumnTypeVisitor();
        ColumnOptionVisitor columnOptionVisitor = new ColumnOptionVisitor(columnTypeVisitor);
        IndexOptionVisitor indexOptionVisitor = new IndexOptionVisitor();
        PrimaryKeyVisitor primaryKeyVisitor = new PrimaryKeyVisitor();
        UniqueKeyVisitor uniqueKeyVisitor = new UniqueKeyVisitor();
        CreatTableVisitor creatTableVisitor = new CreatTableVisitor(columnOptionVisitor, indexOptionVisitor, primaryKeyVisitor, uniqueKeyVisitor);
        TableDdlParserVisitor tableDdlParserVisitor = new TableDdlParserVisitor(creatTableVisitor);
        List<Table> tables = tableDdlParserVisitor.visit(parser.parse());
        System.out.println(tables);
    }

}
