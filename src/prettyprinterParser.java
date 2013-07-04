// $ANTLR 3.5 C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g 2013-07-03 22:22:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class prettyprinterParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMM", "TK_BODY", "TK_BR", "TK_C_BODY", 
		"TK_C_DIV", "TK_C_H1", "TK_C_HEAD", "TK_C_HTML", "TK_C_P", "TK_C_SCRIPT", 
		"TK_C_TITLE", "TK_DIV", "TK_H1", "TK_HEAD", "TK_HTML", "TK_P", "TK_SCRIPT", 
		"TK_TEXTO", "TK_TITLE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public prettyprinterParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public prettyprinterParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return prettyprinterParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g"; }


	public static class s_return extends ParserRuleReturnScope {
		public String texto;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "s"
	// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:17:1: s returns [String texto] : t1= TK_HTML h1= h t2= TK_C_HTML ;
	public final prettyprinterParser.s_return s() throws RecognitionException {
		prettyprinterParser.s_return retval = new prettyprinterParser.s_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope h1 =null;

		Object t1_tree=null;
		Object t2_tree=null;

		try {
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:18:3: (t1= TK_HTML h1= h t2= TK_C_HTML )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:18:5: t1= TK_HTML h1= h t2= TK_C_HTML
			{
			root_0 = (Object)adaptor.nil();


			t1=(Token)match(input,TK_HTML,FOLLOW_TK_HTML_in_s55); 
			t1_tree = (Object)adaptor.create(t1);
			adaptor.addChild(root_0, t1_tree);

			pushFollow(FOLLOW_h_in_s59);
			h1=h();
			state._fsp--;

			adaptor.addChild(root_0, h1.getTree());

			t2=(Token)match(input,TK_C_HTML,FOLLOW_TK_C_HTML_in_s63); 
			t2_tree = (Object)adaptor.create(t2);
			adaptor.addChild(root_0, t2_tree);


			      retval.texto = 
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
			          "span.h1 {color:yellow;}" +
			          "span.div {color:green;}" +
			          "span.br {color:orange;}" +
			          "</style>" +
			          "</head><body>" +
			          t1.getText() + (h1!=null?((prettyprinterParser.h_return)h1).texto:null) + t2.getText() + 
			          "</body></html>"
			      ;
			  
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "s"


	public static class h_return extends ParserRuleReturnScope {
		public String texto;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "h"
	// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:40:1: h returns [String texto] : (h1= head )? (b1= body )? ;
	public final prettyprinterParser.h_return h() throws RecognitionException {
		prettyprinterParser.h_return retval = new prettyprinterParser.h_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope h1 =null;
		ParserRuleReturnScope b1 =null;


		try {
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:41:3: ( (h1= head )? (b1= body )? )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:41:5: (h1= head )? (b1= body )?
			{
			root_0 = (Object)adaptor.nil();


			retval.texto = "";
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:42:5: (h1= head )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TK_HEAD) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:42:6: h1= head
					{
					pushFollow(FOLLOW_head_in_h91);
					h1=head();
					state._fsp--;

					adaptor.addChild(root_0, h1.getTree());

					retval.texto += (h1!=null?((prettyprinterParser.head_return)h1).texto:null);
					}
					break;

			}

			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:43:5: (b1= body )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==TK_BODY) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:43:6: b1= body
					{
					pushFollow(FOLLOW_body_in_h105);
					b1=body();
					state._fsp--;

					adaptor.addChild(root_0, b1.getTree());

					retval.texto += (b1!=null?((prettyprinterParser.body_return)b1).texto:null);
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "h"


	public static class head_return extends ParserRuleReturnScope {
		public String texto;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "head"
	// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:46:1: head returns [String texto] : t1= TK_HEAD h1= he t2= TK_C_HEAD ;
	public final prettyprinterParser.head_return head() throws RecognitionException {
		prettyprinterParser.head_return retval = new prettyprinterParser.head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope h1 =null;

		Object t1_tree=null;
		Object t2_tree=null;

		try {
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:47:3: (t1= TK_HEAD h1= he t2= TK_C_HEAD )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:47:5: t1= TK_HEAD h1= he t2= TK_C_HEAD
			{
			root_0 = (Object)adaptor.nil();


			t1=(Token)match(input,TK_HEAD,FOLLOW_TK_HEAD_in_head128); 
			t1_tree = (Object)adaptor.create(t1);
			adaptor.addChild(root_0, t1_tree);

			pushFollow(FOLLOW_he_in_head132);
			h1=he();
			state._fsp--;

			adaptor.addChild(root_0, h1.getTree());

			t2=(Token)match(input,TK_C_HEAD,FOLLOW_TK_C_HEAD_in_head136); 
			t2_tree = (Object)adaptor.create(t2);
			adaptor.addChild(root_0, t2_tree);


			      retval.texto = "<div class=\"bloque\">" + t1.getText() + "<div class=\"bloque\">" 
			      + (h1!=null?((prettyprinterParser.he_return)h1).texto:null) + "</div>" + t2.getText() + "</div>";
			  
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "head"


	public static class body_return extends ParserRuleReturnScope {
		public String texto;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "body"
	// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:52:1: body returns [String texto] : t1= TK_BODY b1= b t2= TK_C_BODY ;
	public final prettyprinterParser.body_return body() throws RecognitionException {
		prettyprinterParser.body_return retval = new prettyprinterParser.body_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope b1 =null;

		Object t1_tree=null;
		Object t2_tree=null;

		try {
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:53:3: (t1= TK_BODY b1= b t2= TK_C_BODY )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:53:5: t1= TK_BODY b1= b t2= TK_C_BODY
			{
			root_0 = (Object)adaptor.nil();


			t1=(Token)match(input,TK_BODY,FOLLOW_TK_BODY_in_body154); 
			t1_tree = (Object)adaptor.create(t1);
			adaptor.addChild(root_0, t1_tree);

			pushFollow(FOLLOW_b_in_body158);
			b1=b();
			state._fsp--;

			adaptor.addChild(root_0, b1.getTree());

			t2=(Token)match(input,TK_C_BODY,FOLLOW_TK_C_BODY_in_body162); 
			t2_tree = (Object)adaptor.create(t2);
			adaptor.addChild(root_0, t2_tree);


			      retval.texto = "<div class=\"bloque\">" + t1.getText() + "<div class=\"bloque\">" 
			      + (b1!=null?((prettyprinterParser.b_return)b1).texto:null) + "</div>" + t2.getText() + "</div>";
			  
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "body"


	public static class he_return extends ParserRuleReturnScope {
		public String texto;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "he"
	// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:58:1: he returns [String texto] : sc1= scs t1= TK_TITLE t2= TK_TEXTO t3= TK_C_TITLE scs2= scs ;
	public final prettyprinterParser.he_return he() throws RecognitionException {
		prettyprinterParser.he_return retval = new prettyprinterParser.he_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		Token t3=null;
		ParserRuleReturnScope sc1 =null;
		ParserRuleReturnScope scs2 =null;

		Object t1_tree=null;
		Object t2_tree=null;
		Object t3_tree=null;

		try {
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:59:3: (sc1= scs t1= TK_TITLE t2= TK_TEXTO t3= TK_C_TITLE scs2= scs )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:59:5: sc1= scs t1= TK_TITLE t2= TK_TEXTO t3= TK_C_TITLE scs2= scs
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_scs_in_he182);
			sc1=scs();
			state._fsp--;

			adaptor.addChild(root_0, sc1.getTree());

			t1=(Token)match(input,TK_TITLE,FOLLOW_TK_TITLE_in_he186); 
			t1_tree = (Object)adaptor.create(t1);
			adaptor.addChild(root_0, t1_tree);

			t2=(Token)match(input,TK_TEXTO,FOLLOW_TK_TEXTO_in_he190); 
			t2_tree = (Object)adaptor.create(t2);
			adaptor.addChild(root_0, t2_tree);

			t3=(Token)match(input,TK_C_TITLE,FOLLOW_TK_C_TITLE_in_he194); 
			t3_tree = (Object)adaptor.create(t3);
			adaptor.addChild(root_0, t3_tree);

			pushFollow(FOLLOW_scs_in_he198);
			scs2=scs();
			state._fsp--;

			adaptor.addChild(root_0, scs2.getTree());


			      retval.texto = (sc1!=null?((prettyprinterParser.scs_return)sc1).texto:null) + t1.getText() + t2.getText() + t3.getText() + (scs2!=null?((prettyprinterParser.scs_return)scs2).texto:null);
			  
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "he"


	public static class scs_return extends ParserRuleReturnScope {
		public String texto;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "scs"
	// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:63:1: scs returns [String texto] : (sc1= sc scs1= scs |);
	public final prettyprinterParser.scs_return scs() throws RecognitionException {
		prettyprinterParser.scs_return retval = new prettyprinterParser.scs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sc1 =null;
		ParserRuleReturnScope scs1 =null;


		try {
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:64:3: (sc1= sc scs1= scs |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==TK_SCRIPT) ) {
				alt3=1;
			}
			else if ( (LA3_0==TK_C_HEAD||LA3_0==TK_TITLE) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:64:5: sc1= sc scs1= scs
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sc_in_scs216);
					sc1=sc();
					state._fsp--;

					adaptor.addChild(root_0, sc1.getTree());

					pushFollow(FOLLOW_scs_in_scs220);
					scs1=scs();
					state._fsp--;

					adaptor.addChild(root_0, scs1.getTree());

					retval.texto = (sc1!=null?((prettyprinterParser.sc_return)sc1).texto:null) + (scs1!=null?((prettyprinterParser.scs_return)scs1).texto:null);
					}
					break;
				case 2 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:65:5: 
					{
					root_0 = (Object)adaptor.nil();


					retval.texto = "";
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scs"


	public static class sc_return extends ParserRuleReturnScope {
		public String texto;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sc"
	// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:68:1: sc returns [String texto] : t1= TK_SCRIPT ts= tsc t2= TK_C_SCRIPT ;
	public final prettyprinterParser.sc_return sc() throws RecognitionException {
		prettyprinterParser.sc_return retval = new prettyprinterParser.sc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope ts =null;

		Object t1_tree=null;
		Object t2_tree=null;

		try {
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:69:3: (t1= TK_SCRIPT ts= tsc t2= TK_C_SCRIPT )
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:69:5: t1= TK_SCRIPT ts= tsc t2= TK_C_SCRIPT
			{
			root_0 = (Object)adaptor.nil();


			t1=(Token)match(input,TK_SCRIPT,FOLLOW_TK_SCRIPT_in_sc250); 
			t1_tree = (Object)adaptor.create(t1);
			adaptor.addChild(root_0, t1_tree);

			pushFollow(FOLLOW_tsc_in_sc254);
			ts=tsc();
			state._fsp--;

			adaptor.addChild(root_0, ts.getTree());

			t2=(Token)match(input,TK_C_SCRIPT,FOLLOW_TK_C_SCRIPT_in_sc258); 
			t2_tree = (Object)adaptor.create(t2);
			adaptor.addChild(root_0, t2_tree);


			      retval.texto = "<br>" + t1.getText() + "<div class=\"bloque\">" 
			      + "<span class=\"script\">" + (ts!=null?((prettyprinterParser.tsc_return)ts).texto:null) + "</span>" + "</div>" + t2.getText();
			  
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sc"


	public static class tsc_return extends ParserRuleReturnScope {
		public String texto;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tsc"
	// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:74:1: tsc returns [String texto] : ( (tk= TK_HTML ts= tsc |tk= TK_C_HTML ts= tsc |tk= TK_HEAD ts= tsc |tk= TK_C_HEAD ts= tsc |tk= TK_BODY ts= tsc |tk= TK_C_BODY ts= tsc |tk= TK_TITLE ts= tsc |tk= TK_C_TITLE ts= tsc |tk= TK_DIV ts= tsc |tk= TK_C_DIV ts= tsc |tk= TK_H1 ts= tsc |tk= TK_C_H1 ts= tsc |tk= TK_P ts= tsc |tk= TK_C_P ts= tsc |tk= TK_SCRIPT ts= tsc |tk= TK_BR ts= tsc |tk= TK_TEXTO ts= tsc ) |);
	public final prettyprinterParser.tsc_return tsc() throws RecognitionException {
		prettyprinterParser.tsc_return retval = new prettyprinterParser.tsc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token tk=null;
		ParserRuleReturnScope ts =null;

		Object tk_tree=null;

		try {
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:75:3: ( (tk= TK_HTML ts= tsc |tk= TK_C_HTML ts= tsc |tk= TK_HEAD ts= tsc |tk= TK_C_HEAD ts= tsc |tk= TK_BODY ts= tsc |tk= TK_C_BODY ts= tsc |tk= TK_TITLE ts= tsc |tk= TK_C_TITLE ts= tsc |tk= TK_DIV ts= tsc |tk= TK_C_DIV ts= tsc |tk= TK_H1 ts= tsc |tk= TK_C_H1 ts= tsc |tk= TK_P ts= tsc |tk= TK_C_P ts= tsc |tk= TK_SCRIPT ts= tsc |tk= TK_BR ts= tsc |tk= TK_TEXTO ts= tsc ) |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= TK_BODY && LA5_0 <= TK_C_P)||(LA5_0 >= TK_C_TITLE && LA5_0 <= TK_TITLE)) ) {
				alt5=1;
			}
			else if ( (LA5_0==TK_C_SCRIPT) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:75:5: (tk= TK_HTML ts= tsc |tk= TK_C_HTML ts= tsc |tk= TK_HEAD ts= tsc |tk= TK_C_HEAD ts= tsc |tk= TK_BODY ts= tsc |tk= TK_C_BODY ts= tsc |tk= TK_TITLE ts= tsc |tk= TK_C_TITLE ts= tsc |tk= TK_DIV ts= tsc |tk= TK_C_DIV ts= tsc |tk= TK_H1 ts= tsc |tk= TK_C_H1 ts= tsc |tk= TK_P ts= tsc |tk= TK_C_P ts= tsc |tk= TK_SCRIPT ts= tsc |tk= TK_BR ts= tsc |tk= TK_TEXTO ts= tsc )
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:75:5: (tk= TK_HTML ts= tsc |tk= TK_C_HTML ts= tsc |tk= TK_HEAD ts= tsc |tk= TK_C_HEAD ts= tsc |tk= TK_BODY ts= tsc |tk= TK_C_BODY ts= tsc |tk= TK_TITLE ts= tsc |tk= TK_C_TITLE ts= tsc |tk= TK_DIV ts= tsc |tk= TK_C_DIV ts= tsc |tk= TK_H1 ts= tsc |tk= TK_C_H1 ts= tsc |tk= TK_P ts= tsc |tk= TK_C_P ts= tsc |tk= TK_SCRIPT ts= tsc |tk= TK_BR ts= tsc |tk= TK_TEXTO ts= tsc )
					int alt4=17;
					switch ( input.LA(1) ) {
					case TK_HTML:
						{
						alt4=1;
						}
						break;
					case TK_C_HTML:
						{
						alt4=2;
						}
						break;
					case TK_HEAD:
						{
						alt4=3;
						}
						break;
					case TK_C_HEAD:
						{
						alt4=4;
						}
						break;
					case TK_BODY:
						{
						alt4=5;
						}
						break;
					case TK_C_BODY:
						{
						alt4=6;
						}
						break;
					case TK_TITLE:
						{
						alt4=7;
						}
						break;
					case TK_C_TITLE:
						{
						alt4=8;
						}
						break;
					case TK_DIV:
						{
						alt4=9;
						}
						break;
					case TK_C_DIV:
						{
						alt4=10;
						}
						break;
					case TK_H1:
						{
						alt4=11;
						}
						break;
					case TK_C_H1:
						{
						alt4=12;
						}
						break;
					case TK_P:
						{
						alt4=13;
						}
						break;
					case TK_C_P:
						{
						alt4=14;
						}
						break;
					case TK_SCRIPT:
						{
						alt4=15;
						}
						break;
					case TK_BR:
						{
						alt4=16;
						}
						break;
					case TK_TEXTO:
						{
						alt4=17;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:76:7: tk= TK_HTML ts= tsc
							{
							tk=(Token)match(input,TK_HTML,FOLLOW_TK_HTML_in_tsc286); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc290);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:76:27: tk= TK_C_HTML ts= tsc
							{
							tk=(Token)match(input,TK_C_HTML,FOLLOW_TK_C_HTML_in_tsc296); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc300);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 3 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:77:7: tk= TK_HEAD ts= tsc
							{
							tk=(Token)match(input,TK_HEAD,FOLLOW_TK_HEAD_in_tsc312); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc316);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 4 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:77:27: tk= TK_C_HEAD ts= tsc
							{
							tk=(Token)match(input,TK_C_HEAD,FOLLOW_TK_C_HEAD_in_tsc322); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc326);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 5 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:78:7: tk= TK_BODY ts= tsc
							{
							tk=(Token)match(input,TK_BODY,FOLLOW_TK_BODY_in_tsc338); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc342);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 6 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:78:27: tk= TK_C_BODY ts= tsc
							{
							tk=(Token)match(input,TK_C_BODY,FOLLOW_TK_C_BODY_in_tsc348); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc352);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 7 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:79:7: tk= TK_TITLE ts= tsc
							{
							tk=(Token)match(input,TK_TITLE,FOLLOW_TK_TITLE_in_tsc364); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc368);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 8 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:79:28: tk= TK_C_TITLE ts= tsc
							{
							tk=(Token)match(input,TK_C_TITLE,FOLLOW_TK_C_TITLE_in_tsc374); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc378);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 9 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:80:7: tk= TK_DIV ts= tsc
							{
							tk=(Token)match(input,TK_DIV,FOLLOW_TK_DIV_in_tsc392); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc396);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 10 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:80:26: tk= TK_C_DIV ts= tsc
							{
							tk=(Token)match(input,TK_C_DIV,FOLLOW_TK_C_DIV_in_tsc402); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc406);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 11 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:81:7: tk= TK_H1 ts= tsc
							{
							tk=(Token)match(input,TK_H1,FOLLOW_TK_H1_in_tsc419); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc423);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 12 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:81:25: tk= TK_C_H1 ts= tsc
							{
							tk=(Token)match(input,TK_C_H1,FOLLOW_TK_C_H1_in_tsc429); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc433);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 13 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:82:7: tk= TK_P ts= tsc
							{
							tk=(Token)match(input,TK_P,FOLLOW_TK_P_in_tsc447); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc451);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 14 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:82:24: tk= TK_C_P ts= tsc
							{
							tk=(Token)match(input,TK_C_P,FOLLOW_TK_C_P_in_tsc457); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc461);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 15 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:83:7: tk= TK_SCRIPT ts= tsc
							{
							tk=(Token)match(input,TK_SCRIPT,FOLLOW_TK_SCRIPT_in_tsc476); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc480);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 16 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:84:7: tk= TK_BR ts= tsc
							{
							tk=(Token)match(input,TK_BR,FOLLOW_TK_BR_in_tsc492); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc496);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;
						case 17 :
							// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:85:7: tk= TK_TEXTO ts= tsc
							{
							tk=(Token)match(input,TK_TEXTO,FOLLOW_TK_TEXTO_in_tsc508); 
							tk_tree = (Object)adaptor.create(tk);
							adaptor.addChild(root_0, tk_tree);

							pushFollow(FOLLOW_tsc_in_tsc512);
							ts=tsc();
							state._fsp--;

							adaptor.addChild(root_0, ts.getTree());

							}
							break;

					}

					retval.texto = tk.getText() + (ts!=null?((prettyprinterParser.tsc_return)ts).texto:null);
					}
					break;
				case 2 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:87:5: 
					{
					root_0 = (Object)adaptor.nil();


					retval.texto = "";
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tsc"


	public static class b_return extends ParserRuleReturnScope {
		public String texto;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "b"
	// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:90:1: b returns [String texto] : (t1= TK_TEXTO b1= b |t1= TK_DIV b1= b t2= TK_C_DIV b2= b |t1= TK_H1 b1= b t2= TK_C_H1 b2= b |t1= TK_P b1= b t2= TK_C_P b2= b |t1= TK_BR b1= b |);
	public final prettyprinterParser.b_return b() throws RecognitionException {
		prettyprinterParser.b_return retval = new prettyprinterParser.b_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope b1 =null;
		ParserRuleReturnScope b2 =null;

		Object t1_tree=null;
		Object t2_tree=null;

		try {
			// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:91:3: (t1= TK_TEXTO b1= b |t1= TK_DIV b1= b t2= TK_C_DIV b2= b |t1= TK_H1 b1= b t2= TK_C_H1 b2= b |t1= TK_P b1= b t2= TK_C_P b2= b |t1= TK_BR b1= b |)
			int alt6=6;
			switch ( input.LA(1) ) {
			case TK_TEXTO:
				{
				alt6=1;
				}
				break;
			case TK_DIV:
				{
				alt6=2;
				}
				break;
			case TK_H1:
				{
				alt6=3;
				}
				break;
			case TK_P:
				{
				alt6=4;
				}
				break;
			case TK_BR:
				{
				alt6=5;
				}
				break;
			case TK_C_BODY:
			case TK_C_DIV:
			case TK_C_H1:
			case TK_C_P:
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:91:5: t1= TK_TEXTO b1= b
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,TK_TEXTO,FOLLOW_TK_TEXTO_in_b546); 
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);

					pushFollow(FOLLOW_b_in_b550);
					b1=b();
					state._fsp--;

					adaptor.addChild(root_0, b1.getTree());


					        retval.texto = t1.getText() + (b1!=null?((prettyprinterParser.b_return)b1).texto:null);
					    
					}
					break;
				case 2 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:94:5: t1= TK_DIV b1= b t2= TK_C_DIV b2= b
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,TK_DIV,FOLLOW_TK_DIV_in_b575); 
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);

					pushFollow(FOLLOW_b_in_b579);
					b1=b();
					state._fsp--;

					adaptor.addChild(root_0, b1.getTree());

					t2=(Token)match(input,TK_C_DIV,FOLLOW_TK_C_DIV_in_b583); 
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);

					pushFollow(FOLLOW_b_in_b587);
					b2=b();
					state._fsp--;

					adaptor.addChild(root_0, b2.getTree());


					        retval.texto = "<br>" + t1.getText() + "<div class=\"bloque\">" 
					        + (b1!=null?((prettyprinterParser.b_return)b1).texto:null) + "</div>" + t2.getText() + (b2!=null?((prettyprinterParser.b_return)b2).texto:null);
					    
					}
					break;
				case 3 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:98:5: t1= TK_H1 b1= b t2= TK_C_H1 b2= b
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,TK_H1,FOLLOW_TK_H1_in_b597); 
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);

					pushFollow(FOLLOW_b_in_b601);
					b1=b();
					state._fsp--;

					adaptor.addChild(root_0, b1.getTree());

					t2=(Token)match(input,TK_C_H1,FOLLOW_TK_C_H1_in_b605); 
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);

					pushFollow(FOLLOW_b_in_b609);
					b2=b();
					state._fsp--;

					adaptor.addChild(root_0, b2.getTree());


					        retval.texto = "<br>" + t1.getText() + "<div class=\"bloque\">" 
					        + (b1!=null?((prettyprinterParser.b_return)b1).texto:null) + "</div>" + t2.getText() + (b2!=null?((prettyprinterParser.b_return)b2).texto:null);
					    
					}
					break;
				case 4 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:102:5: t1= TK_P b1= b t2= TK_C_P b2= b
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,TK_P,FOLLOW_TK_P_in_b619); 
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);

					pushFollow(FOLLOW_b_in_b623);
					b1=b();
					state._fsp--;

					adaptor.addChild(root_0, b1.getTree());

					t2=(Token)match(input,TK_C_P,FOLLOW_TK_C_P_in_b627); 
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);

					pushFollow(FOLLOW_b_in_b631);
					b2=b();
					state._fsp--;

					adaptor.addChild(root_0, b2.getTree());


					        retval.texto = "<br>" + t1.getText() + "<div class=\"bloque\">" 
					        + (b1!=null?((prettyprinterParser.b_return)b1).texto:null) + "</div>" + t2.getText() + (b2!=null?((prettyprinterParser.b_return)b2).texto:null);
					    
					}
					break;
				case 5 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:106:5: t1= TK_BR b1= b
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,TK_BR,FOLLOW_TK_BR_in_b641); 
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);

					pushFollow(FOLLOW_b_in_b645);
					b1=b();
					state._fsp--;

					adaptor.addChild(root_0, b1.getTree());


					        retval.texto = "<br>" + t1.getText() + (b1!=null?((prettyprinterParser.b_return)b1).texto:null);
					    
					}
					break;
				case 6 :
					// C:\\Users\\Mauricio\\Documents\\GitHub\\prettyprinter\\src\\prettyprinter.g:109:5: 
					{
					root_0 = (Object)adaptor.nil();



					        retval.texto = "";  //lambda
					  
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "b"

	// Delegated rules



	public static final BitSet FOLLOW_TK_HTML_in_s55 = new BitSet(new long[]{0x0000000000020820L});
	public static final BitSet FOLLOW_h_in_s59 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TK_C_HTML_in_s63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_head_in_h91 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_body_in_h105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_HEAD_in_head128 = new BitSet(new long[]{0x0000000000500000L});
	public static final BitSet FOLLOW_he_in_head132 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_TK_C_HEAD_in_head136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_BODY_in_body154 = new BitSet(new long[]{0x00000000002980C0L});
	public static final BitSet FOLLOW_b_in_body158 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_TK_C_BODY_in_body162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scs_in_he182 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TK_TITLE_in_he186 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_TK_TEXTO_in_he190 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_TK_C_TITLE_in_he194 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_scs_in_he198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sc_in_scs216 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_scs_in_scs220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_SCRIPT_in_sc250 = new BitSet(new long[]{0x00000000007FFFE0L});
	public static final BitSet FOLLOW_tsc_in_sc254 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_TK_C_SCRIPT_in_sc258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_HTML_in_tsc286 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_C_HTML_in_tsc296 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_HEAD_in_tsc312 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_C_HEAD_in_tsc322 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_BODY_in_tsc338 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_C_BODY_in_tsc348 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_TITLE_in_tsc364 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_C_TITLE_in_tsc374 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_DIV_in_tsc392 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_C_DIV_in_tsc402 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_H1_in_tsc419 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_C_H1_in_tsc429 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_P_in_tsc447 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_C_P_in_tsc457 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_SCRIPT_in_tsc476 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_BR_in_tsc492 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_TEXTO_in_tsc508 = new BitSet(new long[]{0x00000000007FDFE0L});
	public static final BitSet FOLLOW_tsc_in_tsc512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_TEXTO_in_b546 = new BitSet(new long[]{0x0000000000298040L});
	public static final BitSet FOLLOW_b_in_b550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_DIV_in_b575 = new BitSet(new long[]{0x0000000000298140L});
	public static final BitSet FOLLOW_b_in_b579 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TK_C_DIV_in_b583 = new BitSet(new long[]{0x0000000000298040L});
	public static final BitSet FOLLOW_b_in_b587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_H1_in_b597 = new BitSet(new long[]{0x0000000000298240L});
	public static final BitSet FOLLOW_b_in_b601 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_TK_C_H1_in_b605 = new BitSet(new long[]{0x0000000000298040L});
	public static final BitSet FOLLOW_b_in_b609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_P_in_b619 = new BitSet(new long[]{0x0000000000299040L});
	public static final BitSet FOLLOW_b_in_b623 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_TK_C_P_in_b627 = new BitSet(new long[]{0x0000000000298040L});
	public static final BitSet FOLLOW_b_in_b631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_BR_in_b641 = new BitSet(new long[]{0x0000000000298040L});
	public static final BitSet FOLLOW_b_in_b645 = new BitSet(new long[]{0x0000000000000002L});
}
