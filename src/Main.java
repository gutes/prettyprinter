import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Main {	
	
	public static void main(String[] args) throws Exception {
		String line, string = "";
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while((line = input.readLine()) != null) string += line + '\n';
		parseString(string);
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
	
}
