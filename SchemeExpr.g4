
grammar SchemeExpr;

prog:  expr+               # progl
    ;

expr: DOUBLE                 # doublel
    | '(' op=('*'|'/') expr* ')' #MulDiv
    | '(' op=('+'|'-') expr* ')' #AddSub
    | '(' 'def' ID expr ')'  #define
    | ID                     #id
    ;


DOUBLE: ('-')? '0'..'9'+ ('.' ('0'..'9')*)?;
NEWLINE: '\r'? '\n' -> skip;
WS: [ \t]+ -> skip;
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';ID:  [a-zA-Z]+;