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
  : (head)? (body)?;

head
  : TK_HEAD he TK_C_HEAD;

body
  : TK_BODY b TK_C_BODY;
  
he
  : scs TK_TITLE TK_TEXTO TK_C_TITLE scs;

scs
  : sc scs
  | ; /*LAMBDA*/

sc
  : TK_SCRIPT tsc TK_C_SCRIPT;

tsc
  : TK_HTML tsc | TK_C_HTML tsc 
  | TK_HEAD tsc | TK_C_HEAD tsc 
  | TK_BODY tsc | TK_C_BODY tsc 
  | TK_TITLE tsc | TK_C_TITLE tsc
  | TK_DIV tsc | TK_C_DIV tsc 
  | TK_H1 tsc | TK_C_H1 tsc 
  | TK_P tsc | TK_C_P tsc 
  | TK_SCRIPT tsc 
  | TK_BR tsc 
  | TK_TEXTO tsc 
  | ; /*LAMBDA*/

b
  : TK_TEXTO b
  | TK_DIV b TK_C_DIV b
  | TK_H1 b TK_C_H1 b 
  | TK_P b TK_C_P b 
  | TK_BR b 
  | ; 
  
  
/* *********** TOKENS *********** */

  WS :  (' ' | '\t' | '\r' | '\n')+ {$channel=HIDDEN;};     //para ignorar los blancos
  COMM : '<!' .* '>' {$channel=HIDDEN;};                    //para ignorar comentarios
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
  TK_TEXTO : (~('<'))+;                                     //todo menos < 
  //TK_TEXTO : ('a'..'z'|'A'..'Z'|'0'..'9'|' ')+;
  
/*
<html>
    <head>
      <title>loco</title>
    <script>asdasd asd</script>
    </head>

    <body>
        <div>hola</div>
    </body>    

    <!--Esto es un comentario. asd!"·"!·$$·"!$  -->
</html>
*/
