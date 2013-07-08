import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

public class Test {	
	private String[] testCases = {html1_valid, html2_valid}; 
	
	
	public static void main(String[] args) throws Exception {
		parseString(html1_valid);
		System.out.println("=======================");
		parseString(html2_valid);
		System.out.println("=======================");
		parseString(html3_invalid);
		System.out.println("=======================");
		parseString(html4_invalid);
	}
	
	
	
	public static void parseString(String s) throws Exception{	 
		ANTLRStringStream in = new ANTLRStringStream(s);
		prettyprinterLexer lexer = new prettyprinterLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		prettyprinterParser parser = new prettyprinterParser(tokens);
		System.out.println(parser.s().texto);
	}
	
	static String html1_valid = 
			"<html>  <head> <title>T’tulo</title> <script>print(\"hello\")</script>\n" +
			"</head><body>\n" +
			"texto<p>p‡rrafo <h1><!-- comentario--><p> m‡s texto</p></h1></p>\n" +
			"<div>texto texto texto <br> mas texto texto      texto</div>\n" +
			"\n" +
			"</body>\n" +
			"</html>\n";
	
	static String html2_valid = 
			"<html>  <head> <script>print(\"a script\")</script><title>T’tulo</title> <script>print(\"hello\")</script><script>print(\"world\")</script>\n" +
			"</head><body>\n" +
			"texto suelto<p>p‡rrafo <h1><!-- comentario--><p> m‡s texto</p></h1></p>\n" +
			"<div>texto texto texto <br> mas texto texto      texto</div>\n" +
			"<div>Un Div que adentro tiene otro<div>Dentro <div><p>de otro</p> con mas texto</div></div></div>"+
			"\n" +"</body>\n</html>\n";
	
	static String html3_invalid = 
			"<html>  T’tulo</title> <script>print(\"hello\")</script><script>print(\"world\")</script>\n" +
			"</head><body>\n" +
			"texto suelto<p>p‡rrafo <h1><!-- comentario--><p> m‡s texto</p></h1></p>\n" +
			"<div>texto texto texto <br> mas texto texto      texto</div>\n" +
			"<div>Un Div que adentro tiene otro<div>Dentro <div><p>de otro</p> con mas texto</div></div></div>"+
			"\n" +"</body>\n</html>\n";
	
	static String html4_invalid = 
			"<html>  <head> <script>print(\"a script\")</script><title>T’tulo</title> <script>print(\"hello\")</script><script>print(\"world\")</script>\n" +
			"</head><body>\n" +
			"texto suelto<p>p‡rrafo <h1><!-- comentario--><p> m‡s texto</p></h1></p>\n" +
			"<div>texto texto texto <br> mas texto texto      texto\n" +
			"<div>Un Div que adentro tiene otro<div>Dentro <div><p>de otro</p> con mas texto</div></div></div>"+
			"\n" +"</body>\n</html>\n";
	
}
