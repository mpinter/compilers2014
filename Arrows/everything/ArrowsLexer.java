// Generated from ./Arrows.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArrowsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, DEF=2, INDENT=3, DEDENT=4, COLON=5, SEMICOLON=6, LA=7, RA=8, 
		LPA=9, LSA=10, LDA=11, LMA=12, RPA=13, RSA=14, RDA=15, RMA=16, IS=17, 
		OS=18, RET=19, INT=20, NEQ=21, GEQ=22, SEQ=23, MUL=24, DIV=25, ADD=26, 
		SUB=27, LR=28, RR=29, DOTS=30, WHITESPACE=31, EQ=32, GT=33, ST=34, IF=35, 
		ELSE=36, WHILE=37, FOR=38, AND=39, OR=40, NOT=41, PAREN_OPEN=42, PAREN_CLOSE=43, 
		COMMA=44, QUOT=45, STRING=46, NEWLINE=47, ANYSTRING=48, SPACES=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "'def'", "'{'", "'}'", "':'", "';'", "'>>'", "'<<'", "'+>'", 
		"'->'", "'/>'", "'*>'", "'<+'", "'<-'", "'</'", "'<*'", "'@>'", "'<@'", 
		"'ret'", "INT", "'!='", "'>='", "'<='", "'*'", "'/'", "'+'", "'-'", "'['", 
		"']'", "'..'", "WHITESPACE", "'='", "'>'", "'<'", "'if'", "'!^'", "'while'", 
		"'for'", "'&'", "'|'", "'!'", "'('", "')'", "','", "'\"'", "STRING", "'\n'", 
		"ANYSTRING", "SPACES"
	};
	public static final String[] ruleNames = {
		"COMMENT", "DEF", "INDENT", "DEDENT", "COLON", "SEMICOLON", "LA", "RA", 
		"LPA", "LSA", "LDA", "LMA", "RPA", "RSA", "RDA", "RMA", "IS", "OS", "RET", 
		"INT", "NEQ", "GEQ", "SEQ", "MUL", "DIV", "ADD", "SUB", "LR", "RR", "DOTS", 
		"WHITESPACE", "EQ", "GT", "ST", "IF", "ELSE", "WHILE", "FOR", "AND", "OR", 
		"NOT", "PAREN_OPEN", "PAREN_CLOSE", "COMMA", "QUOT", "STRING", "NEWLINE", 
		"ANYSTRING", "SPACES", "DIGIT"
	};


	public ArrowsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arrows.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 30: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 48: SPACES_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void SPACES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\63\u0109\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\7\2j\n\2\f\2\16\2m\13\2\3\2\6\2p\n\2\r\2\16\2q\6\2t\n\2\r\2\16\2"+
		"u\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\6\25\u00af\n\25\r\25\16\25\u00b0"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\7/\u00f5\n/\f/\16/\u00f8\13"+
		"/\3\60\3\60\3\61\6\61\u00fd\n\61\r\61\16\61\u00fe\3\62\6\62\u0102\n\62"+
		"\r\62\16\62\u0103\3\62\3\62\3\63\3\63\4q\u00fe\64\3\3\2\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32"+
		"\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\3A\"\1C#\1E$\1G%\1I&\1K\'"+
		"\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\4e\2\1\3\2\b"+
		"\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\5\2\62;C\\c|\5\2\f\f\17\17$$\3\2"+
		"\62;\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\3g\3\2\2\2\5y\3\2\2\2\7}\3\2\2\2\t\177\3\2"+
		"\2\2\13\u0081\3\2\2\2\r\u0083\3\2\2\2\17\u0085\3\2\2\2\21\u0088\3\2\2"+
		"\2\23\u008b\3\2\2\2\25\u008e\3\2\2\2\27\u0091\3\2\2\2\31\u0094\3\2\2\2"+
		"\33\u0097\3\2\2\2\35\u009a\3\2\2\2\37\u009d\3\2\2\2!\u00a0\3\2\2\2#\u00a3"+
		"\3\2\2\2%\u00a6\3\2\2\2\'\u00a9\3\2\2\2)\u00ae\3\2\2\2+\u00b2\3\2\2\2"+
		"-\u00b5\3\2\2\2/\u00b8\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf"+
		"\3\2\2\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c5\3\2\2\2=\u00c7\3\2\2\2"+
		"?\u00ca\3\2\2\2A\u00ce\3\2\2\2C\u00d0\3\2\2\2E\u00d2\3\2\2\2G\u00d4\3"+
		"\2\2\2I\u00d7\3\2\2\2K\u00da\3\2\2\2M\u00e0\3\2\2\2O\u00e4\3\2\2\2Q\u00e6"+
		"\3\2\2\2S\u00e8\3\2\2\2U\u00ea\3\2\2\2W\u00ec\3\2\2\2Y\u00ee\3\2\2\2["+
		"\u00f0\3\2\2\2]\u00f2\3\2\2\2_\u00f9\3\2\2\2a\u00fc\3\2\2\2c\u0101\3\2"+
		"\2\2e\u0107\3\2\2\2gs\7%\2\2hj\5? \2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2np\n\2\2\2on\3\2\2\2pq\3\2\2\2qr\3\2\2\2qo\3"+
		"\2\2\2rt\3\2\2\2sk\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b"+
		"\2\2\2x\4\3\2\2\2yz\7f\2\2z{\7g\2\2{|\7h\2\2|\6\3\2\2\2}~\7}\2\2~\b\3"+
		"\2\2\2\177\u0080\7\177\2\2\u0080\n\3\2\2\2\u0081\u0082\7<\2\2\u0082\f"+
		"\3\2\2\2\u0083\u0084\7=\2\2\u0084\16\3\2\2\2\u0085\u0086\7@\2\2\u0086"+
		"\u0087\7@\2\2\u0087\20\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a\7>\2\2\u008a"+
		"\22\3\2\2\2\u008b\u008c\7-\2\2\u008c\u008d\7@\2\2\u008d\24\3\2\2\2\u008e"+
		"\u008f\7/\2\2\u008f\u0090\7@\2\2\u0090\26\3\2\2\2\u0091\u0092\7\61\2\2"+
		"\u0092\u0093\7@\2\2\u0093\30\3\2\2\2\u0094\u0095\7,\2\2\u0095\u0096\7"+
		"@\2\2\u0096\32\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099\7-\2\2\u0099\34"+
		"\3\2\2\2\u009a\u009b\7>\2\2\u009b\u009c\7/\2\2\u009c\36\3\2\2\2\u009d"+
		"\u009e\7>\2\2\u009e\u009f\7\61\2\2\u009f \3\2\2\2\u00a0\u00a1\7>\2\2\u00a1"+
		"\u00a2\7,\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4\u00a5\7@\2\2\u00a5"+
		"$\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7B\2\2\u00a8&\3\2\2\2\u00a9\u00aa"+
		"\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac(\3\2\2\2\u00ad\u00af"+
		"\5e\63\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\7?\2\2\u00b4"+
		",\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b7.\3\2\2\2\u00b8\u00b9"+
		"\7>\2\2\u00b9\u00ba\7?\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7,\2\2\u00bc\62"+
		"\3\2\2\2\u00bd\u00be\7\61\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0"+
		"\66\3\2\2\2\u00c1\u00c2\7/\2\2\u00c28\3\2\2\2\u00c3\u00c4\7]\2\2\u00c4"+
		":\3\2\2\2\u00c5\u00c6\7_\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8"+
		"\u00c9\7\60\2\2\u00c9>\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00cd\b \3\2\u00cd@\3\2\2\2\u00ce\u00cf\7?\2\2\u00cfB\3\2\2\2\u00d0"+
		"\u00d1\7@\2\2\u00d1D\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3F\3\2\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7h\2\2\u00d6H\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9"+
		"\7`\2\2\u00d9J\3\2\2\2\u00da\u00db\7y\2\2\u00db\u00dc\7j\2\2\u00dc\u00dd"+
		"\7k\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00dfL\3\2\2\2\u00e0\u00e1"+
		"\7h\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7t\2\2\u00e3N\3\2\2\2\u00e4\u00e5"+
		"\7(\2\2\u00e5P\3\2\2\2\u00e6\u00e7\7~\2\2\u00e7R\3\2\2\2\u00e8\u00e9\7"+
		"#\2\2\u00e9T\3\2\2\2\u00ea\u00eb\7*\2\2\u00ebV\3\2\2\2\u00ec\u00ed\7+"+
		"\2\2\u00edX\3\2\2\2\u00ee\u00ef\7.\2\2\u00efZ\3\2\2\2\u00f0\u00f1\7$\2"+
		"\2\u00f1\\\3\2\2\2\u00f2\u00f6\t\4\2\2\u00f3\u00f5\t\5\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"^\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\f\2\2\u00fa`\3\2\2\2\u00fb"+
		"\u00fd\n\6\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00ffb\3\2\2\2\u0100\u0102\t\3\2\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\b\62\4\2\u0106d\3\2\2\2\u0107\u0108\t\7\2\2"+
		"\u0108f\3\2\2\2\n\2kqu\u00b0\u00f6\u00fe\u0103";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}