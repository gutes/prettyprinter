import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Test {	
	
	public static void main(String[] args) throws Exception {
		for (String test : testCases) {
			parseString(test);
			System.out.println("=======================");
		}
	}
	
	public static void parseString(String s) throws RecognitionException {	 
		ANTLRStringStream in = new ANTLRStringStream(s);
		prettyprinterLexer lexer = new prettyprinterLexer(in) {
			@Override
			public void reportError(RecognitionException e) {
				super.reportError(e);
				throw new RuntimeException();
			}
		};
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		prettyprinterParser parser = new prettyprinterParser(tokens) {
			@Override
			public void reportError(RecognitionException e) {
				super.reportError(e);
				throw new RuntimeException();
			}
		};
		
		try {
			System.out.println(parser.s().texto);
		} catch (RuntimeException e) {}
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
	
	static String html5_invalid = 
		"<html><head><ti" + "\n" +
		"tle>esto es un título</title></head></html>";
	
	static String html6_invalid = 
		"<html>texto</html>";
	
	private static String[] testCases = {
		html1_valid, 
		html2_valid, 
		html3_invalid, 
		html4_invalid, 
		html5_invalid, 
		html6_invalid,
	};
	
}
