// Generated from /Users/hanelalo/develop/simple-ddl-parser/src/main/resources/DdlParser.g4 by ANTLR 4.12.0
package com.hanelalo.ddl.parse.engine;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, CREATE=2, TABLE=3, KEY=4, INT=5, VARCHAR=6, COMMENT=7, 
		PRIMARY=8, UNIQUE=9, EQUALS=10, NOT=11, NULL=12, DEFAULT=13, ON=14, BACK_QUOTE=15, 
		UPDATE=16, CURRENT_TIMESTAMP=17, TEXT=18, DATE=19, DATETIME=20, TIMESTAMP=21, 
		AUTO_INCRMENT=22, USING=23, BTREE=24, UNSIGNED=25, BIGINT=26, LONGTEXT=27, 
		ENGINE=28, NUMBER=29, ID=30, WS=31, LEFT_BRACKETS=32, RIGHT_BRACKETS=33, 
		SEMICOLON=34, COMMA=35, ANY_STRING=36;
	public static final int
		RULE_parse = 0, RULE_creatTable = 1, RULE_tableName = 2, RULE_tableDefinitions = 3, 
		RULE_tableDefinition = 4, RULE_columnOption = 5, RULE_columnName = 6, 
		RULE_columnType = 7, RULE_intType = 8, RULE_bigintType = 9, RULE_textType = 10, 
		RULE_longtextType = 11, RULE_columnLength = 12, RULE_varcharType = 13, 
		RULE_dateType = 14, RULE_datetimeType = 15, RULE_timestampType = 16, RULE_comment = 17, 
		RULE_commentContent = 18, RULE_columnAttrOptions = 19, RULE_columnAttrOption = 20, 
		RULE_uniqueColumnAttrOption = 21, RULE_primaryKeyOption = 22, RULE_autoincrementOption = 23, 
		RULE_nullOption = 24, RULE_defaultOption = 25, RULE_defaultValue = 26, 
		RULE_indexOption = 27, RULE_indexComment = 28, RULE_indexCommentContent = 29, 
		RULE_indexName = 30, RULE_indexColumns = 31, RULE_primaryKey = 32, RULE_primaryKeyComment = 33, 
		RULE_primaryKeyCommentContent = 34, RULE_primaryKeyName = 35, RULE_primaryKeyColumn = 36, 
		RULE_uniqueKey = 37, RULE_uniqueKeyComment = 38, RULE_uniqueKeyCommentContent = 39, 
		RULE_uniqueKeyName = 40, RULE_uniqueKeyColumn = 41, RULE_tableOptions = 42, 
		RULE_tableOption = 43, RULE_tableComment = 44, RULE_tabelCommentContent = 45, 
		RULE_autoIncrementTableOption = 46, RULE_tableEngineOption = 47, RULE_engineName = 48, 
		RULE_id = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "creatTable", "tableName", "tableDefinitions", "tableDefinition", 
			"columnOption", "columnName", "columnType", "intType", "bigintType", 
			"textType", "longtextType", "columnLength", "varcharType", "dateType", 
			"datetimeType", "timestampType", "comment", "commentContent", "columnAttrOptions", 
			"columnAttrOption", "uniqueColumnAttrOption", "primaryKeyOption", "autoincrementOption", 
			"nullOption", "defaultOption", "defaultValue", "indexOption", "indexComment", 
			"indexCommentContent", "indexName", "indexColumns", "primaryKey", "primaryKeyComment", 
			"primaryKeyCommentContent", "primaryKeyName", "primaryKeyColumn", "uniqueKey", 
			"uniqueKeyComment", "uniqueKeyCommentContent", "uniqueKeyName", "uniqueKeyColumn", 
			"tableOptions", "tableOption", "tableComment", "tabelCommentContent", 
			"autoIncrementTableOption", "tableEngineOption", "engineName", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'create'", "'table'", "'key'", "'int'", "'varchar'", "'comment'", 
			"'primary'", "'unique'", "'='", "'not'", "'null'", "'default'", "'on'", 
			"'`'", "'update'", "'current_timestamp'", "'text'", "'date'", "'datetime'", 
			"'timestamp'", "'auto_increment'", "'using'", "'btree'", "'unsigned'", 
			"'bigint'", "'longtext'", "'engine'", null, null, null, "'('", "')'", 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "CREATE", "TABLE", "KEY", "INT", "VARCHAR", "COMMENT", 
			"PRIMARY", "UNIQUE", "EQUALS", "NOT", "NULL", "DEFAULT", "ON", "BACK_QUOTE", 
			"UPDATE", "CURRENT_TIMESTAMP", "TEXT", "DATE", "DATETIME", "TIMESTAMP", 
			"AUTO_INCRMENT", "USING", "BTREE", "UNSIGNED", "BIGINT", "LONGTEXT", 
			"ENGINE", "NUMBER", "ID", "WS", "LEFT_BRACKETS", "RIGHT_BRACKETS", "SEMICOLON", 
			"COMMA", "ANY_STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DdlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DdlParser.EOF, 0); }
		public List<CreatTableContext> creatTable() {
			return getRuleContexts(CreatTableContext.class);
		}
		public CreatTableContext creatTable(int i) {
			return getRuleContext(CreatTableContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CREATE) {
				{
				{
				setState(100);
				creatTable();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DdlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DdlParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LEFT_BRACKETS() { return getToken(DdlParser.LEFT_BRACKETS, 0); }
		public TableDefinitionsContext tableDefinitions() {
			return getRuleContext(TableDefinitionsContext.class,0);
		}
		public TerminalNode RIGHT_BRACKETS() { return getToken(DdlParser.RIGHT_BRACKETS, 0); }
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DdlParser.SEMICOLON, 0); }
		public CreatTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creatTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterCreatTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitCreatTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitCreatTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatTableContext creatTable() throws RecognitionException {
		CreatTableContext _localctx = new CreatTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_creatTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CREATE);
			setState(109);
			match(TABLE);
			setState(110);
			tableName();
			setState(111);
			match(LEFT_BRACKETS);
			setState(112);
			tableDefinitions();
			setState(113);
			match(RIGHT_BRACKETS);
			setState(114);
			tableOptions();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(115);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableDefinitionsContext extends ParserRuleContext {
		public List<TableDefinitionContext> tableDefinition() {
			return getRuleContexts(TableDefinitionContext.class);
		}
		public TableDefinitionContext tableDefinition(int i) {
			return getRuleContext(TableDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DdlParser.COMMA, i);
		}
		public TableDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTableDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTableDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTableDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableDefinitionsContext tableDefinitions() throws RecognitionException {
		TableDefinitionsContext _localctx = new TableDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			tableDefinition();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				tableDefinition();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableDefinitionContext extends ParserRuleContext {
		public ColumnOptionContext columnOption() {
			return getRuleContext(ColumnOptionContext.class,0);
		}
		public IndexOptionContext indexOption() {
			return getRuleContext(IndexOptionContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public UniqueKeyContext uniqueKey() {
			return getRuleContext(UniqueKeyContext.class,0);
		}
		public TableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableDefinitionContext tableDefinition() throws RecognitionException {
		TableDefinitionContext _localctx = new TableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableDefinition);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACK_QUOTE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				columnOption();
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				indexOption();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				uniqueKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnOptionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public ColumnAttrOptionsContext columnAttrOptions() {
			return getRuleContext(ColumnAttrOptionsContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ColumnOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterColumnOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitColumnOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitColumnOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnOptionContext columnOption() throws RecognitionException {
		ColumnOptionContext _localctx = new ColumnOptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			columnName();
			setState(135);
			columnType();
			setState(136);
			columnAttrOptions();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(137);
				comment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnTypeContext extends ParserRuleContext {
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public BigintTypeContext bigintType() {
			return getRuleContext(BigintTypeContext.class,0);
		}
		public VarcharTypeContext varcharType() {
			return getRuleContext(VarcharTypeContext.class,0);
		}
		public TextTypeContext textType() {
			return getRuleContext(TextTypeContext.class,0);
		}
		public LongtextTypeContext longtextType() {
			return getRuleContext(LongtextTypeContext.class,0);
		}
		public DateTypeContext dateType() {
			return getRuleContext(DateTypeContext.class,0);
		}
		public DatetimeTypeContext datetimeType() {
			return getRuleContext(DatetimeTypeContext.class,0);
		}
		public TimestampTypeContext timestampType() {
			return getRuleContext(TimestampTypeContext.class,0);
		}
		public ColumnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterColumnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitColumnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitColumnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeContext columnType() throws RecognitionException {
		ColumnTypeContext _localctx = new ColumnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnType);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				intType();
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				bigintType();
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				varcharType();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				textType();
				}
				break;
			case LONGTEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				longtextType();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				dateType();
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				datetimeType();
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 8);
				{
				setState(149);
				timestampType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DdlParser.INT, 0); }
		public TerminalNode UNSIGNED() { return getToken(DdlParser.UNSIGNED, 0); }
		public TerminalNode LEFT_BRACKETS() { return getToken(DdlParser.LEFT_BRACKETS, 0); }
		public ColumnLengthContext columnLength() {
			return getRuleContext(ColumnLengthContext.class,0);
		}
		public TerminalNode RIGHT_BRACKETS() { return getToken(DdlParser.RIGHT_BRACKETS, 0); }
		public IntTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntTypeContext intType() throws RecognitionException {
		IntTypeContext _localctx = new IntTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(152);
				match(INT);
				}
				break;
			case 2:
				{
				{
				setState(153);
				match(INT);
				setState(154);
				match(LEFT_BRACKETS);
				setState(155);
				columnLength();
				setState(156);
				match(RIGHT_BRACKETS);
				}
				}
				break;
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNSIGNED) {
				{
				setState(160);
				match(UNSIGNED);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BigintTypeContext extends ParserRuleContext {
		public TerminalNode BIGINT() { return getToken(DdlParser.BIGINT, 0); }
		public TerminalNode UNSIGNED() { return getToken(DdlParser.UNSIGNED, 0); }
		public TerminalNode LEFT_BRACKETS() { return getToken(DdlParser.LEFT_BRACKETS, 0); }
		public ColumnLengthContext columnLength() {
			return getRuleContext(ColumnLengthContext.class,0);
		}
		public TerminalNode RIGHT_BRACKETS() { return getToken(DdlParser.RIGHT_BRACKETS, 0); }
		public BigintTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigintType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterBigintType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitBigintType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitBigintType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BigintTypeContext bigintType() throws RecognitionException {
		BigintTypeContext _localctx = new BigintTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bigintType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(163);
				match(BIGINT);
				}
				break;
			case 2:
				{
				{
				setState(164);
				match(BIGINT);
				setState(165);
				match(LEFT_BRACKETS);
				setState(166);
				columnLength();
				setState(167);
				match(RIGHT_BRACKETS);
				}
				}
				break;
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNSIGNED) {
				{
				setState(171);
				match(UNSIGNED);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextTypeContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DdlParser.TEXT, 0); }
		public TerminalNode LEFT_BRACKETS() { return getToken(DdlParser.LEFT_BRACKETS, 0); }
		public ColumnLengthContext columnLength() {
			return getRuleContext(ColumnLengthContext.class,0);
		}
		public TerminalNode RIGHT_BRACKETS() { return getToken(DdlParser.RIGHT_BRACKETS, 0); }
		public TextTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTextType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTextType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextTypeContext textType() throws RecognitionException {
		TextTypeContext _localctx = new TextTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_textType);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(175);
				match(TEXT);
				setState(176);
				match(LEFT_BRACKETS);
				setState(177);
				columnLength();
				setState(178);
				match(RIGHT_BRACKETS);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LongtextTypeContext extends ParserRuleContext {
		public TerminalNode LONGTEXT() { return getToken(DdlParser.LONGTEXT, 0); }
		public TerminalNode LEFT_BRACKETS() { return getToken(DdlParser.LEFT_BRACKETS, 0); }
		public ColumnLengthContext columnLength() {
			return getRuleContext(ColumnLengthContext.class,0);
		}
		public TerminalNode RIGHT_BRACKETS() { return getToken(DdlParser.RIGHT_BRACKETS, 0); }
		public LongtextTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longtextType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterLongtextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitLongtextType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitLongtextType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongtextTypeContext longtextType() throws RecognitionException {
		LongtextTypeContext _localctx = new LongtextTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_longtextType);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(LONGTEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(183);
				match(LONGTEXT);
				setState(184);
				match(LEFT_BRACKETS);
				setState(185);
				columnLength();
				setState(186);
				match(RIGHT_BRACKETS);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnLengthContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DdlParser.NUMBER, 0); }
		public ColumnLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterColumnLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitColumnLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitColumnLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnLengthContext columnLength() throws RecognitionException {
		ColumnLengthContext _localctx = new ColumnLengthContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_columnLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarcharTypeContext extends ParserRuleContext {
		public TerminalNode VARCHAR() { return getToken(DdlParser.VARCHAR, 0); }
		public TerminalNode LEFT_BRACKETS() { return getToken(DdlParser.LEFT_BRACKETS, 0); }
		public ColumnLengthContext columnLength() {
			return getRuleContext(ColumnLengthContext.class,0);
		}
		public TerminalNode RIGHT_BRACKETS() { return getToken(DdlParser.RIGHT_BRACKETS, 0); }
		public VarcharTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varcharType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterVarcharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitVarcharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitVarcharType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarcharTypeContext varcharType() throws RecognitionException {
		VarcharTypeContext _localctx = new VarcharTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varcharType);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(VARCHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(193);
				match(VARCHAR);
				setState(194);
				match(LEFT_BRACKETS);
				setState(195);
				columnLength();
				setState(196);
				match(RIGHT_BRACKETS);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateTypeContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(DdlParser.DATE, 0); }
		public DateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitDateType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitDateType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTypeContext dateType() throws RecognitionException {
		DateTypeContext _localctx = new DateTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dateType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatetimeTypeContext extends ParserRuleContext {
		public TerminalNode DATETIME() { return getToken(DdlParser.DATETIME, 0); }
		public DatetimeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterDatetimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitDatetimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitDatetimeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeTypeContext datetimeType() throws RecognitionException {
		DatetimeTypeContext _localctx = new DatetimeTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_datetimeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(DATETIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimestampTypeContext extends ParserRuleContext {
		public TerminalNode TIMESTAMP() { return getToken(DdlParser.TIMESTAMP, 0); }
		public TimestampTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestampType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTimestampType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTimestampType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTimestampType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampTypeContext timestampType() throws RecognitionException {
		TimestampTypeContext _localctx = new TimestampTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_timestampType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TIMESTAMP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DdlParser.COMMENT, 0); }
		public CommentContentContext commentContent() {
			return getRuleContext(CommentContentContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(COMMENT);
			setState(207);
			commentContent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContentContext extends ParserRuleContext {
		public TerminalNode ANY_STRING() { return getToken(DdlParser.ANY_STRING, 0); }
		public CommentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterCommentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitCommentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitCommentContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContentContext commentContent() throws RecognitionException {
		CommentContentContext _localctx = new CommentContentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_commentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ANY_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnAttrOptionsContext extends ParserRuleContext {
		public List<ColumnAttrOptionContext> columnAttrOption() {
			return getRuleContexts(ColumnAttrOptionContext.class);
		}
		public ColumnAttrOptionContext columnAttrOption(int i) {
			return getRuleContext(ColumnAttrOptionContext.class,i);
		}
		public ColumnAttrOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAttrOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterColumnAttrOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitColumnAttrOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitColumnAttrOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAttrOptionsContext columnAttrOptions() throws RecognitionException {
		ColumnAttrOptionsContext _localctx = new ColumnAttrOptionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnAttrOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4209408L) != 0)) {
				{
				{
				setState(211);
				columnAttrOption();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnAttrOptionContext extends ParserRuleContext {
		public PrimaryKeyOptionContext primaryKeyOption() {
			return getRuleContext(PrimaryKeyOptionContext.class,0);
		}
		public AutoincrementOptionContext autoincrementOption() {
			return getRuleContext(AutoincrementOptionContext.class,0);
		}
		public UniqueColumnAttrOptionContext uniqueColumnAttrOption() {
			return getRuleContext(UniqueColumnAttrOptionContext.class,0);
		}
		public NullOptionContext nullOption() {
			return getRuleContext(NullOptionContext.class,0);
		}
		public DefaultOptionContext defaultOption() {
			return getRuleContext(DefaultOptionContext.class,0);
		}
		public ColumnAttrOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAttrOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterColumnAttrOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitColumnAttrOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitColumnAttrOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAttrOptionContext columnAttrOption() throws RecognitionException {
		ColumnAttrOptionContext _localctx = new ColumnAttrOptionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_columnAttrOption);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				primaryKeyOption();
				}
				break;
			case AUTO_INCRMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				autoincrementOption();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				uniqueColumnAttrOption();
				}
				break;
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				nullOption();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				defaultOption();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueColumnAttrOptionContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(DdlParser.UNIQUE, 0); }
		public UniqueColumnAttrOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueColumnAttrOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterUniqueColumnAttrOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitUniqueColumnAttrOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitUniqueColumnAttrOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueColumnAttrOptionContext uniqueColumnAttrOption() throws RecognitionException {
		UniqueColumnAttrOptionContext _localctx = new UniqueColumnAttrOptionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_uniqueColumnAttrOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(UNIQUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyOptionContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(DdlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(DdlParser.KEY, 0); }
		public PrimaryKeyOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterPrimaryKeyOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitPrimaryKeyOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitPrimaryKeyOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyOptionContext primaryKeyOption() throws RecognitionException {
		PrimaryKeyOptionContext _localctx = new PrimaryKeyOptionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primaryKeyOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(PRIMARY);
			setState(227);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AutoincrementOptionContext extends ParserRuleContext {
		public TerminalNode AUTO_INCRMENT() { return getToken(DdlParser.AUTO_INCRMENT, 0); }
		public AutoincrementOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoincrementOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterAutoincrementOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitAutoincrementOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitAutoincrementOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoincrementOptionContext autoincrementOption() throws RecognitionException {
		AutoincrementOptionContext _localctx = new AutoincrementOptionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_autoincrementOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(AUTO_INCRMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullOptionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(DdlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(DdlParser.NOT, 0); }
		public NullOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterNullOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitNullOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitNullOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullOptionContext nullOption() throws RecognitionException {
		NullOptionContext _localctx = new NullOptionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nullOption);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(NULL);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(NOT);
				setState(233);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultOptionContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(DdlParser.DEFAULT, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public DefaultOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterDefaultOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitDefaultOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitDefaultOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultOptionContext defaultOption() throws RecognitionException {
		DefaultOptionContext _localctx = new DefaultOptionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_defaultOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(DEFAULT);
			setState(237);
			defaultValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode ANY_STRING() { return getToken(DdlParser.ANY_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DdlParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(DdlParser.NULL, 0); }
		public List<TerminalNode> CURRENT_TIMESTAMP() { return getTokens(DdlParser.CURRENT_TIMESTAMP); }
		public TerminalNode CURRENT_TIMESTAMP(int i) {
			return getToken(DdlParser.CURRENT_TIMESTAMP, i);
		}
		public TerminalNode ON() { return getToken(DdlParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(DdlParser.UPDATE, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_defaultValue);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(ANY_STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(NUMBER);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(NULL);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(242);
				match(CURRENT_TIMESTAMP);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(243);
					match(ON);
					setState(244);
					match(UPDATE);
					setState(245);
					match(CURRENT_TIMESTAMP);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexOptionContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(DdlParser.KEY, 0); }
		public TerminalNode LEFT_BRACKETS() { return getToken(DdlParser.LEFT_BRACKETS, 0); }
		public IndexColumnsContext indexColumns() {
			return getRuleContext(IndexColumnsContext.class,0);
		}
		public TerminalNode RIGHT_BRACKETS() { return getToken(DdlParser.RIGHT_BRACKETS, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode USING() { return getToken(DdlParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(DdlParser.BTREE, 0); }
		public IndexCommentContext indexComment() {
			return getRuleContext(IndexCommentContext.class,0);
		}
		public IndexOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterIndexOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitIndexOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitIndexOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOptionContext indexOption() throws RecognitionException {
		IndexOptionContext _localctx = new IndexOptionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_indexOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(KEY);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACK_QUOTE || _la==ID) {
				{
				setState(251);
				indexName();
				}
			}

			setState(254);
			match(LEFT_BRACKETS);
			setState(255);
			indexColumns();
			setState(256);
			match(RIGHT_BRACKETS);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(257);
				match(USING);
				setState(258);
				match(BTREE);
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(261);
				indexComment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexCommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DdlParser.COMMENT, 0); }
		public IndexCommentContentContext indexCommentContent() {
			return getRuleContext(IndexCommentContentContext.class,0);
		}
		public IndexCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterIndexComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitIndexComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitIndexComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexCommentContext indexComment() throws RecognitionException {
		IndexCommentContext _localctx = new IndexCommentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_indexComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(COMMENT);
			setState(265);
			indexCommentContent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexCommentContentContext extends ParserRuleContext {
		public TerminalNode ANY_STRING() { return getToken(DdlParser.ANY_STRING, 0); }
		public IndexCommentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexCommentContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterIndexCommentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitIndexCommentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitIndexCommentContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexCommentContentContext indexCommentContent() throws RecognitionException {
		IndexCommentContentContext _localctx = new IndexCommentContentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_indexCommentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ANY_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterIndexName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitIndexName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexColumnsContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DdlParser.COMMA, i);
		}
		public IndexColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterIndexColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitIndexColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitIndexColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexColumnsContext indexColumns() throws RecognitionException {
		IndexColumnsContext _localctx = new IndexColumnsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_indexColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			id();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(272);
				match(COMMA);
				setState(273);
				id();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(DdlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(DdlParser.KEY, 0); }
		public TerminalNode LEFT_BRACKETS() { return getToken(DdlParser.LEFT_BRACKETS, 0); }
		public PrimaryKeyColumnContext primaryKeyColumn() {
			return getRuleContext(PrimaryKeyColumnContext.class,0);
		}
		public TerminalNode RIGHT_BRACKETS() { return getToken(DdlParser.RIGHT_BRACKETS, 0); }
		public PrimaryKeyNameContext primaryKeyName() {
			return getRuleContext(PrimaryKeyNameContext.class,0);
		}
		public PrimaryKeyCommentContext primaryKeyComment() {
			return getRuleContext(PrimaryKeyCommentContext.class,0);
		}
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PRIMARY);
			setState(280);
			match(KEY);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACK_QUOTE || _la==ID) {
				{
				setState(281);
				primaryKeyName();
				}
			}

			setState(284);
			match(LEFT_BRACKETS);
			setState(285);
			primaryKeyColumn();
			setState(286);
			match(RIGHT_BRACKETS);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(287);
				primaryKeyComment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyCommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DdlParser.COMMENT, 0); }
		public PrimaryKeyCommentContentContext primaryKeyCommentContent() {
			return getRuleContext(PrimaryKeyCommentContentContext.class,0);
		}
		public PrimaryKeyCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterPrimaryKeyComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitPrimaryKeyComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitPrimaryKeyComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyCommentContext primaryKeyComment() throws RecognitionException {
		PrimaryKeyCommentContext _localctx = new PrimaryKeyCommentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primaryKeyComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(COMMENT);
			setState(291);
			primaryKeyCommentContent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyCommentContentContext extends ParserRuleContext {
		public TerminalNode ANY_STRING() { return getToken(DdlParser.ANY_STRING, 0); }
		public PrimaryKeyCommentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyCommentContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterPrimaryKeyCommentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitPrimaryKeyCommentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitPrimaryKeyCommentContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyCommentContentContext primaryKeyCommentContent() throws RecognitionException {
		PrimaryKeyCommentContentContext _localctx = new PrimaryKeyCommentContentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primaryKeyCommentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ANY_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PrimaryKeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterPrimaryKeyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitPrimaryKeyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitPrimaryKeyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyNameContext primaryKeyName() throws RecognitionException {
		PrimaryKeyNameContext _localctx = new PrimaryKeyNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primaryKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyColumnContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DdlParser.COMMA, i);
		}
		public PrimaryKeyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterPrimaryKeyColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitPrimaryKeyColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitPrimaryKeyColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyColumnContext primaryKeyColumn() throws RecognitionException {
		PrimaryKeyColumnContext _localctx = new PrimaryKeyColumnContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primaryKeyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			id();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(298);
				match(COMMA);
				setState(299);
				id();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueKeyContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(DdlParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(DdlParser.KEY, 0); }
		public TerminalNode LEFT_BRACKETS() { return getToken(DdlParser.LEFT_BRACKETS, 0); }
		public UniqueKeyColumnContext uniqueKeyColumn() {
			return getRuleContext(UniqueKeyColumnContext.class,0);
		}
		public TerminalNode RIGHT_BRACKETS() { return getToken(DdlParser.RIGHT_BRACKETS, 0); }
		public UniqueKeyNameContext uniqueKeyName() {
			return getRuleContext(UniqueKeyNameContext.class,0);
		}
		public UniqueKeyCommentContext uniqueKeyComment() {
			return getRuleContext(UniqueKeyCommentContext.class,0);
		}
		public UniqueKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterUniqueKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitUniqueKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitUniqueKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueKeyContext uniqueKey() throws RecognitionException {
		UniqueKeyContext _localctx = new UniqueKeyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_uniqueKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(UNIQUE);
			setState(306);
			match(KEY);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACK_QUOTE || _la==ID) {
				{
				setState(307);
				uniqueKeyName();
				}
			}

			setState(310);
			match(LEFT_BRACKETS);
			setState(311);
			uniqueKeyColumn();
			setState(312);
			match(RIGHT_BRACKETS);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(313);
				uniqueKeyComment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueKeyCommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DdlParser.COMMENT, 0); }
		public UniqueKeyCommentContentContext uniqueKeyCommentContent() {
			return getRuleContext(UniqueKeyCommentContentContext.class,0);
		}
		public UniqueKeyCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueKeyComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterUniqueKeyComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitUniqueKeyComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitUniqueKeyComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueKeyCommentContext uniqueKeyComment() throws RecognitionException {
		UniqueKeyCommentContext _localctx = new UniqueKeyCommentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_uniqueKeyComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(COMMENT);
			setState(317);
			uniqueKeyCommentContent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueKeyCommentContentContext extends ParserRuleContext {
		public TerminalNode ANY_STRING() { return getToken(DdlParser.ANY_STRING, 0); }
		public UniqueKeyCommentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueKeyCommentContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterUniqueKeyCommentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitUniqueKeyCommentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitUniqueKeyCommentContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueKeyCommentContentContext uniqueKeyCommentContent() throws RecognitionException {
		UniqueKeyCommentContentContext _localctx = new UniqueKeyCommentContentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_uniqueKeyCommentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ANY_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueKeyNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public UniqueKeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueKeyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterUniqueKeyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitUniqueKeyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitUniqueKeyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueKeyNameContext uniqueKeyName() throws RecognitionException {
		UniqueKeyNameContext _localctx = new UniqueKeyNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_uniqueKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueKeyColumnContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DdlParser.COMMA, i);
		}
		public UniqueKeyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueKeyColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterUniqueKeyColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitUniqueKeyColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitUniqueKeyColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueKeyColumnContext uniqueKeyColumn() throws RecognitionException {
		UniqueKeyColumnContext _localctx = new UniqueKeyColumnContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_uniqueKeyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			id();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(324);
				match(COMMA);
				setState(325);
				id();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableOptionsContext extends ParserRuleContext {
		public List<TableOptionContext> tableOption() {
			return getRuleContexts(TableOptionContext.class);
		}
		public TableOptionContext tableOption(int i) {
			return getRuleContext(TableOptionContext.class,i);
		}
		public TableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTableOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTableOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTableOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOptionsContext tableOptions() throws RecognitionException {
		TableOptionsContext _localctx = new TableOptionsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 272629888L) != 0)) {
				{
				{
				setState(331);
				tableOption();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableOptionContext extends ParserRuleContext {
		public TableCommentContext tableComment() {
			return getRuleContext(TableCommentContext.class,0);
		}
		public AutoIncrementTableOptionContext autoIncrementTableOption() {
			return getRuleContext(AutoIncrementTableOptionContext.class,0);
		}
		public TableEngineOptionContext tableEngineOption() {
			return getRuleContext(TableEngineOptionContext.class,0);
		}
		public TableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTableOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTableOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTableOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOptionContext tableOption() throws RecognitionException {
		TableOptionContext _localctx = new TableOptionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tableOption);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				tableComment();
				}
				break;
			case AUTO_INCRMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				autoIncrementTableOption();
				}
				break;
			case ENGINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				tableEngineOption();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableCommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DdlParser.COMMENT, 0); }
		public TabelCommentContentContext tabelCommentContent() {
			return getRuleContext(TabelCommentContentContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(DdlParser.EQUALS, 0); }
		public TableCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTableComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTableComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTableComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCommentContext tableComment() throws RecognitionException {
		TableCommentContext _localctx = new TableCommentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tableComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(COMMENT);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(343);
				match(EQUALS);
				}
			}

			setState(346);
			tabelCommentContent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TabelCommentContentContext extends ParserRuleContext {
		public TerminalNode ANY_STRING() { return getToken(DdlParser.ANY_STRING, 0); }
		public TabelCommentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabelCommentContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTabelCommentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTabelCommentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTabelCommentContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabelCommentContentContext tabelCommentContent() throws RecognitionException {
		TabelCommentContentContext _localctx = new TabelCommentContentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tabelCommentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(ANY_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AutoIncrementTableOptionContext extends ParserRuleContext {
		public TerminalNode AUTO_INCRMENT() { return getToken(DdlParser.AUTO_INCRMENT, 0); }
		public TerminalNode NUMBER() { return getToken(DdlParser.NUMBER, 0); }
		public TerminalNode EQUALS() { return getToken(DdlParser.EQUALS, 0); }
		public AutoIncrementTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoIncrementTableOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterAutoIncrementTableOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitAutoIncrementTableOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitAutoIncrementTableOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoIncrementTableOptionContext autoIncrementTableOption() throws RecognitionException {
		AutoIncrementTableOptionContext _localctx = new AutoIncrementTableOptionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_autoIncrementTableOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(AUTO_INCRMENT);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(351);
				match(EQUALS);
				}
			}

			setState(354);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableEngineOptionContext extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(DdlParser.ENGINE, 0); }
		public EngineNameContext engineName() {
			return getRuleContext(EngineNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(DdlParser.EQUALS, 0); }
		public TableEngineOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableEngineOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterTableEngineOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitTableEngineOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitTableEngineOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableEngineOptionContext tableEngineOption() throws RecognitionException {
		TableEngineOptionContext _localctx = new TableEngineOptionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tableEngineOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ENGINE);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(357);
				match(EQUALS);
				}
			}

			setState(360);
			engineName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EngineNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EngineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterEngineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitEngineName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitEngineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineNameContext engineName() throws RecognitionException {
		EngineNameContext _localctx = new EngineNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_engineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DdlParser.ID, 0); }
		public List<TerminalNode> BACK_QUOTE() { return getTokens(DdlParser.BACK_QUOTE); }
		public TerminalNode BACK_QUOTE(int i) {
			return getToken(DdlParser.BACK_QUOTE, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DdlParserListener ) ((DdlParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlParserVisitor ) return ((DdlParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_id);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(ID);
				}
				break;
			case BACK_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(BACK_QUOTE);
				setState(366);
				match(ID);
				setState(367);
				match(BACK_QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u0173\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0005\u0000f\b\u0000\n\u0000\f\u0000i\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001u\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003|\b\u0003\n\u0003"+
		"\f\u0003\u007f\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0085\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u008b\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0097\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u009f\b\b\u0001\b\u0003\b\u00a2\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u00aa\b\t\u0001\t\u0003\t\u00ad\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b5\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00bd\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00c7\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0005\u0013\u00d5\b\u0013\n\u0013\f\u0013\u00d8"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00df\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00eb\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u00f7\b\u001a\u0003\u001a\u00f9\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u00fd\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0104\b\u001b\u0001\u001b\u0003\u001b\u0107\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0113"+
		"\b\u001f\n\u001f\f\u001f\u0116\t\u001f\u0001 \u0001 \u0001 \u0003 \u011b"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0003 \u0121\b \u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u012d\b$\n$\f$\u0130"+
		"\t$\u0001%\u0001%\u0001%\u0003%\u0135\b%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u013b\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0005)\u0147\b)\n)\f)\u014a\t)\u0001*\u0005*\u014d\b*\n*\f*\u0150"+
		"\t*\u0001+\u0001+\u0001+\u0003+\u0155\b+\u0001,\u0001,\u0003,\u0159\b"+
		",\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0003.\u0161\b.\u0001.\u0001"+
		".\u0001/\u0001/\u0003/\u0167\b/\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00031\u0171\b1\u00011\u0000\u00002\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`b\u0000\u0000\u0170\u0000g\u0001\u0000"+
		"\u0000\u0000\u0002l\u0001\u0000\u0000\u0000\u0004v\u0001\u0000\u0000\u0000"+
		"\u0006x\u0001\u0000\u0000\u0000\b\u0084\u0001\u0000\u0000\u0000\n\u0086"+
		"\u0001\u0000\u0000\u0000\f\u008c\u0001\u0000\u0000\u0000\u000e\u0096\u0001"+
		"\u0000\u0000\u0000\u0010\u009e\u0001\u0000\u0000\u0000\u0012\u00a9\u0001"+
		"\u0000\u0000\u0000\u0014\u00b4\u0001\u0000\u0000\u0000\u0016\u00bc\u0001"+
		"\u0000\u0000\u0000\u0018\u00be\u0001\u0000\u0000\u0000\u001a\u00c6\u0001"+
		"\u0000\u0000\u0000\u001c\u00c8\u0001\u0000\u0000\u0000\u001e\u00ca\u0001"+
		"\u0000\u0000\u0000 \u00cc\u0001\u0000\u0000\u0000\"\u00ce\u0001\u0000"+
		"\u0000\u0000$\u00d1\u0001\u0000\u0000\u0000&\u00d6\u0001\u0000\u0000\u0000"+
		"(\u00de\u0001\u0000\u0000\u0000*\u00e0\u0001\u0000\u0000\u0000,\u00e2"+
		"\u0001\u0000\u0000\u0000.\u00e5\u0001\u0000\u0000\u00000\u00ea\u0001\u0000"+
		"\u0000\u00002\u00ec\u0001\u0000\u0000\u00004\u00f8\u0001\u0000\u0000\u0000"+
		"6\u00fa\u0001\u0000\u0000\u00008\u0108\u0001\u0000\u0000\u0000:\u010b"+
		"\u0001\u0000\u0000\u0000<\u010d\u0001\u0000\u0000\u0000>\u010f\u0001\u0000"+
		"\u0000\u0000@\u0117\u0001\u0000\u0000\u0000B\u0122\u0001\u0000\u0000\u0000"+
		"D\u0125\u0001\u0000\u0000\u0000F\u0127\u0001\u0000\u0000\u0000H\u0129"+
		"\u0001\u0000\u0000\u0000J\u0131\u0001\u0000\u0000\u0000L\u013c\u0001\u0000"+
		"\u0000\u0000N\u013f\u0001\u0000\u0000\u0000P\u0141\u0001\u0000\u0000\u0000"+
		"R\u0143\u0001\u0000\u0000\u0000T\u014e\u0001\u0000\u0000\u0000V\u0154"+
		"\u0001\u0000\u0000\u0000X\u0156\u0001\u0000\u0000\u0000Z\u015c\u0001\u0000"+
		"\u0000\u0000\\\u015e\u0001\u0000\u0000\u0000^\u0164\u0001\u0000\u0000"+
		"\u0000`\u016a\u0001\u0000\u0000\u0000b\u0170\u0001\u0000\u0000\u0000d"+
		"f\u0003\u0002\u0001\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0000\u0000\u0001k\u0001"+
		"\u0001\u0000\u0000\u0000lm\u0005\u0002\u0000\u0000mn\u0005\u0003\u0000"+
		"\u0000no\u0003\u0004\u0002\u0000op\u0005 \u0000\u0000pq\u0003\u0006\u0003"+
		"\u0000qr\u0005!\u0000\u0000rt\u0003T*\u0000su\u0005\"\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0003\u0001\u0000\u0000"+
		"\u0000vw\u0003b1\u0000w\u0005\u0001\u0000\u0000\u0000x}\u0003\b\u0004"+
		"\u0000yz\u0005#\u0000\u0000z|\u0003\b\u0004\u0000{y\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0007\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0085\u0003\n\u0005\u0000\u0081\u0085\u00036\u001b\u0000"+
		"\u0082\u0085\u0003@ \u0000\u0083\u0085\u0003J%\u0000\u0084\u0080\u0001"+
		"\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\t\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0003\f\u0006\u0000\u0087\u0088\u0003\u000e\u0007"+
		"\u0000\u0088\u008a\u0003&\u0013\u0000\u0089\u008b\u0003\"\u0011\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u000b\u0001\u0000\u0000\u0000\u008c\u008d\u0003b1\u0000\u008d\r"+
		"\u0001\u0000\u0000\u0000\u008e\u0097\u0003\u0010\b\u0000\u008f\u0097\u0003"+
		"\u0012\t\u0000\u0090\u0097\u0003\u001a\r\u0000\u0091\u0097\u0003\u0014"+
		"\n\u0000\u0092\u0097\u0003\u0016\u000b\u0000\u0093\u0097\u0003\u001c\u000e"+
		"\u0000\u0094\u0097\u0003\u001e\u000f\u0000\u0095\u0097\u0003 \u0010\u0000"+
		"\u0096\u008e\u0001\u0000\u0000\u0000\u0096\u008f\u0001\u0000\u0000\u0000"+
		"\u0096\u0090\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000"+
		"\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u000f\u0001\u0000\u0000\u0000\u0098\u009f\u0005\u0005\u0000\u0000"+
		"\u0099\u009a\u0005\u0005\u0000\u0000\u009a\u009b\u0005 \u0000\u0000\u009b"+
		"\u009c\u0003\u0018\f\u0000\u009c\u009d\u0005!\u0000\u0000\u009d\u009f"+
		"\u0001\u0000\u0000\u0000\u009e\u0098\u0001\u0000\u0000\u0000\u009e\u0099"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u0005\u0019\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u0011\u0001\u0000\u0000\u0000\u00a3\u00aa"+
		"\u0005\u001a\u0000\u0000\u00a4\u00a5\u0005\u001a\u0000\u0000\u00a5\u00a6"+
		"\u0005 \u0000\u0000\u00a6\u00a7\u0003\u0018\f\u0000\u00a7\u00a8\u0005"+
		"!\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a4\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0005\u0019\u0000\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u0013\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b5\u0005\u0012\u0000\u0000\u00af\u00b0\u0005\u0012"+
		"\u0000\u0000\u00b0\u00b1\u0005 \u0000\u0000\u00b1\u00b2\u0003\u0018\f"+
		"\u0000\u00b2\u00b3\u0005!\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000"+
		"\u00b5\u0015\u0001\u0000\u0000\u0000\u00b6\u00bd\u0005\u001b\u0000\u0000"+
		"\u00b7\u00b8\u0005\u001b\u0000\u0000\u00b8\u00b9\u0005 \u0000\u0000\u00b9"+
		"\u00ba\u0003\u0018\f\u0000\u00ba\u00bb\u0005!\u0000\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b7"+
		"\u0001\u0000\u0000\u0000\u00bd\u0017\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005\u001d\u0000\u0000\u00bf\u0019\u0001\u0000\u0000\u0000\u00c0\u00c7"+
		"\u0005\u0006\u0000\u0000\u00c1\u00c2\u0005\u0006\u0000\u0000\u00c2\u00c3"+
		"\u0005 \u0000\u0000\u00c3\u00c4\u0003\u0018\f\u0000\u00c4\u00c5\u0005"+
		"!\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c7\u001b\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0013\u0000\u0000\u00c9\u001d\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005\u0014\u0000\u0000\u00cb\u001f\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0015\u0000\u0000\u00cd!\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0007\u0000\u0000\u00cf\u00d0\u0003$\u0012\u0000"+
		"\u00d0#\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005$\u0000\u0000\u00d2%"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003(\u0014\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\'\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00df\u0003,\u0016"+
		"\u0000\u00da\u00df\u0003.\u0017\u0000\u00db\u00df\u0003*\u0015\u0000\u00dc"+
		"\u00df\u00030\u0018\u0000\u00dd\u00df\u00032\u0019\u0000\u00de\u00d9\u0001"+
		"\u0000\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00db\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df)\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\t"+
		"\u0000\u0000\u00e1+\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\b\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000\u00e4-\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0005\u0016\u0000\u0000\u00e6/\u0001\u0000\u0000\u0000\u00e7"+
		"\u00eb\u0005\f\u0000\u0000\u00e8\u00e9\u0005\u000b\u0000\u0000\u00e9\u00eb"+
		"\u0005\f\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00eb1\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\r"+
		"\u0000\u0000\u00ed\u00ee\u00034\u001a\u0000\u00ee3\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f9\u0005$\u0000\u0000\u00f0\u00f9\u0005\u001d\u0000\u0000\u00f1"+
		"\u00f9\u0005\f\u0000\u0000\u00f2\u00f6\u0005\u0011\u0000\u0000\u00f3\u00f4"+
		"\u0005\u000e\u0000\u0000\u00f4\u00f5\u0005\u0010\u0000\u0000\u00f5\u00f7"+
		"\u0005\u0011\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f0\u0001\u0000\u0000\u0000\u00f8\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f95\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0005\u0004\u0000\u0000\u00fb\u00fd\u0003"+
		"<\u001e\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005 \u0000"+
		"\u0000\u00ff\u0100\u0003>\u001f\u0000\u0100\u0103\u0005!\u0000\u0000\u0101"+
		"\u0102\u0005\u0017\u0000\u0000\u0102\u0104\u0005\u0018\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0106\u0001\u0000\u0000\u0000\u0105\u0107\u00038\u001c\u0000\u0106\u0105"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u01077\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0005\u0007\u0000\u0000\u0109\u010a\u0003"+
		":\u001d\u0000\u010a9\u0001\u0000\u0000\u0000\u010b\u010c\u0005$\u0000"+
		"\u0000\u010c;\u0001\u0000\u0000\u0000\u010d\u010e\u0003b1\u0000\u010e"+
		"=\u0001\u0000\u0000\u0000\u010f\u0114\u0003b1\u0000\u0110\u0111\u0005"+
		"#\u0000\u0000\u0111\u0113\u0003b1\u0000\u0112\u0110\u0001\u0000\u0000"+
		"\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115?\u0001\u0000\u0000\u0000"+
		"\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0005\b\u0000\u0000\u0118"+
		"\u011a\u0005\u0004\u0000\u0000\u0119\u011b\u0003F#\u0000\u011a\u0119\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005 \u0000\u0000\u011d\u011e\u0003H$"+
		"\u0000\u011e\u0120\u0005!\u0000\u0000\u011f\u0121\u0003B!\u0000\u0120"+
		"\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"A\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u0007\u0000\u0000\u0123\u0124"+
		"\u0003D\"\u0000\u0124C\u0001\u0000\u0000\u0000\u0125\u0126\u0005$\u0000"+
		"\u0000\u0126E\u0001\u0000\u0000\u0000\u0127\u0128\u0003b1\u0000\u0128"+
		"G\u0001\u0000\u0000\u0000\u0129\u012e\u0003b1\u0000\u012a\u012b\u0005"+
		"#\u0000\u0000\u012b\u012d\u0003b1\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012fI\u0001\u0000\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005\t\u0000\u0000\u0132"+
		"\u0134\u0005\u0004\u0000\u0000\u0133\u0135\u0003P(\u0000\u0134\u0133\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005 \u0000\u0000\u0137\u0138\u0003R)"+
		"\u0000\u0138\u013a\u0005!\u0000\u0000\u0139\u013b\u0003L&\u0000\u013a"+
		"\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"K\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0007\u0000\u0000\u013d\u013e"+
		"\u0003N\'\u0000\u013eM\u0001\u0000\u0000\u0000\u013f\u0140\u0005$\u0000"+
		"\u0000\u0140O\u0001\u0000\u0000\u0000\u0141\u0142\u0003b1\u0000\u0142"+
		"Q\u0001\u0000\u0000\u0000\u0143\u0148\u0003b1\u0000\u0144\u0145\u0005"+
		"#\u0000\u0000\u0145\u0147\u0003b1\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149S\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014d\u0003V+\u0000\u014c\u014b"+
		"\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014fU\u0001"+
		"\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0155\u0003"+
		"X,\u0000\u0152\u0155\u0003\\.\u0000\u0153\u0155\u0003^/\u0000\u0154\u0151"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0153"+
		"\u0001\u0000\u0000\u0000\u0155W\u0001\u0000\u0000\u0000\u0156\u0158\u0005"+
		"\u0007\u0000\u0000\u0157\u0159\u0005\n\u0000\u0000\u0158\u0157\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0003Z-\u0000\u015bY\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0005$\u0000\u0000\u015d[\u0001\u0000\u0000\u0000\u015e\u0160"+
		"\u0005\u0016\u0000\u0000\u015f\u0161\u0005\n\u0000\u0000\u0160\u015f\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0005\u001d\u0000\u0000\u0163]\u0001\u0000"+
		"\u0000\u0000\u0164\u0166\u0005\u001c\u0000\u0000\u0165\u0167\u0005\n\u0000"+
		"\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0003`0\u0000\u0169"+
		"_\u0001\u0000\u0000\u0000\u016a\u016b\u0003b1\u0000\u016ba\u0001\u0000"+
		"\u0000\u0000\u016c\u0171\u0005\u001e\u0000\u0000\u016d\u016e\u0005\u000f"+
		"\u0000\u0000\u016e\u016f\u0005\u001e\u0000\u0000\u016f\u0171\u0005\u000f"+
		"\u0000\u0000\u0170\u016c\u0001\u0000\u0000\u0000\u0170\u016d\u0001\u0000"+
		"\u0000\u0000\u0171c\u0001\u0000\u0000\u0000\"gt}\u0084\u008a\u0096\u009e"+
		"\u00a1\u00a9\u00ac\u00b4\u00bc\u00c6\u00d6\u00de\u00ea\u00f6\u00f8\u00fc"+
		"\u0103\u0106\u0114\u011a\u0120\u012e\u0134\u013a\u0148\u014e\u0154\u0158"+
		"\u0160\u0166\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}