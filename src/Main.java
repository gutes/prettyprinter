import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class Main {	
	
	public static void main(String[] args) throws Exception {
		prettyprinterLexer lexer = new prettyprinterLexer(new ANTLRInputStream(System.in)) {
			@Override
			public void reportError(RecognitionException e) {
				super.reportError(e);
				throw new RuntimeException();
			}
		};
		
		prettyprinterParser parser = new prettyprinterParser(new CommonTokenStream(lexer)) {
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
	
}
