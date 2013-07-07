import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

public class Test {	
	public static void main(String[] args) throws Exception {
		String html1 = 
			"<html>  <head> <title>T’tulo</title> <script>print(\"hello\")</script>\n" +
			"</head><body>\n" +
			"texto<p>p‡rrafo <h1><!-- comentario--><p> m‡s texto</p></h1></p>\n" +
			"<div>texto texto texto <br> mas texto texto      texto</div>\n" +
			"\n" +
			"</body>\n" +
			"</html>\n"
		;
		 
		ANTLRStringStream in = new ANTLRStringStream(html1);
		prettyprinterLexer lexer = new prettyprinterLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		prettyprinterParser parser = new prettyprinterParser(tokens);
		System.out.println(parser.s().texto);
	}
}
