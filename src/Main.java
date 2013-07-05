import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

public class Main {	
	public static void main(String[] args) throws Exception {
		String line, string = "";
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while((line = input.readLine()) != null) string += line;
		
		System.out.println(new prettyprinterParser(new CommonTokenStream(new prettyprinterLexer(
				new ANTLRStringStream(string)))).s().texto);
	 }
}
