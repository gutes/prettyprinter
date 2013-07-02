grammar prettyprinter;

options {
    // antlr will generate java lexer and parser
    language = Java;
    // generated parser should create abstract syntax tree
    output = AST;
}

/* *********** PRODUCCIONES *********** */


s 
  : TK_HTML h TK_C_HTML;
  
h 
  : bODY 
  | hEAD bODY_1 
  | ; /*LAMBDA*/ 

bODY_1
  : bODY
  | ; /*LAMBDA*/

hEAD
  : TK_HEAD hE TK_C_HEAD;

bODY
  : TK_BODY b TK_C_BODY;
  
hE
  : sCS TK_TITLE TK_TEXTO TK_C_TITLE sCS;

sCS
  : sC sCS
  | ; /*LAMBDA*/

sC
  : TK_SCRIPT tSC TK_C_SCRIPT;

tSC
  : TK_HTML tSC | TK_C_HTML tSC 
  | TK_HEAD tSC | TK_C_HEAD tSC 
  | TK_BODY tSC | TK_C_BODY tSC 
  | TK_TITLE tSC | TK_C_TITLE tSC
  | TK_DIV tSC | TK_C_DIV tSC 
  | TK_H1 tSC | TK_C_H1 tSC 
  | TK_P tSC | TK_C_P tSC 
  | TK_SCRIPT tSC 
  | TK_BR tSC 
  | TK_TEXTO tSC 
  | ; /*LAMBDA*/

b
  : TK_TEXTO b
  | TK_DIV b TK_C_DIV b
  | TK_H1 b TK_C_H1 b 
  | TK_P b TK_C_P b 
  | TK_BR b 
  | ; 


/* *********** TOKENS *********** */
  TK_HTML : '<html>';
  TK_C_HTML : '</html>';
  TK_HEAD : '<head>';
  TK_C_HEAD : '</head>';
  TK_TITLE : '<title>';
  TK_C_TITLE : '</title>';
  TK_SCRIPT : '<script>';
  TK_C_SCRIPT : '</script>';
  TK_BODY : '<body>';
  TK_C_BODY : '</body>';
  TK_H1 : '<h1>';
  TK_C_H1 : '</h1>';
  TK_DIV : '<div>';
  TK_C_DIV : '</div>';
  TK_P : '<p>';
  TK_C_P : '</p>';
  TK_BR : '<br/>';
  TK_TEXTO : ('a'..'z'|'A'..'Z'|' ')+ ;
  
//  <html><head><title>loco</title></head></html>
  