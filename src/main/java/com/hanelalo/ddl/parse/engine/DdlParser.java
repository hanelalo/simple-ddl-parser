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
		RULE_indexOption = 24, RULE_indexColumns = 25, RULE_primaryKey = 26, RULE_primaryKeyColumn = 27, 
		RULE_uniqueKey = 28, RULE_uniqueKeyName = 29, RULE_uniqueKeyColumn = 30, 
		RULE_tableOptions = 31, RULE_tableOption = 32, RULE_tableComment = 33, 
		RULE_tabelCommentContent = 34, RULE_autoIncrementTableOption = 35, RULE_id = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "creatTable", "tableName", "tableDefinitions", "tableDefinition", 
			"columnOption", "columnName", "columnType", "intType", "textType", "columnLength", 
			"varcharType", "dateType", "datetimeType", "timestampType", "comment", 
			"commentContent", "columnAttrOptions", "columnAttrOption", "primaryKeyOption", 
			"autoincrementOption", "nullOption", "defaultOption", "defaultValue", 
			"indexOption", "indexColumns", "primaryKey", "primaryKeyColumn", "uniqueKey", 
			"uniqueKeyName", "uniqueKeyColumn", "tableOptions", "tableOption", "tableComment", 
			"tabelCommentContent", "autoIncrementTableOption", "id"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CREATE) {
				{
				{
				setState(74);
				creatTable();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
			setState(82);
			match(CREATE);
			setState(83);
			match(TABLE);
			setState(84);
			tableName();
			setState(85);
			match(LEFT_BRACKETS);
			setState(86);
			tableDefinitions();
			setState(87);
			match(RIGHT_BRACKETS);
			setState(88);
			tableOptions();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(89);
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
			setState(92);
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
			setState(94);
			tableDefinition();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				tableDefinition();
				}
				}
				setState(101);
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKQUOTE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				columnOption();
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				indexOption();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
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
			setState(108);
			columnName();
			setState(109);
			columnType();
			setState(110);
			columnAttrOptions();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(111);
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
			setState(114);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				intType();
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				varcharType();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				textType();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				dateType();
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				datetimeType();
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(125);
				match(INT);
				setState(126);
				match(LEFT_BRACKETS);
				setState(127);
				columnLength();
				setState(128);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(133);
				match(TEXT);
				setState(134);
				match(LEFT_BRACKETS);
				setState(135);
				columnLength();
				setState(136);
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
			setState(140);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(VARCHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(143);
				match(VARCHAR);
				setState(144);
				match(LEFT_BRACKETS);
				setState(145);
				columnLength();
				setState(146);
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
			setState(150);
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
			setState(152);
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
			setState(154);
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
			setState(156);
			match(COMMENT);
			setState(157);
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
			setState(159);
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
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055872L) != 0)) {
				{
				{
				setState(161);
				columnAttrOption();
				}
				}
				setState(166);
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
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				primaryKeyOption();
				}
				break;
			case AUTO_INCRMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				autoincrementOption();
				}
				break;
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				nullOption();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
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
			setState(173);
			match(PRIMARY);
			setState(174);
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
			setState(176);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(NULL);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(NOT);
				setState(180);
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
			setState(183);
			match(DEFAULT);
			setState(184);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(ANY_STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(NUMBER);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(188);
				match(CURRENT_TIMESTAMP);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(189);
					match(ON);
					setState(190);
					match(UPDATE);
					setState(191);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
			setState(196);
			match(KEY);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKQUOTE || _la==ID) {
				{
				setState(197);
				id();
				}
			}

			setState(200);
			match(LEFT_BRACKETS);
			setState(201);
			indexColumns();
			setState(202);
			match(RIGHT_BRACKETS);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(203);
				match(USING);
				setState(204);
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
		enterRule(_localctx, 50, RULE_indexColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			id();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(208);
				match(COMMA);
				setState(209);
				id();
				}
				}
				setState(214);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		enterRule(_localctx, 52, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(PRIMARY);
			setState(216);
			match(KEY);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKQUOTE || _la==ID) {
				{
				setState(217);
				id();
				}
			}

			setState(220);
			match(LEFT_BRACKETS);
			setState(221);
			primaryKeyColumn();
			setState(222);
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
		enterRule(_localctx, 54, RULE_primaryKeyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			id();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(225);
				match(COMMA);
				setState(226);
				id();
				}
				}
				setState(231);
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
		enterRule(_localctx, 56, RULE_uniqueKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(UNIQUE);
			setState(233);
			match(KEY);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKQUOTE || _la==ID) {
				{
				setState(234);
				uniqueKeyName();
				}
			}

			setState(237);
			match(LEFT_BRACKETS);
			setState(238);
			uniqueKeyColumn();
			setState(239);
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
		enterRule(_localctx, 58, RULE_uniqueKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		enterRule(_localctx, 60, RULE_uniqueKeyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			id();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				id();
				}
				}
				setState(250);
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
		enterRule(_localctx, 62, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==AUTO_INCRMENT) {
				{
				{
				setState(251);
				tableOption();
				}
				}
				setState(256);
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
		enterRule(_localctx, 64, RULE_tableOption);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				tableComment();
				}
				break;
			case AUTO_INCRMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
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
		enterRule(_localctx, 66, RULE_tableComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(COMMENT);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(262);
				match(EQUALS);
				}
			}

			setState(265);
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
		enterRule(_localctx, 68, RULE_tabelCommentContent);
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
		enterRule(_localctx, 70, RULE_autoIncrementTableOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(AUTO_INCRMENT);
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
		enterRule(_localctx, 72, RULE_id);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(ID);
				}
				break;
			case BACKQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(276);
				match(BACKQUOTE);
				setState(277);
				match(ID);
				setState(278);
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
		"\u0004\u0001\u001f\u011a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000"+
		"\f\u0000O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001[\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003b\b\u0003\n\u0003\f\u0003e\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004k\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005q\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007{\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0083\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u008b\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0095\b\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0005\u0011\u00a3\b\u0011\n"+
		"\u0011\f\u0011\u00a6\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00ac\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00b6"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00c1\b\u0017\u0003"+
		"\u0017\u00c3\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00c7\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00ce\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00d3\b"+
		"\u0019\n\u0019\f\u0019\u00d6\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u00db\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00e4\b\u001b\n\u001b"+
		"\f\u001b\u00e7\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u00ec\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u00f7\b\u001e"+
		"\n\u001e\f\u001e\u00fa\t\u001e\u0001\u001f\u0005\u001f\u00fd\b\u001f\n"+
		"\u001f\f\u001f\u0100\t\u001f\u0001 \u0001 \u0003 \u0104\b \u0001!\u0001"+
		"!\u0003!\u0108\b!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0003#\u0110"+
		"\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u0118\b$\u0001$\u0000"+
		"\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0000\u0117\u0000M\u0001"+
		"\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004\\\u0001\u0000"+
		"\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000"+
		"\nl\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000ez\u0001\u0000"+
		"\u0000\u0000\u0010\u0082\u0001\u0000\u0000\u0000\u0012\u008a\u0001\u0000"+
		"\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000"+
		"\u0000\u0000\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u0098\u0001\u0000"+
		"\u0000\u0000\u001c\u009a\u0001\u0000\u0000\u0000\u001e\u009c\u0001\u0000"+
		"\u0000\u0000 \u009f\u0001\u0000\u0000\u0000\"\u00a4\u0001\u0000\u0000"+
		"\u0000$\u00ab\u0001\u0000\u0000\u0000&\u00ad\u0001\u0000\u0000\u0000("+
		"\u00b0\u0001\u0000\u0000\u0000*\u00b5\u0001\u0000\u0000\u0000,\u00b7\u0001"+
		"\u0000\u0000\u0000.\u00c2\u0001\u0000\u0000\u00000\u00c4\u0001\u0000\u0000"+
		"\u00002\u00cf\u0001\u0000\u0000\u00004\u00d7\u0001\u0000\u0000\u00006"+
		"\u00e0\u0001\u0000\u0000\u00008\u00e8\u0001\u0000\u0000\u0000:\u00f1\u0001"+
		"\u0000\u0000\u0000<\u00f3\u0001\u0000\u0000\u0000>\u00fe\u0001\u0000\u0000"+
		"\u0000@\u0103\u0001\u0000\u0000\u0000B\u0105\u0001\u0000\u0000\u0000D"+
		"\u010b\u0001\u0000\u0000\u0000F\u010d\u0001\u0000\u0000\u0000H\u0117\u0001"+
		"\u0000\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0000"+
		"\u0000\u0001Q\u0001\u0001\u0000\u0000\u0000RS\u0005\u0001\u0000\u0000"+
		"ST\u0005\u0002\u0000\u0000TU\u0003\u0004\u0002\u0000UV\u0005\u001b\u0000"+
		"\u0000VW\u0003\u0006\u0003\u0000WX\u0005\u001c\u0000\u0000XZ\u0003>\u001f"+
		"\u0000Y[\u0005\u001d\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\u0003\u0001\u0000\u0000\u0000\\]\u0003H$\u0000]\u0005\u0001"+
		"\u0000\u0000\u0000^c\u0003\b\u0004\u0000_`\u0005\u001e\u0000\u0000`b\u0003"+
		"\b\u0004\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0007\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fk\u0003\n\u0005\u0000gk\u00030\u0018"+
		"\u0000hk\u00034\u001a\u0000ik\u00038\u001c\u0000jf\u0001\u0000\u0000\u0000"+
		"jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000k\t\u0001\u0000\u0000\u0000lm\u0003\f\u0006\u0000mn\u0003\u000e"+
		"\u0007\u0000np\u0003\"\u0011\u0000oq\u0003\u001e\u000f\u0000po\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000q\u000b\u0001\u0000\u0000\u0000"+
		"rs\u0003H$\u0000s\r\u0001\u0000\u0000\u0000t{\u0003\u0010\b\u0000u{\u0003"+
		"\u0016\u000b\u0000v{\u0003\u0012\t\u0000w{\u0003\u0018\f\u0000x{\u0003"+
		"\u001a\r\u0000y{\u0003\u001c\u000e\u0000zt\u0001\u0000\u0000\u0000zu\u0001"+
		"\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u000f\u0001\u0000"+
		"\u0000\u0000|\u0083\u0005\u0004\u0000\u0000}~\u0005\u0004\u0000\u0000"+
		"~\u007f\u0005\u001b\u0000\u0000\u007f\u0080\u0003\u0014\n\u0000\u0080"+
		"\u0081\u0005\u001c\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082"+
		"|\u0001\u0000\u0000\u0000\u0082}\u0001\u0000\u0000\u0000\u0083\u0011\u0001"+
		"\u0000\u0000\u0000\u0084\u008b\u0005\u0010\u0000\u0000\u0085\u0086\u0005"+
		"\u0010\u0000\u0000\u0086\u0087\u0005\u001b\u0000\u0000\u0087\u0088\u0003"+
		"\u0014\n\u0000\u0088\u0089\u0005\u001c\u0000\u0000\u0089\u008b\u0001\u0000"+
		"\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0085\u0001\u0000"+
		"\u0000\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0018"+
		"\u0000\u0000\u008d\u0015\u0001\u0000\u0000\u0000\u008e\u0095\u0005\u0005"+
		"\u0000\u0000\u008f\u0090\u0005\u0005\u0000\u0000\u0090\u0091\u0005\u001b"+
		"\u0000\u0000\u0091\u0092\u0003\u0014\n\u0000\u0092\u0093\u0005\u001c\u0000"+
		"\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000\u0000"+
		"\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0095\u0017\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u0011\u0000\u0000\u0097\u0019\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005\u0012\u0000\u0000\u0099\u001b\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u0013\u0000\u0000\u009b\u001d\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u0006\u0000\u0000\u009d\u009e\u0003 \u0010\u0000"+
		"\u009e\u001f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u001f\u0000\u0000"+
		"\u00a0!\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003$\u0012\u0000\u00a2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5#\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00ac\u0003"+
		"&\u0013\u0000\u00a8\u00ac\u0003(\u0014\u0000\u00a9\u00ac\u0003*\u0015"+
		"\u0000\u00aa\u00ac\u0003,\u0016\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac%\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005\u0007\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af"+
		"\'\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0014\u0000\u0000\u00b1)"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b6\u0005\u000b\u0000\u0000\u00b3\u00b4"+
		"\u0005\n\u0000\u0000\u00b4\u00b6\u0005\u000b\u0000\u0000\u00b5\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6+\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\f\u0000\u0000\u00b8\u00b9\u0003.\u0017"+
		"\u0000\u00b9-\u0001\u0000\u0000\u0000\u00ba\u00c3\u0005\u001f\u0000\u0000"+
		"\u00bb\u00c3\u0005\u0018\u0000\u0000\u00bc\u00c0\u0005\u000f\u0000\u0000"+
		"\u00bd\u00be\u0005\r\u0000\u0000\u00be\u00bf\u0005\u000e\u0000\u0000\u00bf"+
		"\u00c1\u0005\u000f\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2"+
		"\u00ba\u0001\u0000\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c2"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c3/\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0005\u0003\u0000\u0000\u00c5\u00c7\u0003H$\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005\u001b\u0000\u0000\u00c9\u00ca\u00032\u0019"+
		"\u0000\u00ca\u00cd\u0005\u001c\u0000\u0000\u00cb\u00cc\u0005\u0016\u0000"+
		"\u0000\u00cc\u00ce\u0005\u0017\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce1\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d4\u0003H$\u0000\u00d0\u00d1\u0005\u001e\u0000\u0000\u00d1\u00d3"+
		"\u0003H$\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d53\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0007\u0000\u0000\u00d8\u00da\u0005\u0003\u0000"+
		"\u0000\u00d9\u00db\u0003H$\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\u001b\u0000\u0000\u00dd\u00de\u00036\u001b\u0000\u00de\u00df"+
		"\u0005\u001c\u0000\u0000\u00df5\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003"+
		"H$\u0000\u00e1\u00e2\u0005\u001e\u0000\u0000\u00e2\u00e4\u0003H$\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e67\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\b\u0000\u0000\u00e9\u00eb\u0005\u0003\u0000\u0000\u00ea\u00ec"+
		"\u0003:\u001d\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		"\u001b\u0000\u0000\u00ee\u00ef\u0003<\u001e\u0000\u00ef\u00f0\u0005\u001c"+
		"\u0000\u0000\u00f09\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003H$\u0000"+
		"\u00f2;\u0001\u0000\u0000\u0000\u00f3\u00f8\u0003H$\u0000\u00f4\u00f5"+
		"\u0005\u001e\u0000\u0000\u00f5\u00f7\u0003H$\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9=\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fd\u0003@ \u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"?\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0104"+
		"\u0003B!\u0000\u0102\u0104\u0003F#\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104A\u0001\u0000\u0000\u0000"+
		"\u0105\u0107\u0005\u0006\u0000\u0000\u0106\u0108\u0005\t\u0000\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0003D\"\u0000\u010aC\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005\u001f\u0000\u0000\u010cE\u0001\u0000"+
		"\u0000\u0000\u010d\u010f\u0005\u0014\u0000\u0000\u010e\u0110\u0005\t\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0018\u0000"+
		"\u0000\u0112G\u0001\u0000\u0000\u0000\u0113\u0118\u0005\u0019\u0000\u0000"+
		"\u0114\u0115\u0005\u0015\u0000\u0000\u0115\u0116\u0005\u0019\u0000\u0000"+
		"\u0116\u0118\u0005\u0015\u0000\u0000\u0117\u0113\u0001\u0000\u0000\u0000"+
		"\u0117\u0114\u0001\u0000\u0000\u0000\u0118I\u0001\u0000\u0000\u0000\u001a"+
		"MZcjpz\u0082\u008a\u0094\u00a4\u00ab\u00b5\u00c0\u00c2\u00c6\u00cd\u00d4"+
		"\u00da\u00e5\u00eb\u00f8\u00fe\u0103\u0107\u010f\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}