lexer grammar DdlLexer;

options {caseInsensitive=true;}

LINE_COMMENT:                        (
                                       ('--' [ \t]* | '#') ~[\r\n]* ('\r'? '\n' | EOF)
                                       | '--' ('\r'? '\n' | EOF)
                                     ) -> channel(HIDDEN);

CREATE: 'create';
TABLE: 'table';
KEY: 'key';
INT: 'int';
VARCHAR: 'varchar';
COMMENT: 'comment';
PRIMARY: 'primary';
UNIQUE: 'unique';
EQUALS: '=';
NOT: 'not';
NULL: 'null';
DEFAULT: 'default';
ON: 'on';
BACK_QUOTE: '`';
UPDATE: 'update';
CURRENT_TIMESTAMP: 'current_timestamp';
TEXT: 'text';
DATE: 'date';
DATETIME: 'datetime';
TIMESTAMP: 'timestamp';
AUTO_INCRMENT: 'auto_increment';
USING: 'using';
BTREE: 'btree';
UNSIGNED: 'unsigned';
BIGINT: 'bigint';
LONGTEXT: 'longtext';
ENGINE: 'engine';

NUMBER: [0-9]+;
ID: SIMPLE_ID;
WS: [ \t\r\n]+ -> skip;
LEFT_BRACKETS: '(';
RIGHT_BRACKETS: ')';
SEMICOLON: ';';
COMMA: ',';
fragment SIMPLE_ID: [0-9a-z][0-9a-z_]*[0-9a-z];
ANY_STRING: DQUOTA_STRING | SQUOTA_STRING;
fragment DQUOTA_STRING:              '"' ( '\\'. | '""' | ~('"'| '\\') )* '"';
fragment SQUOTA_STRING:              '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';
