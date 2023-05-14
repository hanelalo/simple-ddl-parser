package com.hanelalo.ddl.parse;

import com.hanelalo.ddl.parse.engine.DdlLexer;
import com.hanelalo.ddl.parse.engine.DdlParser;
import com.hanelalo.ddl.parse.table.Column;
import com.hanelalo.ddl.parse.table.Table;
import com.hanelalo.ddl.parse.table.listener.TableDdlParserListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListenerTest {

    @Test
    public void test() {
        DdlLexer ddlLexer = new DdlLexer(CharStreams.fromString("create table t_fans_info\n" +
                "(   id   int primary key auto_increment,\n" +
                "    name text(100) not null default 'haha',\n" +
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

        List<Table> tables = listener(parser);

        checkTables(tables);

        System.out.println(tables);
    }

    private void checkTables(List<Table> tables) {
        assertEquals(2, tables.size());
        assertFirstTable(tables.get(0));
        assertSecondTable(tables.get(1));
    }

    private void assertFirstTable(Table table) {
        assertEquals("t_fans_info", table.getTableName());
        assertEquals(9991L, table.getAutoIncrement().longValue());
        assertNotNull(table.getComment());
        assertEquals("测试2", table.getComment().getCommentContent());
        assertEquals("'", table.getComment().getLimitedQuote());


        List<Column> columns = table.getColumns();
        assertEquals(3, columns.size());

        assertEquals("id", columns.get(0).getName());
        assertEquals("int", columns.get(0).getColumnType().getType());
        assertNull(columns.get(0).getColumnType().getLength());
        assertTrue(columns.get(0).isPrimaryKey());
        assertTrue(columns.get(0).isAutoIncrement());
        assertTrue(columns.get(0).isNullable());
        assertNull(columns.get(0).getDefaultValue());
        assertNull(columns.get(0).getComment());

        assertEquals("name", columns.get(1).getName());
        assertEquals("text", columns.get(1).getColumnType().getType());
        assertEquals(100L, columns.get(1).getColumnType().getLength().longValue());
        assertFalse(columns.get(1).isPrimaryKey());
        assertFalse(columns.get(1).isAutoIncrement());
        assertFalse(columns.get(1).isNullable());
        assertEquals("'haha'",columns.get(1).getDefaultValue());
        assertNull(columns.get(1).getComment());

        assertEquals("time", columns.get(2).getName());
        assertEquals("datetime", columns.get(2).getColumnType().getType());
        assertNull(columns.get(2).getColumnType().getLength());
        assertFalse(columns.get(2).isPrimaryKey());
        assertFalse(columns.get(2).isAutoIncrement());
        assertTrue(columns.get(2).isNullable());
        assertEquals("current_timestamp on update current_timestamp",columns.get(2).getDefaultValue());
        assertNotNull(columns.get(2).getComment());
        assertEquals("'",columns.get(2).getComment().getLimitedQuote());
        assertEquals("时间",columns.get(2).getComment().getCommentContent());


        assertNotNull(table.getPrimaryKey());
        assertEquals("pk_id", table.getPrimaryKey().getName());
        assertEquals(2, table.getPrimaryKey().getColumns().size());
        assertEquals("id", table.getPrimaryKey().getColumns().get(0));
        assertEquals("name", table.getPrimaryKey().getColumns().get(1));


        assertEquals(1, table.getUniqueKeys().size());
        assertNull(table.getUniqueKeys().get(0).getName());
        assertEquals(1, table.getUniqueKeys().get(0).getColumns().size());
        assertEquals("name", table.getUniqueKeys().get(0).getColumns().get(0));


        assertEquals(1, table.getIndices().size());
        assertEquals("idx_time",table.getIndices().get(0).getName());
        assertEquals(1, table.getIndices().get(0).getColumns().size());
        assertEquals("time", table.getIndices().get(0).getColumns().get(0));

    }


    private void assertSecondTable(Table table) {
        assertEquals("t_fans_info_1", table.getTableName());
    }

    private List<Table> listener(DdlParser parser) {
        TableDdlParserListener listener = new TableDdlParserListener();
        ParseTreeWalker.DEFAULT.walk(listener, parser.parse());
        return listener.get();
    }

}
