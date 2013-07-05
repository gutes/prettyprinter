// $ANTLR 3.5 C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g 2013-07-05 20:37:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class prettyprinterLexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMM=4;
	public static final int TK_BODY=5;
	public static final int TK_BR=6;
	public static final int TK_C_BODY=7;
	public static final int TK_C_DIV=8;
	public static final int TK_C_H1=9;
	public static final int TK_C_HEAD=10;
	public static final int TK_C_HTML=11;
	public static final int TK_C_P=12;
	public static final int TK_C_SCRIPT=13;
	public static final int TK_C_TITLE=14;
	public static final int TK_DIV=15;
	public static final int TK_H1=16;
	public static final int TK_HEAD=17;
	public static final int TK_HTML=18;
	public static final int TK_P=19;
	public static final int TK_SCRIPT=20;
	public static final int TK_TEXTO=21;
	public static final int TK_TITLE=22;
	public static final int WS=23;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public prettyprinterLexer() {} 
	public prettyprinterLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public prettyprinterLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g"; }

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:116:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:116:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:116:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}


			    _channel = HIDDEN;  //para ignorar los blancos

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMM"
	public final void mCOMM() throws RecognitionException {
		try {
			int _type = COMM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:120:6: ( '<!' ( . )* '>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:120:8: '<!' ( . )* '>'
			{
			match("<!"); 

			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:120:13: ( . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='>') ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '=')||(LA2_0 >= '?' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:120:13: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			match('>'); 

			    _channel = HIDDEN;  //para ignorar comentarios

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMM"

	// $ANTLR start "TK_HTML"
	public final void mTK_HTML() throws RecognitionException {
		String texto = null;


		try {
			int _type = TK_HTML;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:124:31: ( '<html>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:124:33: '<html>'
			{
			match("<html>"); 


			    setText("<span class=\"html\">&lt;html&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_HTML"

	// $ANTLR start "TK_C_HTML"
	public final void mTK_C_HTML() throws RecognitionException {
		String texto = null;


		try {
			int _type = TK_C_HTML;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:128:33: ( '</html>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:128:35: '</html>'
			{
			match("</html>"); 


			    setText("<span class=\"html\">&lt;/html&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_C_HTML"

	// $ANTLR start "TK_HEAD"
	public final void mTK_HEAD() throws RecognitionException {
		try {
			int _type = TK_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:132:9: ( '<head>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:132:11: '<head>'
			{
			match("<head>"); 


			    setText("<span class=\"head\">&lt;head&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_HEAD"

	// $ANTLR start "TK_C_HEAD"
	public final void mTK_C_HEAD() throws RecognitionException {
		try {
			int _type = TK_C_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:136:11: ( '</head>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:136:13: '</head>'
			{
			match("</head>"); 


			    setText("<span class=\"head\">&lt;/head&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_C_HEAD"

	// $ANTLR start "TK_TITLE"
	public final void mTK_TITLE() throws RecognitionException {
		try {
			int _type = TK_TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:140:10: ( '<title>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:140:12: '<title>'
			{
			match("<title>"); 


			    setText("<span class=\"title\">&lt;title&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_TITLE"

	// $ANTLR start "TK_C_TITLE"
	public final void mTK_C_TITLE() throws RecognitionException {
		try {
			int _type = TK_C_TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:144:12: ( '</title>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:144:14: '</title>'
			{
			match("</title>"); 


			    setText("<span class=\"title\">&lt;/title&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_C_TITLE"

	// $ANTLR start "TK_SCRIPT"
	public final void mTK_SCRIPT() throws RecognitionException {
		try {
			int _type = TK_SCRIPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:148:11: ( '<script>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:148:13: '<script>'
			{
			match("<script>"); 


			    setText("<span class=\"script_tag\">&lt;script&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_SCRIPT"

	// $ANTLR start "TK_C_SCRIPT"
	public final void mTK_C_SCRIPT() throws RecognitionException {
		try {
			int _type = TK_C_SCRIPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:152:13: ( '</script>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:152:15: '</script>'
			{
			match("</script>"); 


			    setText("<span class=\"script_tag\">&lt;/script&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_C_SCRIPT"

	// $ANTLR start "TK_BODY"
	public final void mTK_BODY() throws RecognitionException {
		try {
			int _type = TK_BODY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:156:9: ( '<body>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:156:11: '<body>'
			{
			match("<body>"); 


			    setText("<span class=\"body\">&lt;body&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_BODY"

	// $ANTLR start "TK_C_BODY"
	public final void mTK_C_BODY() throws RecognitionException {
		try {
			int _type = TK_C_BODY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:160:11: ( '</body>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:160:13: '</body>'
			{
			match("</body>"); 


			    setText("<span class=\"body\">&lt;/body&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_C_BODY"

	// $ANTLR start "TK_H1"
	public final void mTK_H1() throws RecognitionException {
		try {
			int _type = TK_H1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:164:7: ( '<h1>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:164:9: '<h1>'
			{
			match("<h1>"); 


			    setText("<span class=\"h1\">&lt;h1&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_H1"

	// $ANTLR start "TK_C_H1"
	public final void mTK_C_H1() throws RecognitionException {
		try {
			int _type = TK_C_H1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:168:9: ( '</h1>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:168:11: '</h1>'
			{
			match("</h1>"); 


			    setText("<span class=\"h1\">&lt;/h1&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_C_H1"

	// $ANTLR start "TK_DIV"
	public final void mTK_DIV() throws RecognitionException {
		try {
			int _type = TK_DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:172:8: ( '<div>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:172:10: '<div>'
			{
			match("<div>"); 


			    setText("<span class=\"div\">&lt;div&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_DIV"

	// $ANTLR start "TK_C_DIV"
	public final void mTK_C_DIV() throws RecognitionException {
		try {
			int _type = TK_C_DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:176:10: ( '</div>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:176:12: '</div>'
			{
			match("</div>"); 


			    setText("<span class=\"div\">&lt;/div&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_C_DIV"

	// $ANTLR start "TK_P"
	public final void mTK_P() throws RecognitionException {
		try {
			int _type = TK_P;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:180:6: ( '<p>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:180:8: '<p>'
			{
			match("<p>"); 


			    setText("<span class=\"p\">&lt;p&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_P"

	// $ANTLR start "TK_C_P"
	public final void mTK_C_P() throws RecognitionException {
		try {
			int _type = TK_C_P;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:184:8: ( '</p>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:184:10: '</p>'
			{
			match("</p>"); 


			    setText("<span class=\"p\">&lt;/p&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_C_P"

	// $ANTLR start "TK_BR"
	public final void mTK_BR() throws RecognitionException {
		try {
			int _type = TK_BR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:188:7: ( '<br>' )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:188:9: '<br>'
			{
			match("<br>"); 


			    setText("<span class=\"br\">&lt;br&gt;</span>");

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_BR"

	// $ANTLR start "TK_TEXTO"
	public final void mTK_TEXTO() throws RecognitionException {
		try {
			int _type = TK_TEXTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:192:10: ( (~ ( '<' ) )+ )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:192:12: (~ ( '<' ) )+
			{
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:192:12: (~ ( '<' ) )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= ';')||(LA3_0 >= '=' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ';')||(input.LA(1) >= '=' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TK_TEXTO"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:8: ( WS | COMM | TK_HTML | TK_C_HTML | TK_HEAD | TK_C_HEAD | TK_TITLE | TK_C_TITLE | TK_SCRIPT | TK_C_SCRIPT | TK_BODY | TK_C_BODY | TK_H1 | TK_C_H1 | TK_DIV | TK_C_DIV | TK_P | TK_C_P | TK_BR | TK_TEXTO )
		int alt4=20;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:10: WS
				{
				mWS(); 

				}
				break;
			case 2 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:13: COMM
				{
				mCOMM(); 

				}
				break;
			case 3 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:18: TK_HTML
				{
				mTK_HTML(); 

				}
				break;
			case 4 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:26: TK_C_HTML
				{
				mTK_C_HTML(); 

				}
				break;
			case 5 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:36: TK_HEAD
				{
				mTK_HEAD(); 

				}
				break;
			case 6 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:44: TK_C_HEAD
				{
				mTK_C_HEAD(); 

				}
				break;
			case 7 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:54: TK_TITLE
				{
				mTK_TITLE(); 

				}
				break;
			case 8 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:63: TK_C_TITLE
				{
				mTK_C_TITLE(); 

				}
				break;
			case 9 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:74: TK_SCRIPT
				{
				mTK_SCRIPT(); 

				}
				break;
			case 10 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:84: TK_C_SCRIPT
				{
				mTK_C_SCRIPT(); 

				}
				break;
			case 11 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:96: TK_BODY
				{
				mTK_BODY(); 

				}
				break;
			case 12 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:104: TK_C_BODY
				{
				mTK_C_BODY(); 

				}
				break;
			case 13 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:114: TK_H1
				{
				mTK_H1(); 

				}
				break;
			case 14 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:120: TK_C_H1
				{
				mTK_C_H1(); 

				}
				break;
			case 15 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:128: TK_DIV
				{
				mTK_DIV(); 

				}
				break;
			case 16 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:135: TK_C_DIV
				{
				mTK_C_DIV(); 

				}
				break;
			case 17 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:144: TK_P
				{
				mTK_P(); 

				}
				break;
			case 18 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:149: TK_C_P
				{
				mTK_C_P(); 

				}
				break;
			case 19 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:156: TK_BR
				{
				mTK_BR(); 

				}
				break;
			case 20 :
				// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:1:162: TK_TEXTO
				{
				mTK_TEXTO(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\1\4\31\uffff";
	static final String DFA4_eofS =
		"\33\uffff";
	static final String DFA4_minS =
		"\2\0\1\41\3\uffff\1\61\1\142\2\uffff\1\157\5\uffff\1\61\12\uffff";
	static final String DFA4_maxS =
		"\2\uffff\1\164\3\uffff\2\164\2\uffff\1\162\5\uffff\1\164\12\uffff";
	static final String DFA4_acceptS =
		"\3\uffff\1\24\1\1\1\2\2\uffff\1\7\1\11\1\uffff\1\17\1\21\1\3\1\5\1\15"+
		"\1\uffff\1\10\1\12\1\14\1\20\1\22\1\13\1\23\1\4\1\6\1\16";
	static final String DFA4_specialS =
		"\1\0\1\1\31\uffff}>";
	static final String[] DFA4_transitionS = {
			"\11\3\2\1\2\3\1\1\22\3\1\1\33\3\1\2\uffc3\3",
			"\11\3\2\1\2\3\1\1\22\3\1\1\33\3\1\uffff\uffc3\3",
			"\1\5\15\uffff\1\7\62\uffff\1\12\1\uffff\1\13\3\uffff\1\6\7\uffff\1\14"+
			"\2\uffff\1\11\1\10",
			"",
			"",
			"",
			"\1\17\63\uffff\1\16\16\uffff\1\15",
			"\1\23\1\uffff\1\24\3\uffff\1\20\7\uffff\1\25\2\uffff\1\22\1\21",
			"",
			"",
			"\1\26\2\uffff\1\27",
			"",
			"",
			"",
			"",
			"",
			"\1\32\63\uffff\1\31\16\uffff\1\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | COMM | TK_HTML | TK_C_HTML | TK_HEAD | TK_C_HEAD | TK_TITLE | TK_C_TITLE | TK_SCRIPT | TK_C_SCRIPT | TK_BODY | TK_C_BODY | TK_H1 | TK_C_H1 | TK_DIV | TK_C_DIV | TK_P | TK_C_P | TK_BR | TK_TEXTO );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA4_0 = input.LA(1);
						s = -1;
						if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {s = 1;}
						else if ( (LA4_0=='<') ) {s = 2;}
						else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\b')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\u001F')||(LA4_0 >= '!' && LA4_0 <= ';')||(LA4_0 >= '=' && LA4_0 <= '\uFFFF')) ) {s = 3;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA4_1 = input.LA(1);
						s = -1;
						if ( ((LA4_1 >= '\t' && LA4_1 <= '\n')||LA4_1=='\r'||LA4_1==' ') ) {s = 1;}
						else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '\b')||(LA4_1 >= '\u000B' && LA4_1 <= '\f')||(LA4_1 >= '\u000E' && LA4_1 <= '\u001F')||(LA4_1 >= '!' && LA4_1 <= ';')||(LA4_1 >= '=' && LA4_1 <= '\uFFFF')) ) {s = 3;}
						else s = 4;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 4, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
