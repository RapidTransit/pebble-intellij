/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.github.bjansen.intellij.pebble;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static com.github.bjansen.intellij.pebble.psi.PebbleTypes.*;
import com.intellij.util.containers.Stack;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>PebbleLexer.flex</tt>
 */
public class _PebbleLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int IN_TAG = 2;
  public static final int IN_EXPR = 4;
  public static final int IN_VERBATIM = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\2\1\1\37\2\1\22\0\1\1\1\45\1\4\1\10\1\0\1\36\1\0\1\5\1\52\1\53\1\51"+
    "\1\46\1\56\1\47\1\6\1\50\12\3\2\0\1\43\1\42\1\44\2\0\32\2\1\54\1\0\1\55\1"+
    "\0\1\2\1\0\1\12\1\24\1\20\1\23\1\16\1\31\1\2\1\27\1\32\1\2\1\26\1\25\1\34"+
    "\1\22\1\15\1\21\1\40\1\33\1\17\1\14\1\13\1\35\1\2\1\30\2\2\1\7\1\41\1\11\7"+
    "\0\1\37\32\0\1\37\337\0\1\37\177\0\13\37\35\0\2\37\5\0\1\37\57\0\1\37\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\2\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\15\4\1\12\1\13\1\14\1\15\1\16"+
    "\1\2\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\11\1\4\1\12\1\1\1\30\1\31"+
    "\1\32\1\0\1\6\1\7\3\4\1\33\17\4\1\34"+
    "\1\4\1\35\3\4\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\4\1\0\1\31\1\5\1\4\1\44\11\4"+
    "\1\45\11\4\1\0\1\31\1\4\1\46\4\4\1\35"+
    "\5\4\1\47\11\4\2\0\1\31\5\4\1\50\3\4"+
    "\1\0\2\4\1\51\4\4\1\0\5\4\1\0\1\4"+
    "\1\52\1\53\7\0\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u011a\0\u011a\0\u0234\0\u0263"+
    "\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db"+
    "\0\u040a\0\u0439\0\u0468\0\u0497\0\u011a\0\u04c6\0\u04f5\0\u0524"+
    "\0\u0553\0\u011a\0\u011a\0\u011a\0\u011a\0\u011a\0\u011a\0\u011a"+
    "\0\u011a\0\u011a\0\u0582\0\u05b1\0\u011a\0\u05e0\0\u011a\0\u060f"+
    "\0\u011a\0\u063e\0\u011a\0\u011a\0\u066d\0\u069c\0\u06cb\0\u0178"+
    "\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843"+
    "\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u098c\0\u0178"+
    "\0\u09bb\0\u0178\0\u09ea\0\u0a19\0\u0a48\0\u011a\0\u011a\0\u011a"+
    "\0\u011a\0\u011a\0\u011a\0\u0a77\0\u0aa6\0\u0ad5\0\u063e\0\u0b04"+
    "\0\u0178\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d"+
    "\0\u0c7c\0\u0cab\0\u0178\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96"+
    "\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0178"+
    "\0\u0f0e\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028\0\u1057"+
    "\0\u1086\0\u10b5\0\u0178\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0"+
    "\0\u11cf\0\u11fe\0\u122d\0\u125c\0\u128b\0\u0eb0\0\u011a\0\u12ba"+
    "\0\u12e9\0\u1318\0\u1347\0\u1376\0\u0178\0\u13a5\0\u13d4\0\u1403"+
    "\0\u1432\0\u1461\0\u1490\0\u0178\0\u14bf\0\u14ee\0\u151d\0\u154c"+
    "\0\u157b\0\u15aa\0\u15d9\0\u1608\0\u1637\0\u1666\0\u1695\0\u16c4"+
    "\0\u0178\0\u0178\0\u16f3\0\u1722\0\u1751\0\u1780\0\u17af\0\u17de"+
    "\0\u180d\0\u011a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\7\5\1\6\47\5\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\7\1\15\1\7\1\16\1\17\1\11\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\11\1\27"+
    "\4\11\1\30\1\31\1\11\1\32\1\33\1\34\1\7"+
    "\1\11\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\7\1\15\1\7"+
    "\1\53\1\17\1\11\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\11\1\27\4\11\1\30\1\31\1\11"+
    "\1\32\1\54\1\55\1\7\1\11\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\7\5\1\56\56\5\1\0\47\5"+
    "\7\0\1\57\1\60\25\0\1\61\100\0\1\10\57\0"+
    "\2\11\6\0\24\11\2\0\1\11\21\0\1\12\2\0"+
    "\1\62\50\0\4\13\1\63\52\13\5\14\1\64\51\14"+
    "\2\0\2\11\6\0\1\11\1\65\6\11\1\66\13\11"+
    "\2\0\1\11\20\0\2\11\6\0\21\11\1\67\2\11"+
    "\2\0\1\11\20\0\2\11\6\0\21\11\1\70\2\11"+
    "\2\0\1\11\20\0\2\11\6\0\10\11\1\71\2\11"+
    "\1\72\2\11\1\73\5\11\2\0\1\74\20\0\2\11"+
    "\6\0\4\11\1\75\17\11\2\0\1\11\20\0\2\11"+
    "\6\0\1\76\2\11\1\77\20\11\2\0\1\11\20\0"+
    "\2\11\6\0\1\100\23\11\2\0\1\11\20\0\2\11"+
    "\6\0\1\11\1\101\1\11\1\102\20\11\2\0\1\11"+
    "\20\0\2\11\6\0\13\11\1\103\10\11\2\0\1\11"+
    "\20\0\2\11\6\0\1\104\2\11\1\105\7\11\1\106"+
    "\4\11\1\107\3\11\2\0\1\11\20\0\2\11\6\0"+
    "\5\11\1\110\2\11\1\111\6\11\1\112\2\11\1\113"+
    "\1\11\2\0\1\11\20\0\2\11\6\0\1\114\23\11"+
    "\2\0\1\11\20\0\2\11\6\0\4\11\1\115\17\11"+
    "\2\0\1\11\27\0\1\116\107\0\1\117\56\0\1\120"+
    "\56\0\1\121\56\0\1\122\25\0\1\123\47\0\2\11"+
    "\6\0\4\11\1\124\17\11\2\0\1\11\54\0\1\125"+
    "\20\0\10\126\1\0\46\126\3\0\1\127\55\0\2\11"+
    "\6\0\2\11\1\130\21\11\2\0\1\11\20\0\2\11"+
    "\6\0\11\11\1\131\12\11\2\0\1\11\20\0\2\11"+
    "\6\0\1\11\1\132\22\11\2\0\1\11\20\0\2\11"+
    "\6\0\11\11\1\133\12\11\2\0\1\11\20\0\2\11"+
    "\6\0\5\11\1\134\16\11\2\0\1\11\20\0\2\11"+
    "\6\0\2\11\1\135\21\11\2\0\1\11\20\0\2\11"+
    "\6\0\1\11\1\136\22\11\2\0\1\11\20\0\2\11"+
    "\6\0\2\11\1\112\21\11\2\0\1\11\20\0\2\11"+
    "\6\0\6\11\1\137\15\11\2\0\1\11\20\0\2\11"+
    "\6\0\10\11\1\140\13\11\2\0\1\11\20\0\2\11"+
    "\6\0\21\11\1\141\2\11\2\0\1\11\20\0\2\11"+
    "\6\0\13\11\1\142\10\11\2\0\1\11\20\0\2\11"+
    "\6\0\2\11\1\143\21\11\2\0\1\11\20\0\2\11"+
    "\6\0\3\11\1\144\20\11\2\0\1\11\20\0\2\11"+
    "\6\0\13\11\1\145\10\11\2\0\1\11\20\0\2\11"+
    "\6\0\21\11\1\112\2\11\2\0\1\11\20\0\2\11"+
    "\6\0\1\11\1\146\22\11\2\0\1\11\20\0\2\11"+
    "\6\0\13\11\1\147\10\11\2\0\1\11\20\0\2\11"+
    "\6\0\6\11\1\150\15\11\2\0\1\11\20\0\2\11"+
    "\6\0\7\11\1\151\14\11\2\0\1\11\20\0\2\11"+
    "\6\0\6\11\1\152\15\11\2\0\1\11\20\0\2\11"+
    "\6\0\21\11\1\153\2\11\2\0\1\11\20\0\2\11"+
    "\6\0\21\11\1\154\2\11\2\0\1\11\17\0\1\125"+
    "\14\0\1\155\20\0\1\125\17\0\10\126\1\156\46\126"+
    "\2\0\2\11\6\0\3\11\1\157\20\11\2\0\1\11"+
    "\20\0\2\11\6\0\4\11\1\160\17\11\2\0\1\11"+
    "\20\0\2\11\6\0\1\161\5\11\1\162\1\25\2\11"+
    "\1\27\4\11\1\163\1\164\1\11\1\32\1\54\2\0"+
    "\1\11\20\0\2\11\6\0\4\11\1\165\17\11\2\0"+
    "\1\11\20\0\2\11\6\0\4\11\1\166\17\11\2\0"+
    "\1\11\20\0\2\11\6\0\1\167\23\11\2\0\1\11"+
    "\20\0\2\11\6\0\15\11\1\170\6\11\2\0\1\11"+
    "\20\0\2\11\6\0\2\11\1\171\21\11\2\0\1\11"+
    "\20\0\2\11\6\0\1\172\23\11\2\0\1\11\20\0"+
    "\2\11\6\0\13\11\1\173\10\11\2\0\1\11\20\0"+
    "\2\11\6\0\6\11\1\174\15\11\2\0\1\11\20\0"+
    "\2\11\6\0\5\11\1\175\16\11\2\0\1\11\20\0"+
    "\2\11\6\0\5\11\1\176\16\11\2\0\1\11\20\0"+
    "\2\11\6\0\2\11\1\177\21\11\2\0\1\11\20\0"+
    "\2\11\6\0\13\11\1\200\10\11\2\0\1\11\20\0"+
    "\2\11\6\0\3\11\1\201\20\11\2\0\1\11\20\0"+
    "\2\11\6\0\21\11\1\202\2\11\2\0\1\11\20\0"+
    "\2\11\6\0\12\11\1\203\11\11\2\0\1\11\20\0"+
    "\2\11\6\0\12\11\1\204\11\11\2\0\1\11\40\0"+
    "\1\205\34\0\10\126\1\206\1\207\45\126\2\0\2\11"+
    "\6\0\4\11\1\210\17\11\2\0\1\11\20\0\2\11"+
    "\6\0\1\11\1\65\22\11\2\0\1\11\20\0\2\11"+
    "\6\0\1\76\23\11\2\0\1\11\20\0\2\11\6\0"+
    "\3\11\1\105\14\11\1\107\3\11\2\0\1\11\20\0"+
    "\2\11\6\0\17\11\1\112\4\11\2\0\1\11\20\0"+
    "\2\11\6\0\20\11\1\164\3\11\2\0\1\11\20\0"+
    "\2\11\6\0\10\11\1\211\13\11\2\0\1\11\20\0"+
    "\2\11\6\0\13\11\1\212\10\11\2\0\1\11\20\0"+
    "\2\11\6\0\4\11\1\112\17\11\2\0\1\11\20\0"+
    "\2\11\6\0\1\213\23\11\2\0\1\11\20\0\2\11"+
    "\6\0\13\11\1\214\10\11\2\0\1\11\20\0\2\11"+
    "\6\0\14\11\1\112\7\11\2\0\1\11\20\0\2\11"+
    "\6\0\4\11\1\215\17\11\2\0\1\11\20\0\2\11"+
    "\6\0\15\11\1\112\6\11\2\0\1\11\20\0\2\11"+
    "\6\0\4\11\1\105\17\11\2\0\1\11\20\0\2\11"+
    "\6\0\1\11\1\216\22\11\2\0\1\11\20\0\2\11"+
    "\6\0\21\11\1\75\2\11\2\0\1\11\20\0\2\11"+
    "\6\0\3\11\1\112\20\11\2\0\1\11\20\0\2\11"+
    "\6\0\1\217\23\11\2\0\1\11\20\0\2\11\6\0"+
    "\1\220\23\11\2\0\1\11\41\0\1\221\35\0\2\11"+
    "\6\0\5\11\1\222\16\11\2\0\1\11\20\0\2\11"+
    "\6\0\11\11\1\223\12\11\2\0\1\11\20\0\2\11"+
    "\6\0\5\11\1\224\16\11\2\0\1\11\20\0\2\11"+
    "\6\0\20\11\1\225\3\11\2\0\1\11\20\0\2\11"+
    "\6\0\13\11\1\226\10\11\2\0\1\11\20\0\2\11"+
    "\6\0\11\11\1\170\12\11\2\0\1\11\20\0\2\11"+
    "\6\0\2\11\1\227\21\11\2\0\1\11\20\0\2\11"+
    "\6\0\2\11\1\230\21\11\2\0\1\11\53\0\1\231"+
    "\23\0\2\11\6\0\6\11\1\232\15\11\2\0\1\11"+
    "\20\0\2\11\6\0\5\11\1\112\16\11\2\0\1\11"+
    "\20\0\2\11\6\0\10\11\1\233\13\11\2\0\1\11"+
    "\20\0\2\11\6\0\4\11\1\234\17\11\2\0\1\11"+
    "\20\0\2\11\6\0\20\11\1\235\3\11\2\0\1\11"+
    "\20\0\2\11\6\0\20\11\1\236\3\11\2\0\1\11"+
    "\34\0\1\237\42\0\2\11\6\0\1\240\23\11\2\0"+
    "\1\11\20\0\2\11\6\0\5\11\1\241\16\11\2\0"+
    "\1\11\20\0\2\11\6\0\13\11\1\112\10\11\2\0"+
    "\1\11\20\0\2\11\6\0\22\11\1\242\1\11\2\0"+
    "\1\11\20\0\2\11\6\0\22\11\1\112\1\11\2\0"+
    "\1\11\51\0\1\243\25\0\2\11\6\0\7\11\1\170"+
    "\14\11\2\0\1\11\42\0\1\244\44\0\1\245\60\0"+
    "\1\246\74\0\1\247\60\0\1\250\23\0\1\250\34\0"+
    "\1\251\1\250\30\0\1\252\45\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6204];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\2\1\1\11\5\1\2\11\16\1\1\11\4\1"+
    "\11\11\2\1\1\11\1\1\1\11\1\1\1\11\1\0"+
    "\2\11\31\1\6\11\1\1\1\0\27\1\1\0\27\1"+
    "\2\0\1\11\11\1\1\0\7\1\1\0\5\1\1\0"+
    "\3\1\7\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _PebbleLexer() {
    this((java.io.Reader)null);
  }

  public IElementType checkContent() {
      if (!yytext().toString().equals("")) {
          if (yytext().toString().trim().length() == 0) {
              return TokenType.WHITE_SPACE;
          } else {
              return CONTENT;
          }
      }
      return null;
  }


  private Stack<Integer> stack = new Stack<>();

  public void yypushstate(int newState) {
      stack.push(yystate());
      yybegin(newState);
  }

  public void yypopstate() {
      yybegin(stack.pop());
  }

  public void yycleanstates() {
      while(!stack.isEmpty()) {
          yybegin(stack.pop());
      }
  }

  private boolean isVerbatim = false;
  private boolean isFirstNameInTag = false;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _PebbleLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return CONTENT;
            }
          case 45: break;
          case 2: 
            { return TokenType.BAD_CHARACTER;
            }
          case 46: break;
          case 3: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 47: break;
          case 4: 
            { if (isFirstNameInTag) {
                               isFirstNameInTag = false;
                               return CUSTOM_TAG_NAME;
                           }
                           isFirstNameInTag = false;
                           return ID_NAME;
            }
          case 48: break;
          case 5: 
            { return NUMERIC;
            }
          case 49: break;
          case 6: 
            { return STRING;
            }
          case 50: break;
          case 7: 
            { return SINGLE_QUOTED_STRING;
            }
          case 51: break;
          case 8: 
            { return LBRACE;
            }
          case 52: break;
          case 9: 
            { return RBRACE;
            }
          case 53: break;
          case 10: 
            { return OP_MOD;
            }
          case 54: break;
          case 11: 
            { return OP_PIPE;
            }
          case 55: break;
          case 12: 
            { return OP_ASSIGN;
            }
          case 56: break;
          case 13: 
            { return OP_LT;
            }
          case 57: break;
          case 14: 
            { return OP_GT;
            }
          case 58: break;
          case 15: 
            { return OP_PLUS;
            }
          case 59: break;
          case 16: 
            { return OP_MINUS;
            }
          case 60: break;
          case 17: 
            { return OP_DIV;
            }
          case 61: break;
          case 18: 
            { return OP_MULT;
            }
          case 62: break;
          case 19: 
            { return LPAREN;
            }
          case 63: break;
          case 20: 
            { return RPAREN;
            }
          case 64: break;
          case 21: 
            { return LBRACKET;
            }
          case 65: break;
          case 22: 
            { return RBRACKET;
            }
          case 66: break;
          case 23: 
            { return COMMA;
            }
          case 67: break;
          case 24: 
            { yypushstate(IN_EXPR); return VAR_OPEN;
            }
          case 68: break;
          case 25: 
            { return COMMENT;
            }
          case 69: break;
          case 26: 
            { yypushstate(IN_TAG); isFirstNameInTag = true; return TAG_OPEN;
            }
          case 70: break;
          case 27: 
            { return OR;
            }
          case 71: break;
          case 28: 
            { return IS;
            }
          case 72: break;
          case 29: 
            { isFirstNameInTag = false; return ID_NAME;
            }
          case 73: break;
          case 30: 
            { yypopstate();
                           if (isVerbatim) {
                              yypushstate(IN_VERBATIM);
                           }
                           return TAG_CLOSE;
            }
          case 74: break;
          case 31: 
            { return OP_EQ;
            }
          case 75: break;
          case 32: 
            { return OP_LE;
            }
          case 76: break;
          case 33: 
            { return OP_GE;
            }
          case 77: break;
          case 34: 
            { return OP_NEQ;
            }
          case 78: break;
          case 35: 
            { yypopstate(); return VAR_CLOSE;
            }
          case 79: break;
          case 36: 
            { return AND;
            }
          case 80: break;
          case 37: 
            { return NOT;
            }
          case 81: break;
          case 38: 
            { return TRUE;
            }
          case 82: break;
          case 39: 
            { return NULL;
            }
          case 83: break;
          case 40: 
            { return FALSE;
            }
          case 84: break;
          case 41: 
            { return EQUALS;
            }
          case 85: break;
          case 42: 
            { return CONTAINS;
            }
          case 86: break;
          case 43: 
            { if (isFirstNameInTag) {
                             isVerbatim = true;
                           }
                           isFirstNameInTag = false;
                           return ID_NAME;
            }
          case 87: break;
          case 44: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 2);
            { yypopstate();
                           yypushstate(IN_TAG);
                           isVerbatim = false;
                           return TAG_OPEN;
            }
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
