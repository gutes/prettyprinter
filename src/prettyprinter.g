grammar prettyprinter;

options {
    // antlr will generate java lexer and parser
    language = Java;
    // generated parser should create abstract syntax tree
    output = AST;
}

/* *********** PRODUCCIONES *********** */

S 
  : TK_HTML H TK_C_HTML;
H 
  : HEAD BODY 
  | HEAD 
  | BODY 
  | ; /*LAMBDA*/

HEAD
  : TK_HEAD HE TK_C_HEAD;

BODY
  : TK_BODY B TK_C_BODY;
  
HE
  : SCS TK_TITLE TK_TEXTO TK_TITLE SCS;

SCS
  : SC SCS
  | ; /*LAMBDA*/

SC
  : TK_SCRIPT TSC TK_C_SCRIPT;

TSC
  : TK_HTML TSC | TK_C_HTML TSC 
  | TK_HEAD TSC | TK_C_HEAD TSC 
  | TK_BODY TSC | TK_C_BODY TSC 
  | TK_TITLE TSC | TK_C_TITLE TSC
  | TK_DIV TSC | TK_C_DIV TSC 
  | TK_H1 TSC | TK_C_H1 TSC 
  | TK_P TSC | TK_C_P TSC 
  | TK_SCRIPT TSC 
  | TK_BR TSC 
  | TK_TEXTO TSC 
  | ; /*LAMBDA*/

B
  : TK_TEXTO B
  | TK_DIV B TK_C_DIV B 
  | TK_H1 B TK_C_H1 B 
  | TK_P B TK_C_P B 
  | TK_BR B 
  | ; 


/* *********** TOKENS *********** */
tokens{
  TK_HTML : "<html>",
  TK_C_HTML : "</html>",
  TK_HEAD : "<head>",
  TK_C_HEAD : "</head>",
  TK_TITLE : "<title>",
  TK_C_TITLE : "</title>",
  TK_SCRIPT : "<script>",
  TK_C_SCRIPT : "</script>",
  TK_BODY : "<body>",
  TK_C_BODY : "</body>",
  TK_H1 : "<h1>",
  TK_C_H1 : "</h1>",
  TK_DIV : "<div>",
  TK_C_DIV : "</div>",
  TK_P : "<p>",
  TK_C_P : "</p>",
  TK_BR : "<br/>",
  TK_TEXTO: ('a'..'z'|'A'..'Z'|' ')+
}