# simple-ddl-parser

一个基于 antlr4 实现的简单的 ddl 语句解析器，目前只支持 creat table 的操作。

## antlr4

antlr4: https://www.antlr.org/

antlr4 是一个强大的语法分析器生成工具。通过编写 g4 格式的文件，再转换成目标语言的代码，比如转成 Java、Python。

antlr4 提供了监听器（Listener）和访问器（Visitor）两种方式让开发者对解析过程进行控制。

## 访问器使用

```java
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

```