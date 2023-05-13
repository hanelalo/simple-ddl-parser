parser grammar DdlParser;

options { tokenVocab=DdlLexer;}

parse: creatTable* EOF;

creatTable: CREATE TABLE tableName LEFT_BRACKETS tableDefinitions RIGHT_BRACKETS tableOptions SEMICOLON?;

tableName: id;

tableDefinitions: tableDefinition (COMMA tableDefinition)*;

tableDefinition: columnOption | indexOption | primaryKey | uniqueKey;

columnOption: columnName columnType columnAttrOptions comment?;

columnName: id;

columnType: intType | varcharType | textType | dateType | datetimeType | timestampType;

intType: INT | (INT LEFT_BRACKETS columnLength RIGHT_BRACKETS);

textType: TEXT | (TEXT LEFT_BRACKETS columnLength RIGHT_BRACKETS);

columnLength: NUMBER;

varcharType: VARCHAR | (VARCHAR LEFT_BRACKETS columnLength RIGHT_BRACKETS);

dateType: DATE;

datetimeType: DATETIME;

timestampType: TIMESTAMP;

comment: COMMENT commentContent;

commentContent: ANY_STRING;

columnAttrOptions: columnAttrOption*;

columnAttrOption: primaryKeyOption | autoincrementOption | nullOption | defaultOption;

primaryKeyOption: PRIMARY KEY;

autoincrementOption: AUTO_INCRMENT;

nullOption: NULL | NOT NULL;

defaultOption: DEFAULT defaultValue;

defaultValue: ANY_STRING | NUMBER | (CURRENT_TIMESTAMP (ON UPDATE CURRENT_TIMESTAMP)?);

indexOption: KEY id? LEFT_BRACKETS indexColumns RIGHT_BRACKETS (USING BTREE)?;

indexColumns: id (COMMA id)*;

primaryKey: PRIMARY KEY id? LEFT_BRACKETS primaryKeyColumn RIGHT_BRACKETS;

primaryKeyColumn: id(COMMA id)*;

uniqueKey: UNIQUE KEY uniqueKeyName? LEFT_BRACKETS uniqueKeyColumn RIGHT_BRACKETS;

uniqueKeyName: id;

uniqueKeyColumn: id(COMMA id)*;

tableOptions: tableOption*;

tableOption: tableComment | autoIncrementTableOption;

tableComment: COMMENT EQUALS? tabelCommentContent;

tabelCommentContent: ANY_STRING;

autoIncrementTableOption: AUTO_INCRMENT EQUALS? NUMBER;

id: ID | (BACKQUOTE ID BACKQUOTE);