lexer grammar DdlLexer;

options {caseInsensitive=true;}

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
UPDATE: 'update';
CURRENT_TIMESTAMP: 'current_timestamp';
TEXT: 'text';
DATE: 'date';
DATETIME: 'datetime';
TIMESTAMP: 'timestamp';
AUTO_INCRMENT: 'auto_increment';
BACKQUOTE: '`';
USING: 'using';
BTREE: 'btree';
UNSIGNED: 'unsigned';
BIGINT: 'bigint';
LONGTEXT: 'longtext';

NUMBER: [0-9]+;
ID: ([0-9a-z][0-9a-z_]*[0-9a-z]);
WS: [ \t\r\n]+ -> skip;
LEFT_BRACKETS: '(';
RIGHT_BRACKETS: ')';
SEMICOLON: ';';
COMMA: ',';
ANY_STRING: DQUOTA_STRING|SQUOTA_STRING|BQUOTA_STRING;
fragment DQUOTA_STRING:              '"' ( '\\'. | '""' | ~('"'| '\\') )* '"';
fragment SQUOTA_STRING:              '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';
fragment BQUOTA_STRING:              '`' ( '\\'. | '``' | ~('`'|'\\'))* '`';
