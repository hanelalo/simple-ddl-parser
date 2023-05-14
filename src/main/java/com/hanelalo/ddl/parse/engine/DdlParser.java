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
		CREATE=1, TABLE=2, KEY=3, INT=4, VARCHAR=5, COMMENT=6, PRIMARY=7, UNIQUE=8, 
		EQUALS=9, NOT=10, NULL=11, DEFAULT=12, ON=13, UPDATE=14, CURRENT_TIMESTAMP=15, 
		TEXT=16, DATE=17, DATETIME=18, TIMESTAMP=19, AUTO_INCRMENT=20, BACKQUOTE=21, 
		USING=22, BTREE=23, NUMBER=24, ID=25, WS=26, LEFT_BRACKETS=27, RIGHT_BRACKETS=28, 
		SEMICOLON=29, COMMA=30, ANY_STRING=31;
	public static final int
		RULE_parse = 0, RULE_creatTable = 1, RULE_tableName = 2, RULE_tableDefinitions = 3, 
		RULE_tableDefinition = 4, RULE_columnOption = 5, RULE_columnName = 6, 
		RULE_columnType = 7, RULE_intType = 8, RULE_textType = 9, RULE_columnLength = 10, 
		RULE_varcharType = 11, RULE_dateType = 12, RULE_datetimeType = 13, RULE_timestampType = 14, 
		RULE_comment = 15, RULE_commentContent = 16, RULE_columnAttrOptions = 17, 
		RULE_columnAttrOption = 18, RULE_primaryKeyOption = 19, RULE_autoincrementOption = 20, 
		RULE_nullOption = 21, RULE_defaultOption = 22, RULE_defaultValue = 23, 
		RULE_indexOption = 24, RULE_indexName = 25, RULE_indexColumns = 26, RULE_primaryKey = 27, 
		RULE_primaryKeyName = 28, RULE_primaryKeyColumn = 29, RULE_uniqueKey = 30, 
		RULE_uniqueKeyName = 31, RULE_uniqueKeyColumn = 32, RULE_tableOptions = 33, 
		RULE_tableOption = 34, RULE_tableComment = 35, RULE_tabelCommentContent = 36, 
		RULE_autoIncrementTableOption = 37, RULE_id = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "creatTable", "tableName", "tableDefinitions", "tableDefinition", 
			"columnOption", "columnName", "columnType", "intType", "textType", "columnLength", 
			"varcharType", "dateType", "datetimeType", "timestampType", "comment", 
			"commentContent", "columnAttrOptions", "columnAttrOption", "primaryKeyOption", 
			"autoincrementOption", "nullOption", "defaultOption", "defaultValue", 
			"indexOption", "indexName", "indexColumns", "primaryKey", "primaryKeyName", 
			"primaryKeyColumn", "uniqueKey", "uniqueKeyName", "uniqueKeyColumn", 
			"tableOptions", "tableOption", "tableComment", "tabelCommentContent", 
			"autoIncrementTableOption", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'table'", "'key'", "'int'", "'varchar'", "'comment'", 
			"'primary'", "'unique'", "'='", "'not'", "'null'", "'default'", "'on'", 
			"'update'", "'current_timestamp'", "'text'", "'date'", "'datetime'", 
			"'timestamp'", "'auto_increment'", "'`'", "'using'", "'btree'", null, 
			null, null, "'('", "')'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "TABLE", "KEY", "INT", "VARCHAR", "COMMENT", "PRIMARY", 
			"UNIQUE", "EQUALS", "NOT", "NULL", "DEFAULT", "ON", "UPDATE", "CURRENT_TIMESTAMP", 
			"TEXT", "DATE", "DATETIME", "TIMESTAMP", "AUTO_INCRMENT", "BACKQUOTE", 
			"USING", "BTREE", "NUMBER", "ID", "WS", "LEFT_BRACKETS", "RIGHT_BRACKETS", 
			"SEMICOLON", "COMMA", "ANY_STRING"
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CREATE) {
				{
				{
				setState(78);
				creatTable();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(86);
			match(CREATE);
			setState(87);
			match(TABLE);
			setState(88);
			tableName();
			setState(89);
			match(LEFT_BRACKETS);
			setState(90);
			tableDefinitions();
			setState(91);
			match(RIGHT_BRACKETS);
			setState(92);
			tableOptions();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(93);
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
			setState(96);
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
			setState(98);
			tableDefinition();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				tableDefinition();
				}
				}
				setState(105);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKQUOTE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				columnOption();
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				indexOption();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
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
			setState(112);
			columnName();
			setState(113);
			columnType();
			setState(114);
			columnAttrOptions();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(115);
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
	public static class ColumnTypeContext extends ParserRuleContext {
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public VarcharTypeContext varcharType() {
			return getRuleContext(VarcharTypeContext.class,0);
		}
		public TextTypeContext textType() {
			return getRuleContext(TextTypeContext.class,0);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				intType();
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				varcharType();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				textType();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				dateType();
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				datetimeType();
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
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
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(129);
				match(INT);
				setState(130);
				match(LEFT_BRACKETS);
				setState(131);
				columnLength();
				setState(132);
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
		enterRule(_localctx, 18, RULE_textType);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(137);
				match(TEXT);
				setState(138);
				match(LEFT_BRACKETS);
				setState(139);
				columnLength();
				setState(140);
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
		enterRule(_localctx, 20, RULE_columnLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 22, RULE_varcharType);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(VARCHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(147);
				match(VARCHAR);
				setState(148);
				match(LEFT_BRACKETS);
				setState(149);
				columnLength();
				setState(150);
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
		enterRule(_localctx, 24, RULE_dateType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		enterRule(_localctx, 26, RULE_datetimeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		enterRule(_localctx, 28, RULE_timestampType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 30, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(COMMENT);
			setState(161);
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
		enterRule(_localctx, 32, RULE_commentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		enterRule(_localctx, 34, RULE_columnAttrOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055872L) != 0)) {
				{
				{
				setState(165);
				columnAttrOption();
				}
				}
				setState(170);
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
		enterRule(_localctx, 36, RULE_columnAttrOption);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				primaryKeyOption();
				}
				break;
			case AUTO_INCRMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				autoincrementOption();
				}
				break;
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				nullOption();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
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
		enterRule(_localctx, 38, RULE_primaryKeyOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(PRIMARY);
			setState(178);
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
		enterRule(_localctx, 40, RULE_autoincrementOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 42, RULE_nullOption);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(NULL);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(NOT);
				setState(184);
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
		enterRule(_localctx, 44, RULE_defaultOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(DEFAULT);
			setState(188);
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
		enterRule(_localctx, 46, RULE_defaultValue);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(ANY_STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(NUMBER);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(192);
				match(CURRENT_TIMESTAMP);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(193);
					match(ON);
					setState(194);
					match(UPDATE);
					setState(195);
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
		enterRule(_localctx, 48, RULE_indexOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(KEY);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKQUOTE || _la==ID) {
				{
				setState(201);
				indexName();
				}
			}

			setState(204);
			match(LEFT_BRACKETS);
			setState(205);
			indexColumns();
			setState(206);
			match(RIGHT_BRACKETS);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(207);
				match(USING);
				setState(208);
				match(BTREE);
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
		enterRule(_localctx, 50, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		enterRule(_localctx, 52, RULE_indexColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			id();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				id();
				}
				}
				setState(220);
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
		enterRule(_localctx, 54, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PRIMARY);
			setState(222);
			match(KEY);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKQUOTE || _la==ID) {
				{
				setState(223);
				primaryKeyName();
				}
			}

			setState(226);
			match(LEFT_BRACKETS);
			setState(227);
			primaryKeyColumn();
			setState(228);
			match(RIGHT_BRACKETS);
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
		enterRule(_localctx, 56, RULE_primaryKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 58, RULE_primaryKeyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			id();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				id();
				}
				}
				setState(239);
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
		enterRule(_localctx, 60, RULE_uniqueKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(UNIQUE);
			setState(241);
			match(KEY);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKQUOTE || _la==ID) {
				{
				setState(242);
				uniqueKeyName();
				}
			}

			setState(245);
			match(LEFT_BRACKETS);
			setState(246);
			uniqueKeyColumn();
			setState(247);
			match(RIGHT_BRACKETS);
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
		enterRule(_localctx, 62, RULE_uniqueKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 64, RULE_uniqueKeyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			id();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(252);
				match(COMMA);
				setState(253);
				id();
				}
				}
				setState(258);
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
		enterRule(_localctx, 66, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==AUTO_INCRMENT) {
				{
				{
				setState(259);
				tableOption();
				}
				}
				setState(264);
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
		enterRule(_localctx, 68, RULE_tableOption);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				tableComment();
				}
				break;
			case AUTO_INCRMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				autoIncrementTableOption();
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
		enterRule(_localctx, 70, RULE_tableComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(COMMENT);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(270);
				match(EQUALS);
				}
			}

			setState(273);
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
		enterRule(_localctx, 72, RULE_tabelCommentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 74, RULE_autoIncrementTableOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(AUTO_INCRMENT);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(278);
				match(EQUALS);
				}
			}

			setState(281);
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DdlParser.ID, 0); }
		public List<TerminalNode> BACKQUOTE() { return getTokens(DdlParser.BACKQUOTE); }
		public TerminalNode BACKQUOTE(int i) {
			return getToken(DdlParser.BACKQUOTE, i);
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
		enterRule(_localctx, 76, RULE_id);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(ID);
				}
				break;
			case BACKQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(284);
				match(BACKQUOTE);
				setState(285);
				match(ID);
				setState(286);
				match(BACKQUOTE);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0122\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000"+
		"\u0005\u0000P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001_\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003f\b\u0003\n\u0003\f\u0003"+
		"i\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"o\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"u\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u007f\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0087\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008f\b\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0099\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0005\u0011\u00a7\b\u0011\n\u0011\f\u0011\u00aa\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b0\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00ba\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u00c5\b\u0017\u0003\u0017\u00c7\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u00cb\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u00d2\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00d9\b\u001a\n\u001a\f\u001a"+
		"\u00dc\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00e1\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u00ec\b\u001d\n"+
		"\u001d\f\u001d\u00ef\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u00f4\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u00ff\b \n \f \u0102\t"+
		" \u0001!\u0005!\u0105\b!\n!\f!\u0108\t!\u0001\"\u0001\"\u0003\"\u010c"+
		"\b\"\u0001#\u0001#\u0003#\u0110\b#\u0001#\u0001#\u0001$\u0001$\u0001%"+
		"\u0001%\u0003%\u0118\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0120\b&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000"+
		"\u0000\u011d\u0000Q\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000\u0000"+
		"\u0004`\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bn\u0001"+
		"\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fv\u0001\u0000\u0000\u0000"+
		"\u000e~\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000\u0000\u0012"+
		"\u008e\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000\u0000\u0000\u0016"+
		"\u0098\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a"+
		"\u009c\u0001\u0000\u0000\u0000\u001c\u009e\u0001\u0000\u0000\u0000\u001e"+
		"\u00a0\u0001\u0000\u0000\u0000 \u00a3\u0001\u0000\u0000\u0000\"\u00a8"+
		"\u0001\u0000\u0000\u0000$\u00af\u0001\u0000\u0000\u0000&\u00b1\u0001\u0000"+
		"\u0000\u0000(\u00b4\u0001\u0000\u0000\u0000*\u00b9\u0001\u0000\u0000\u0000"+
		",\u00bb\u0001\u0000\u0000\u0000.\u00c6\u0001\u0000\u0000\u00000\u00c8"+
		"\u0001\u0000\u0000\u00002\u00d3\u0001\u0000\u0000\u00004\u00d5\u0001\u0000"+
		"\u0000\u00006\u00dd\u0001\u0000\u0000\u00008\u00e6\u0001\u0000\u0000\u0000"+
		":\u00e8\u0001\u0000\u0000\u0000<\u00f0\u0001\u0000\u0000\u0000>\u00f9"+
		"\u0001\u0000\u0000\u0000@\u00fb\u0001\u0000\u0000\u0000B\u0106\u0001\u0000"+
		"\u0000\u0000D\u010b\u0001\u0000\u0000\u0000F\u010d\u0001\u0000\u0000\u0000"+
		"H\u0113\u0001\u0000\u0000\u0000J\u0115\u0001\u0000\u0000\u0000L\u011f"+
		"\u0001\u0000\u0000\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000\u0000"+
		"\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005"+
		"\u0000\u0000\u0001U\u0001\u0001\u0000\u0000\u0000VW\u0005\u0001\u0000"+
		"\u0000WX\u0005\u0002\u0000\u0000XY\u0003\u0004\u0002\u0000YZ\u0005\u001b"+
		"\u0000\u0000Z[\u0003\u0006\u0003\u0000[\\\u0005\u001c\u0000\u0000\\^\u0003"+
		"B!\u0000]_\u0005\u001d\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_\u0003\u0001\u0000\u0000\u0000`a\u0003L&\u0000a\u0005\u0001"+
		"\u0000\u0000\u0000bg\u0003\b\u0004\u0000cd\u0005\u001e\u0000\u0000df\u0003"+
		"\b\u0004\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0007\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000jo\u0003\n\u0005\u0000ko\u00030\u0018"+
		"\u0000lo\u00036\u001b\u0000mo\u0003<\u001e\u0000nj\u0001\u0000\u0000\u0000"+
		"nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000o\t\u0001\u0000\u0000\u0000pq\u0003\f\u0006\u0000qr\u0003\u000e"+
		"\u0007\u0000rt\u0003\"\u0011\u0000su\u0003\u001e\u000f\u0000ts\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000u\u000b\u0001\u0000\u0000\u0000"+
		"vw\u0003L&\u0000w\r\u0001\u0000\u0000\u0000x\u007f\u0003\u0010\b\u0000"+
		"y\u007f\u0003\u0016\u000b\u0000z\u007f\u0003\u0012\t\u0000{\u007f\u0003"+
		"\u0018\f\u0000|\u007f\u0003\u001a\r\u0000}\u007f\u0003\u001c\u000e\u0000"+
		"~x\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000"+
		"\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0087\u0005\u0004"+
		"\u0000\u0000\u0081\u0082\u0005\u0004\u0000\u0000\u0082\u0083\u0005\u001b"+
		"\u0000\u0000\u0083\u0084\u0003\u0014\n\u0000\u0084\u0085\u0005\u001c\u0000"+
		"\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0080\u0001\u0000\u0000"+
		"\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0087\u0011\u0001\u0000\u0000"+
		"\u0000\u0088\u008f\u0005\u0010\u0000\u0000\u0089\u008a\u0005\u0010\u0000"+
		"\u0000\u008a\u008b\u0005\u001b\u0000\u0000\u008b\u008c\u0003\u0014\n\u0000"+
		"\u008c\u008d\u0005\u001c\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000"+
		"\u008e\u0088\u0001\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000\u0000"+
		"\u008f\u0013\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0018\u0000\u0000"+
		"\u0091\u0015\u0001\u0000\u0000\u0000\u0092\u0099\u0005\u0005\u0000\u0000"+
		"\u0093\u0094\u0005\u0005\u0000\u0000\u0094\u0095\u0005\u001b\u0000\u0000"+
		"\u0095\u0096\u0003\u0014\n\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097"+
		"\u0099\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000\u0000\u0098"+
		"\u0093\u0001\u0000\u0000\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u0011\u0000\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u0012\u0000\u0000\u009d\u001b\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005\u0013\u0000\u0000\u009f\u001d\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0006\u0000\u0000\u00a1\u00a2\u0003 \u0010\u0000\u00a2\u001f"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001f\u0000\u0000\u00a4!\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u0003$\u0012\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9#\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00b0\u0003&\u0013\u0000"+
		"\u00ac\u00b0\u0003(\u0014\u0000\u00ad\u00b0\u0003*\u0015\u0000\u00ae\u00b0"+
		"\u0003,\u0016\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0%\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0007"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3\'\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0014\u0000\u0000\u00b5)\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ba\u0005\u000b\u0000\u0000\u00b7\u00b8\u0005\n\u0000\u0000\u00b8"+
		"\u00ba\u0005\u000b\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba+\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005\f\u0000\u0000\u00bc\u00bd\u0003.\u0017\u0000\u00bd-\u0001\u0000"+
		"\u0000\u0000\u00be\u00c7\u0005\u001f\u0000\u0000\u00bf\u00c7\u0005\u0018"+
		"\u0000\u0000\u00c0\u00c4\u0005\u000f\u0000\u0000\u00c1\u00c2\u0005\r\u0000"+
		"\u0000\u00c2\u00c3\u0005\u000e\u0000\u0000\u00c3\u00c5\u0005\u000f\u0000"+
		"\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00be\u0001\u0000\u0000"+
		"\u0000\u00c6\u00bf\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c7/\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\u0003\u0000\u0000"+
		"\u00c9\u00cb\u00032\u0019\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005\u001b\u0000\u0000\u00cd\u00ce\u00034\u001a\u0000\u00ce\u00d1"+
		"\u0005\u001c\u0000\u0000\u00cf\u00d0\u0005\u0016\u0000\u0000\u00d0\u00d2"+
		"\u0005\u0017\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d21\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003"+
		"L&\u0000\u00d43\u0001\u0000\u0000\u0000\u00d5\u00da\u0003L&\u0000\u00d6"+
		"\u00d7\u0005\u001e\u0000\u0000\u00d7\u00d9\u0003L&\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db5\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0007"+
		"\u0000\u0000\u00de\u00e0\u0005\u0003\u0000\u0000\u00df\u00e1\u00038\u001c"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u001b\u0000"+
		"\u0000\u00e3\u00e4\u0003:\u001d\u0000\u00e4\u00e5\u0005\u001c\u0000\u0000"+
		"\u00e57\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003L&\u0000\u00e79\u0001"+
		"\u0000\u0000\u0000\u00e8\u00ed\u0003L&\u0000\u00e9\u00ea\u0005\u001e\u0000"+
		"\u0000\u00ea\u00ec\u0003L&\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee;\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\b\u0000\u0000\u00f1\u00f3\u0005"+
		"\u0003\u0000\u0000\u00f2\u00f4\u0003>\u001f\u0000\u00f3\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005\u001b\u0000\u0000\u00f6\u00f7\u0003@ \u0000"+
		"\u00f7\u00f8\u0005\u001c\u0000\u0000\u00f8=\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0003L&\u0000\u00fa?\u0001\u0000\u0000\u0000\u00fb\u0100\u0003"+
		"L&\u0000\u00fc\u00fd\u0005\u001e\u0000\u0000\u00fd\u00ff\u0003L&\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101A\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103"+
		"\u0105\u0003D\"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108"+
		"\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107C\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0109\u010c\u0003F#\u0000\u010a\u010c\u0003J%\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000"+
		"\u010cE\u0001\u0000\u0000\u0000\u010d\u010f\u0005\u0006\u0000\u0000\u010e"+
		"\u0110\u0005\t\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0003H$\u0000\u0112G\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u001f"+
		"\u0000\u0000\u0114I\u0001\u0000\u0000\u0000\u0115\u0117\u0005\u0014\u0000"+
		"\u0000\u0116\u0118\u0005\t\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\u0018\u0000\u0000\u011aK\u0001\u0000\u0000\u0000\u011b"+
		"\u0120\u0005\u0019\u0000\u0000\u011c\u011d\u0005\u0015\u0000\u0000\u011d"+
		"\u011e\u0005\u0019\u0000\u0000\u011e\u0120\u0005\u0015\u0000\u0000\u011f"+
		"\u011b\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u0120"+
		"M\u0001\u0000\u0000\u0000\u001aQ^gnt~\u0086\u008e\u0098\u00a8\u00af\u00b9"+
		"\u00c4\u00c6\u00ca\u00d1\u00da\u00e0\u00ed\u00f3\u0100\u0106\u010b\u010f"+
		"\u0117\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}