import org.antlr.runtime.*;
import static java.lang.System.out;

public class Test {	
	 public static void main(String[] args) throws Exception {
		 	String html1 = 
		 		"<html>  <head><title>este es el título</title><script>print(hola)</script></head><body>" + 
		 		"Esto es <p> una <h1> prueba </h1> </p> <br>" +
		 		"</body></html>"
		 	;
		 
	        ANTLRStringStream in = new ANTLRStringStream(html1);
	        prettyprinterLexer lexer = new prettyprinterLexer(in);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        prettyprinterParser parser = new prettyprinterParser(tokens);
	        out.println(parser.s().texto);
	    }
}
