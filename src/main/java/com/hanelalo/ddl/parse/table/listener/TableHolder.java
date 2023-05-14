package com.hanelalo.ddl.parse.table.listener;

import com.hanelalo.ddl.parse.table.*;

public class TableHolder {

    private final Table table;

    private Column currentColumn;

    private UniqueKey currentUniqueKeu;

    private Index currentIndex;

    public TableHolder(Table table) {
        this.table = table;
    }

    public static TableHolder with(Table table) {
        return new TableHolder(table);
    }

    public Table get() {
        return table;
    }

    public void addColumn(Column column) {
        table.addColumn(column);
        currentColumn = column;
    }

    public Column currentColumn() {
        return currentColumn;
    }

    public void addUniqueKey(UniqueKey uniqueKey) {
        table.addUniqueKey(uniqueKey);
        this.currentUniqueKeu = uniqueKey;
    }

    public UniqueKey currentUniqueKey() {
        return currentUniqueKeu;
    }

    public void setPrimaryKey(PrimaryKey primaryKey) {
        table.setPrimaryKey(primaryKey);
    }

    public PrimaryKey primaryKey() {
        return table.getPrimaryKey();
    }

    public void addIndex(Index index) {
        table.addIndex(index);
        this.currentIndex = index;
    }

    public Index currentIndex() {
        return currentIndex;
    }
}
