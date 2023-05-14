package com.hanelalo.ddl.parse;

import com.hanelalo.ddl.parse.engine.DdlLexer;
import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.table.listener.TableDdlParserListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

public class ListenerTest {

    @Test
    public void test() {
        DdlLexer ddlLexer = new DdlLexer(CharStreams.fromString("create table t_fans_info\n" +
                "(   id   int primary key auto_increment,\n" +
                "    name text(100) null,\n" +
                "    time datetime default current_timestamp on update current_timestamp,\n" +
                "    primary key pk_id  (id,name),\n" +
                "    unique key  (name),\n" +
                "    key idx_time (time)\n" +
                ");\n" +
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

        listener(parser);
    }

    private void listener(DdlParser parser) {
        TableDdlParserListener listener = new TableDdlParserListener();
        ParseTreeWalker.DEFAULT.walk(listener, parser.parse());
        System.out.println(listener.get());
    }

}
