// Generated from /Users/hanelalo/develop/simple-ddl-parser/src/main/resources/DdlParser.g4 by ANTLR 4.12.0
package com.hanelalo.ddl.parse.engine;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DdlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DdlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DdlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(DdlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#creatTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatTable(DdlParser.CreatTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DdlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#tableDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableDefinitions(DdlParser.TableDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#tableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableDefinition(DdlParser.TableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#columnOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOption(DdlParser.ColumnOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DdlParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#columnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnType(DdlParser.ColumnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#intType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(DdlParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#bigintType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigintType(DdlParser.BigintTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#textType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextType(DdlParser.TextTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#longtextType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongtextType(DdlParser.LongtextTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#columnLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnLength(DdlParser.ColumnLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#varcharType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarcharType(DdlParser.VarcharTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#dateType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateType(DdlParser.DateTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#datetimeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeType(DdlParser.DatetimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#timestampType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampType(DdlParser.TimestampTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(DdlParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#commentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentContent(DdlParser.CommentContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#columnAttrOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAttrOptions(DdlParser.ColumnAttrOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#columnAttrOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAttrOption(DdlParser.ColumnAttrOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#uniqueColumnAttrOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueColumnAttrOption(DdlParser.UniqueColumnAttrOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyOption(DdlParser.PrimaryKeyOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#autoincrementOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoincrementOption(DdlParser.AutoincrementOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#nullOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullOption(DdlParser.NullOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#defaultOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultOption(DdlParser.DefaultOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(DdlParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#indexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOption(DdlParser.IndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(DdlParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#indexColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumns(DdlParser.IndexColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(DdlParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#primaryKeyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyName(DdlParser.PrimaryKeyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#primaryKeyColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyColumn(DdlParser.PrimaryKeyColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#uniqueKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKey(DdlParser.UniqueKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#uniqueKeyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKeyName(DdlParser.UniqueKeyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#uniqueKeyColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKeyColumn(DdlParser.UniqueKeyColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#tableOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptions(DdlParser.TableOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOption(DdlParser.TableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#tableComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableComment(DdlParser.TableCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#tabelCommentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabelCommentContent(DdlParser.TabelCommentContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#autoIncrementTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoIncrementTableOption(DdlParser.AutoIncrementTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DdlParser.IdContext ctx);
}