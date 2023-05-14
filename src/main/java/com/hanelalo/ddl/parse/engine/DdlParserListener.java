// Generated from /Users/hanelalo/develop/simple-ddl-parser/src/main/resources/DdlParser.g4 by ANTLR 4.12.0
package com.hanelalo.ddl.parse.engine;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DdlParser}.
 */
public interface DdlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DdlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DdlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DdlParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#creatTable}.
	 * @param ctx the parse tree
	 */
	void enterCreatTable(DdlParser.CreatTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#creatTable}.
	 * @param ctx the parse tree
	 */
	void exitCreatTable(DdlParser.CreatTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DdlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DdlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#tableDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterTableDefinitions(DdlParser.TableDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#tableDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitTableDefinitions(DdlParser.TableDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTableDefinition(DdlParser.TableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTableDefinition(DdlParser.TableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#columnOption}.
	 * @param ctx the parse tree
	 */
	void enterColumnOption(DdlParser.ColumnOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#columnOption}.
	 * @param ctx the parse tree
	 */
	void exitColumnOption(DdlParser.ColumnOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(DdlParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(DdlParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#columnType}.
	 * @param ctx the parse tree
	 */
	void enterColumnType(DdlParser.ColumnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#columnType}.
	 * @param ctx the parse tree
	 */
	void exitColumnType(DdlParser.ColumnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(DdlParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(DdlParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#textType}.
	 * @param ctx the parse tree
	 */
	void enterTextType(DdlParser.TextTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#textType}.
	 * @param ctx the parse tree
	 */
	void exitTextType(DdlParser.TextTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#columnLength}.
	 * @param ctx the parse tree
	 */
	void enterColumnLength(DdlParser.ColumnLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#columnLength}.
	 * @param ctx the parse tree
	 */
	void exitColumnLength(DdlParser.ColumnLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#varcharType}.
	 * @param ctx the parse tree
	 */
	void enterVarcharType(DdlParser.VarcharTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#varcharType}.
	 * @param ctx the parse tree
	 */
	void exitVarcharType(DdlParser.VarcharTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#dateType}.
	 * @param ctx the parse tree
	 */
	void enterDateType(DdlParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#dateType}.
	 * @param ctx the parse tree
	 */
	void exitDateType(DdlParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#datetimeType}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeType(DdlParser.DatetimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#datetimeType}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeType(DdlParser.DatetimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#timestampType}.
	 * @param ctx the parse tree
	 */
	void enterTimestampType(DdlParser.TimestampTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#timestampType}.
	 * @param ctx the parse tree
	 */
	void exitTimestampType(DdlParser.TimestampTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(DdlParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(DdlParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#commentContent}.
	 * @param ctx the parse tree
	 */
	void enterCommentContent(DdlParser.CommentContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#commentContent}.
	 * @param ctx the parse tree
	 */
	void exitCommentContent(DdlParser.CommentContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#columnAttrOptions}.
	 * @param ctx the parse tree
	 */
	void enterColumnAttrOptions(DdlParser.ColumnAttrOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#columnAttrOptions}.
	 * @param ctx the parse tree
	 */
	void exitColumnAttrOptions(DdlParser.ColumnAttrOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#columnAttrOption}.
	 * @param ctx the parse tree
	 */
	void enterColumnAttrOption(DdlParser.ColumnAttrOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#columnAttrOption}.
	 * @param ctx the parse tree
	 */
	void exitColumnAttrOption(DdlParser.ColumnAttrOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyOption(DdlParser.PrimaryKeyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyOption(DdlParser.PrimaryKeyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#autoincrementOption}.
	 * @param ctx the parse tree
	 */
	void enterAutoincrementOption(DdlParser.AutoincrementOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#autoincrementOption}.
	 * @param ctx the parse tree
	 */
	void exitAutoincrementOption(DdlParser.AutoincrementOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#nullOption}.
	 * @param ctx the parse tree
	 */
	void enterNullOption(DdlParser.NullOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#nullOption}.
	 * @param ctx the parse tree
	 */
	void exitNullOption(DdlParser.NullOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#defaultOption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultOption(DdlParser.DefaultOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#defaultOption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultOption(DdlParser.DefaultOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(DdlParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(DdlParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(DdlParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(DdlParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(DdlParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(DdlParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#indexColumns}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumns(DdlParser.IndexColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#indexColumns}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumns(DdlParser.IndexColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(DdlParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(DdlParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#primaryKeyName}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyName(DdlParser.PrimaryKeyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#primaryKeyName}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyName(DdlParser.PrimaryKeyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#primaryKeyColumn}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumn(DdlParser.PrimaryKeyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#primaryKeyColumn}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumn(DdlParser.PrimaryKeyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#uniqueKey}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKey(DdlParser.UniqueKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#uniqueKey}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKey(DdlParser.UniqueKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#uniqueKeyName}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyName(DdlParser.UniqueKeyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#uniqueKeyName}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyName(DdlParser.UniqueKeyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#uniqueKeyColumn}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyColumn(DdlParser.UniqueKeyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#uniqueKeyColumn}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyColumn(DdlParser.UniqueKeyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions(DdlParser.TableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions(DdlParser.TableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOption(DdlParser.TableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOption(DdlParser.TableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void enterTableComment(DdlParser.TableCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void exitTableComment(DdlParser.TableCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#tabelCommentContent}.
	 * @param ctx the parse tree
	 */
	void enterTabelCommentContent(DdlParser.TabelCommentContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#tabelCommentContent}.
	 * @param ctx the parse tree
	 */
	void exitTabelCommentContent(DdlParser.TabelCommentContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#autoIncrementTableOption}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrementTableOption(DdlParser.AutoIncrementTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#autoIncrementTableOption}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrementTableOption(DdlParser.AutoIncrementTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DdlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(DdlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DdlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(DdlParser.IdContext ctx);
}