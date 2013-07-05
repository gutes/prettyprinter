grammar prettyprinter;

options {
    language = Java;
    output = AST;
}


/* *********** PRODUCCIONES *********** */

//  TODO leer de stdin
//  TODO no acepta el signo < en los scripts, excepto que sean tags  
//    (ejemplo: if (x < 5) en un script no parsea) porque TK_TEXTO es todo menos '<' 
//  TODO pinta los tags en scripts y no debería (porque los span están en los tokens; se podría corregir)

s returns [String texto]
  : t1=TK_HTML h1=h t2=TK_C_HTML {
      $texto = 
          "<html><head>" + 
          "<style type=\"text/css\">" + 
          "div.bloque {margin-left: 2em;}" + 
          "span.html {color:black;}" +
          "span.p {color:purple;}" +
          "span.head {color:blue;}" +
          "span.body {color:blue;}" +
          "span.title {color:red;}" +
          "span.script_tag {color:red;}" +
          "span.script {color:grey;}" +
          "span.h1 {color:fuchsia;}" +
          "span.div {color:green;}" +
          "span.br {color:orange;}" +
          "</style>" +
          "</head><body>" +
          $t1.getText() + $h1.texto + $t2.getText() + 
          "</body></html>"
      ;
  };
  
h returns [String texto]
  : {$texto = "";} 
    (h1=head {$texto += $h1.texto;})? 
    (b1=body {$texto += $b1.texto;})?
  ;

head returns [String texto]
  : t1=TK_HEAD h1=he t2=TK_C_HEAD {
      $texto = "<div class=\"bloque\">" + $t1.getText() + $h1.texto 
      + $t2.getText() + "</div>";
  };

body returns [String texto]
  : t1=TK_BODY b1=b t2=TK_C_BODY {
      $texto = "<div class=\"bloque\">" + $t1.getText() + $b1.texto 
      + $t2.getText() + "</div>";
  };
  
he returns [String texto]
  : sc1=scs t1=TK_TITLE t2=TK_TEXTO t3=TK_C_TITLE scs2=scs {
      $texto = $sc1.texto + "<div class=\"bloque\">" + $t1.getText() 
      + $t2.getText() + $t3.getText() + "</div>" + $scs2.texto;
  };

scs returns [String texto]
  : sc1=sc scs1=scs {$texto = $sc.texto + $scs1.texto;}
  | {$texto = "";}  //lambda
  ; 

sc returns [String texto]
  : t1=TK_SCRIPT ts=tsc t2=TK_C_SCRIPT {
      $texto = "<div class=\"bloque\">" + $t1.getText() + "<div class=\"bloque\">"
      + "<span class=\"script\">" + $ts.texto + "</span>" + "</div>" + $t2.getText() + "</div>";
  };  

tsc returns [String texto]
  : (
      tk=TK_HTML ts=tsc | tk=TK_C_HTML ts=tsc
    | tk=TK_HEAD ts=tsc | tk=TK_C_HEAD ts=tsc
    | tk=TK_BODY ts=tsc | tk=TK_C_BODY ts=tsc
    | tk=TK_TITLE ts=tsc | tk=TK_C_TITLE ts=tsc
    | tk=TK_DIV ts=tsc | tk=TK_C_DIV ts=tsc   
    | tk=TK_H1 ts=tsc | tk=TK_C_H1 ts=tsc    
    | tk=TK_P ts=tsc | tk=TK_C_P ts=tsc
    | tk=TK_SCRIPT ts=tsc
    | tk=TK_BR ts=tsc
    | tk=TK_TEXTO ts=tsc
   ) {$texto = $tk.getText() + $ts.texto;}
  | {$texto = "";} //lambda
  ;
  
b returns [String texto]
  : t1=TK_TEXTO b1=b {
        $texto = "<div class=\"bloque\">" + $t1.getText()  + "</div>" + $b1.texto;
    }
  | t1=TK_DIV b1=b t2=TK_C_DIV b2=b {
        $texto = "<div class=\"bloque\">" + $t1.getText() + $b1.texto 
        + $t2.getText() + "</div>" + $b2.texto;
    }
  | t1=TK_H1 b1=b t2=TK_C_H1 b2=b {
        $texto = "<div class=\"bloque\">" + $t1.getText() + $b1.texto 
        + $t2.getText() + "</div>" + $b2.texto;
    }
  | t1=TK_P b1=b t2=TK_C_P b2=b {
        $texto = "<div class=\"bloque\">" + $t1.getText() + $b1.texto 
        + $t2.getText() + "</div>" + $b2.texto;
    }
  | t1=TK_BR b1=b {
        $texto = "<div class=\"bloque\">" + $t1.getText()  + "</div>" + $b1.texto;
    } 
  | {
        $texto = "";  //lambda
  }; 
  

/* *********** TOKENS *********** */

WS : (' ' | '\t' | '\r' | '\n')+ {
    $channel = HIDDEN;  //para ignorar los blancos
}; 
      
COMM : '<!' .* '>' {
    $channel = HIDDEN;  //para ignorar comentarios
};               

TK_HTML returns [String texto]: '<html>' {
    setText("<span class=\"html\">&lt;html&gt;</span>");
};

TK_C_HTML returns [String texto]: '</html>' {
    setText("<span class=\"html\">&lt;/html&gt;</span>");
};

TK_HEAD : '<head>' {
    setText("<span class=\"head\">&lt;head&gt;</span>");
};

TK_C_HEAD : '</head>' {
    setText("<span class=\"head\">&lt;/head&gt;</span>");
};

TK_TITLE : '<title>' {
    setText("<span class=\"title\">&lt;title&gt;</span>");
};

TK_C_TITLE : '</title>' {
    setText("<span class=\"title\">&lt;/title&gt;</span>");
};

TK_SCRIPT : '<script>' {
    setText("<span class=\"script_tag\">&lt;script&gt;</span>");
};

TK_C_SCRIPT : '</script>' {
    setText("<span class=\"script_tag\">&lt;/script&gt;</span>");
};

TK_BODY : '<body>' {
    setText("<span class=\"body\">&lt;body&gt;</span>");
};

TK_C_BODY : '</body>' {
    setText("<span class=\"body\">&lt;/body&gt;</span>");
};

TK_H1 : '<h1>' {
    setText("<span class=\"h1\">&lt;h1&gt;</span>");
};

TK_C_H1 : '</h1>' {
    setText("<span class=\"h1\">&lt;/h1&gt;</span>");
};

TK_DIV : '<div>' {
    setText("<span class=\"div\">&lt;div&gt;</span>");
};

TK_C_DIV : '</div>' {
    setText("<span class=\"div\">&lt;/div&gt;</span>");
};

TK_P : '<p>' {
    setText("<span class=\"p\">&lt;p&gt;</span>");
};

TK_C_P : '</p>' {
    setText("<span class=\"p\">&lt;/p&gt;</span>");
};

TK_BR : '<br>' {
    setText("<span class=\"br\">&lt;br&gt;</span>");
};

TK_TEXTO : (~('<'))+;  //todo menos <
