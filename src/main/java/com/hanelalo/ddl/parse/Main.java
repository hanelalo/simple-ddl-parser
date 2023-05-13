package com.hanelalo.ddl.parse;

import com.hanelalo.ddl.parse.engine.DdlLexer;
import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.table.Table;
import com.hanelalo.ddl.parse.table.visitor.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DdlLexer ddlLexer = new DdlLexer(CharStreams.fromString("create table t_fans_info\n" +
                "(   id   int primary key auto_increment,\n" +
                "    name text(100) null comment '名称',\n" +
                "    time datetime default current_timestamp on update current_timestamp,\n" +
                "    primary key pk_id  (id,name),\n" +
                "    unique key  (name),\n" +
                "    key idx_time (time)\n" +
                ") comment='粉丝表';"));
        CommonTokenStream commonTokenStream = new CommonTokenStream(ddlLexer);
        DdlParser parser = new DdlParser(commonTokenStream);
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
