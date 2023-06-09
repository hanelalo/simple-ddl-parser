parser grammar DdlParser;

options { tokenVocab=DdlLexer;}

parse: creatTable* EOF;

creatTable: CREATE TABLE tableName LEFT_BRACKETS tableDefinitions RIGHT_BRACKETS tableOptions SEMICOLON?;

tableName: id;

tableDefinitions: tableDefinition (COMMA tableDefinition)*;

tableDefinition: columnOption | indexOption | primaryKey | uniqueKey;

columnOption: columnName columnType columnAttrOptions comment?;

columnName: id;

columnType: intType | bigintType | varcharType | textType | longtextType | dateType | datetimeType | timestampType;

intType: (INT | (INT LEFT_BRACKETS columnLength RIGHT_BRACKETS)) UNSIGNED?;

bigintType: (BIGINT | (BIGINT LEFT_BRACKETS columnLength RIGHT_BRACKETS)) UNSIGNED?;

textType: TEXT | (TEXT LEFT_BRACKETS columnLength RIGHT_BRACKETS);

longtextType: LONGTEXT | (LONGTEXT LEFT_BRACKETS columnLength RIGHT_BRACKETS);

columnLength: NUMBER;

varcharType: VARCHAR | (VARCHAR LEFT_BRACKETS columnLength RIGHT_BRACKETS);

dateType: DATE;

datetimeType: DATETIME;

timestampType: TIMESTAMP;

comment: COMMENT commentContent;

commentContent: ANY_STRING;

columnAttrOptions: columnAttrOption*;

columnAttrOption: primaryKeyOption | autoincrementOption | uniqueColumnAttrOption | nullOption | defaultOption;

uniqueColumnAttrOption: UNIQUE;

primaryKeyOption: PRIMARY KEY;

autoincrementOption: AUTO_INCRMENT;

nullOption: NULL | NOT NULL;

defaultOption: DEFAULT defaultValue;

defaultValue: ANY_STRING | NUMBER | NULL | (CURRENT_TIMESTAMP (ON UPDATE CURRENT_TIMESTAMP)?);

indexOption: KEY indexName? LEFT_BRACKETS indexColumns RIGHT_BRACKETS (USING BTREE)? indexComment?;

indexComment: COMMENT indexCommentContent;

indexCommentContent: ANY_STRING;

indexName: id;

indexColumns: id (COMMA id)*;

primaryKey: PRIMARY KEY primaryKeyName? LEFT_BRACKETS primaryKeyColumn RIGHT_BRACKETS primaryKeyComment?;

primaryKeyComment: COMMENT primaryKeyCommentContent;

primaryKeyCommentContent: ANY_STRING;

primaryKeyName: id;

primaryKeyColumn: id(COMMA id)*;

uniqueKey: UNIQUE KEY uniqueKeyName? LEFT_BRACKETS uniqueKeyColumn RIGHT_BRACKETS uniqueKeyComment?;

uniqueKeyComment: COMMENT uniqueKeyCommentContent;

uniqueKeyCommentContent: ANY_STRING;

uniqueKeyName: id;

uniqueKeyColumn: id(COMMA id)*;

tableOptions: tableOption*;

tableOption: tableComment | autoIncrementTableOption | tableEngineOption;

tableComment: COMMENT EQUALS? tabelCommentContent;

tabelCommentContent: ANY_STRING;

autoIncrementTableOption: AUTO_INCRMENT EQUALS? NUMBER;

tableEngineOption: ENGINE EQUALS? engineName;

engineName: id;

id: ID | BACK_QUOTE ID BACK_QUOTE;