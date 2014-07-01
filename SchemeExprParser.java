// Generated from SchemeExpr.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeExprParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, DOUBLE=4, NEWLINE=5, WS=6, PLUS=7, MINUS=8, MUL=9, 
		DIV=10, ID=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'def'", "')'", "'('", "DOUBLE", "NEWLINE", "WS", "'+'", 
		"'-'", "'*'", "'/'", "ID"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"prog", "expr"
	};

	@Override
	public String getGrammarFileName() { return "SchemeExpr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SchemeExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProglContext extends ProgContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProglContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitProgl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProglContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4); expr();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << DOUBLE) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(SchemeExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SchemeExprParser.ID, 0); }
		public DefineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoublelContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(SchemeExprParser.DOUBLE, 0); }
		public DoublelContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitDoublel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DoublelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9); match(DOUBLE);
				}
				break;

			case 2:
				_localctx = new MulDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(10); match(3);
				setState(11);
				((MulDivContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
					((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << DOUBLE) | (1L << ID))) != 0)) {
					{
					{
					setState(12); expr();
					}
					}
					setState(17);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(18); match(2);
				}
				break;

			case 3:
				_localctx = new AddSubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19); match(3);
				setState(20);
				((AddSubContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << DOUBLE) | (1L << ID))) != 0)) {
					{
					{
					setState(21); expr();
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(27); match(2);
				}
				break;

			case 4:
				_localctx = new DefineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(28); match(3);
				setState(29); match(1);
				setState(30); match(ID);
				setState(31); expr();
				setState(32); match(2);
				}
				break;

			case 5:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(34); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r(\4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\7\3\20\n\3\f\3\16\3\23\13"+
		"\3\3\3\3\3\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3&\n\3\3\3\2\2\4\2\4\2\4\3\2\13\f\3\2\t\n,\2\7\3\2\2\2\4%\3"+
		"\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3"+
		"\3\2\2\2\13&\7\6\2\2\f\r\7\5\2\2\r\21\t\2\2\2\16\20\5\4\3\2\17\16\3\2"+
		"\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2"+
		"\2\2\24&\7\4\2\2\25\26\7\5\2\2\26\32\t\3\2\2\27\31\5\4\3\2\30\27\3\2\2"+
		"\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2"+
		"\2\35&\7\4\2\2\36\37\7\5\2\2\37 \7\3\2\2 !\7\r\2\2!\"\5\4\3\2\"#\7\4\2"+
		"\2#&\3\2\2\2$&\7\r\2\2%\13\3\2\2\2%\f\3\2\2\2%\25\3\2\2\2%\36\3\2\2\2"+
		"%$\3\2\2\2&\5\3\2\2\2\6\t\21\32%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}