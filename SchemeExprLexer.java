// Generated from SchemeExpr.g4 by ANTLR 4.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeExprLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, DOUBLE=4, NEWLINE=5, WS=6, PLUS=7, MINUS=8, MUL=9, 
		DIV=10, ID=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'def'", "')'", "'('", "DOUBLE", "NEWLINE", "WS", "'+'", "'-'", "'*'", 
		"'/'", "ID"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "DOUBLE", "NEWLINE", "WS", "PLUS", "MINUS", "MUL", 
		"DIV", "ID"
	};


	public SchemeExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SchemeExpr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rM\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\5\5#\n\5\3\5\6\5&\n\5"+
		"\r\5\16\5\'\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\5\5\61\n\5\3\6\5\6\64\n\6"+
		"\3\6\3\6\3\6\3\6\3\7\6\7;\n\7\r\7\16\7<\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\6\fJ\n\f\r\f\16\fK\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\3\2\4\4\2\13\13\"\"\4\2C\\c|S\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\35"+
		"\3\2\2\2\7\37\3\2\2\2\t\"\3\2\2\2\13\63\3\2\2\2\r:\3\2\2\2\17@\3\2\2\2"+
		"\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27I\3\2\2\2\31\32\7f\2\2\32\33\7"+
		"g\2\2\33\34\7h\2\2\34\4\3\2\2\2\35\36\7+\2\2\36\6\3\2\2\2\37 \7*\2\2 "+
		"\b\3\2\2\2!#\7/\2\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$&\4\62;\2%$\3\2\2"+
		"\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\60\3\2\2\2)-\7\60\2\2*,\4\62;\2+"+
		"*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\61\3\2\2\2/-\3\2\2\2\60)\3\2"+
		"\2\2\60\61\3\2\2\2\61\n\3\2\2\2\62\64\7\17\2\2\63\62\3\2\2\2\63\64\3\2"+
		"\2\2\64\65\3\2\2\2\65\66\7\f\2\2\66\67\3\2\2\2\678\b\6\2\28\f\3\2\2\2"+
		"9;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\b\7\2\2"+
		"?\16\3\2\2\2@A\7-\2\2A\20\3\2\2\2BC\7/\2\2C\22\3\2\2\2DE\7,\2\2E\24\3"+
		"\2\2\2FG\7\61\2\2G\26\3\2\2\2HJ\t\3\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2L\30\3\2\2\2\n\2\"\'-\60\63<K\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}