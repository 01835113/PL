/* The following code was generated by JFlex 1.3.5 on 19/05/17 18:46 */



//* --------------------------Seccion codigo-usuario ------------------------*/ 


import java.io.*;
import java_cup.runtime.Symbol;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 19/05/17 18:46 from the specification file
 * <tt>file:/C:/Users/Eimard/workspace/PDL/lexer.jflex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  4,  2,  0,  0,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 42,  0,  5, 48, 41, 29, 47, 43, 44, 40, 37, 27, 38, 51, 39, 
    32, 32, 32, 32, 32, 32, 32, 32, 32, 32,  0, 28, 35,  6, 36, 49, 
    50, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 
    31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 45,  0, 46, 33, 31, 
     0, 20,  7, 26, 12,  8, 19,  9, 18, 10, 31, 24, 16, 31, 11, 22, 
    31, 14, 13, 21, 23, 15, 31, 17, 31, 25, 31,  0, 30,  0, 34,  0
  };

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    52,   104,    52,    52,   156,   208,   260,   312,   364, 
      416,   468,   520,   572,   624,   676,   728,   780,   832,   884, 
      936,    52,    52,   988,  1040,  1092,    52,    52,  1144,  1196, 
     1248,  1300,  1352,  1404,  1456,  1508,    52,    52,    52,    52, 
     1560,  1612,  1664,    52,    52,  1716,  1768,    52,  1820,  1872, 
      364,  1924,  1976,  2028,   364,  2080,  2132,  2184,  2236,  2288, 
     2340,   364,  2392,  2444,  2496,    52,  2548,    52,  1560,    52, 
       52,    52,    52,    52,    52,    52,    52,  2600,    52,    52, 
     2652,  2704,  2756,  2808,  2860,  2912,   364,  2964,   364,   364, 
      364,  3016,  3068,  3120,  3172,  3224,  3276,   364,   364,  3328, 
     3380,  3432,    52,    52,  3484,  3536,  3588,   364,  3640,  3692, 
     3744,  3796,  3848,   364,  3900,  3952,   364,   364,   364,  3484, 
     4004,   364,   364,  4056,   364,  4108,  4160,   364,   364,  4212, 
     4264,   364,   364,  4212,  4316,   364,  4368,  4420,    52
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\12\1\17"+
    "\1\12\1\20\1\12\1\21\1\22\1\12\1\23\1\24"+
    "\2\12\1\25\1\26\1\27\1\30\1\31\1\12\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\2\1\53\1\54\66\0\1\2\61\0\2\6\1\0"+
    "\61\6\6\0\1\55\1\56\63\0\6\12\1\57\15\12"+
    "\3\0\1\60\2\12\11\0\1\60\6\0\1\60\11\0"+
    "\4\12\1\61\4\12\1\62\12\12\3\0\1\60\2\12"+
    "\11\0\1\60\6\0\1\60\11\0\24\12\3\0\1\60"+
    "\2\12\11\0\1\60\6\0\1\60\11\0\14\12\1\63"+
    "\7\12\3\0\1\60\2\12\11\0\1\60\6\0\1\60"+
    "\11\0\3\12\1\64\13\12\1\65\4\12\3\0\1\60"+
    "\2\12\11\0\1\60\6\0\1\60\11\0\1\12\1\66"+
    "\15\12\1\67\4\12\3\0\1\60\2\12\11\0\1\60"+
    "\6\0\1\60\11\0\1\12\1\70\22\12\3\0\1\60"+
    "\2\12\11\0\1\60\6\0\1\60\11\0\4\12\1\71"+
    "\17\12\3\0\1\60\2\12\11\0\1\60\6\0\1\60"+
    "\11\0\13\12\1\72\10\12\3\0\1\60\2\12\11\0"+
    "\1\60\6\0\1\60\11\0\15\12\1\73\1\12\1\74"+
    "\4\12\3\0\1\60\2\12\11\0\1\60\6\0\1\60"+
    "\11\0\4\12\1\75\17\12\3\0\1\60\2\12\11\0"+
    "\1\60\6\0\1\60\11\0\6\12\1\76\15\12\3\0"+
    "\1\60\2\12\11\0\1\60\6\0\1\60\11\0\6\12"+
    "\1\77\4\12\1\100\10\12\3\0\1\60\2\12\11\0"+
    "\1\60\6\0\1\60\11\0\15\12\1\101\6\12\3\0"+
    "\1\60\2\12\11\0\1\60\6\0\1\60\37\0\1\102"+
    "\35\0\24\103\3\0\1\104\1\103\64\0\1\32\16\0"+
    "\1\105\12\0\1\106\34\0\1\107\26\0\1\110\35\0"+
    "\1\111\25\0\1\112\63\0\1\113\63\0\1\114\63\0"+
    "\1\115\41\0\1\116\21\0\1\117\63\0\1\120\55\0"+
    "\2\121\1\0\61\121\7\0\24\122\4\0\1\122\33\0"+
    "\24\123\4\0\1\123\22\0\1\124\11\0\1\125\62\0"+
    "\1\12\1\126\22\12\3\0\1\60\2\12\11\0\1\60"+
    "\6\0\1\60\11\0\5\12\1\127\16\12\3\0\1\60"+
    "\2\12\11\0\1\60\6\0\1\60\11\0\16\12\1\130"+
    "\5\12\3\0\1\60\2\12\11\0\1\60\6\0\1\60"+
    "\11\0\11\12\1\131\12\12\3\0\1\60\2\12\11\0"+
    "\1\60\6\0\1\60\11\0\20\12\1\132\3\12\3\0"+
    "\1\60\2\12\11\0\1\60\6\0\1\60\11\0\14\12"+
    "\1\133\7\12\3\0\1\60\2\12\11\0\1\60\6\0"+
    "\1\60\11\0\7\12\1\134\10\12\1\135\3\12\3\0"+
    "\1\60\2\12\11\0\1\60\6\0\1\60\11\0\11\12"+
    "\1\136\12\12\3\0\1\60\2\12\11\0\1\60\6\0"+
    "\1\60\11\0\1\12\1\137\1\12\1\140\20\12\3\0"+
    "\1\60\2\12\11\0\1\60\6\0\1\60\11\0\11\12"+
    "\1\141\12\12\3\0\1\60\2\12\11\0\1\60\6\0"+
    "\1\60\11\0\6\12\1\142\15\12\3\0\1\60\2\12"+
    "\11\0\1\60\6\0\1\60\11\0\5\12\1\143\16\12"+
    "\3\0\1\60\2\12\11\0\1\60\6\0\1\60\11\0"+
    "\10\12\1\144\13\12\3\0\1\60\2\12\11\0\1\60"+
    "\6\0\1\60\11\0\1\12\1\145\22\12\3\0\1\60"+
    "\2\12\11\0\1\60\6\0\1\60\11\0\16\12\1\146"+
    "\5\12\3\0\1\60\2\12\11\0\1\60\6\0\1\60"+
    "\11\0\24\103\3\0\1\147\2\103\31\0\1\150\134\0"+
    "\1\151\13\0\24\122\4\0\2\122\32\0\24\123\4\0"+
    "\2\123\32\0\24\123\4\0\1\123\35\0\1\152\61\0"+
    "\15\12\1\153\6\12\3\0\1\60\2\12\11\0\1\60"+
    "\6\0\1\60\11\0\1\12\1\154\1\12\1\155\20\12"+
    "\3\0\1\60\2\12\11\0\1\60\6\0\1\60\11\0"+
    "\10\12\1\156\13\12\3\0\1\60\2\12\11\0\1\60"+
    "\6\0\1\60\11\0\6\12\1\157\1\12\1\160\13\12"+
    "\3\0\1\60\2\12\11\0\1\60\6\0\1\60\11\0"+
    "\1\12\1\161\22\12\3\0\1\60\2\12\11\0\1\60"+
    "\6\0\1\60\11\0\4\12\1\162\17\12\3\0\1\60"+
    "\2\12\11\0\1\60\6\0\1\60\11\0\11\12\1\163"+
    "\12\12\3\0\1\60\2\12\11\0\1\60\6\0\1\60"+
    "\11\0\16\12\1\164\5\12\3\0\1\60\2\12\11\0"+
    "\1\60\6\0\1\60\11\0\1\12\1\165\22\12\3\0"+
    "\1\60\2\12\11\0\1\60\6\0\1\60\11\0\4\12"+
    "\1\166\17\12\3\0\1\60\2\12\11\0\1\60\6\0"+
    "\1\60\11\0\1\12\1\167\22\12\3\0\1\60\2\12"+
    "\11\0\1\60\6\0\1\60\42\0\1\170\35\0\1\171"+
    "\60\0\21\12\1\172\2\12\3\0\1\60\2\12\11\0"+
    "\1\60\6\0\1\60\11\0\14\12\1\173\7\12\3\0"+
    "\1\60\2\12\11\0\1\60\6\0\1\60\11\0\3\12"+
    "\1\174\20\12\3\0\1\60\2\12\11\0\1\60\6\0"+
    "\1\60\11\0\22\12\1\175\1\12\3\0\1\60\2\12"+
    "\11\0\1\60\6\0\1\60\11\0\6\12\1\176\15\12"+
    "\3\0\1\60\2\12\11\0\1\60\6\0\1\60\11\0"+
    "\16\12\1\177\5\12\3\0\1\60\2\12\11\0\1\60"+
    "\6\0\1\60\11\0\1\12\1\200\22\12\3\0\1\60"+
    "\2\12\11\0\1\60\6\0\1\60\11\0\1\12\1\201"+
    "\22\12\3\0\1\60\2\12\11\0\1\60\6\0\1\60"+
    "\15\0\1\202\57\0\6\12\1\203\15\12\3\0\1\60"+
    "\2\12\11\0\1\60\6\0\1\60\11\0\4\12\1\204"+
    "\17\12\3\0\1\60\2\12\11\0\1\60\6\0\1\60"+
    "\11\0\16\12\1\205\5\12\3\0\1\60\2\12\11\0"+
    "\1\60\6\0\1\60\2\0\6\206\1\207\55\206\7\0"+
    "\1\12\1\210\22\12\3\0\1\60\2\12\11\0\1\60"+
    "\6\0\1\60\12\0\1\211\66\0\1\212\64\0\1\213"+
    "\47\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  9,  1,  9,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  9,  9,  1,  1,  1,  9,  9,  1,  1,  1,  1, 
     1,  1,  1,  1,  9,  9,  9,  9,  1,  1,  1,  9,  9,  0,  1,  9, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  9,  0,  9,  0,  9,  9,  9,  9,  9,  9,  9,  9,  1,  9,  9, 
     0,  1,  1,  0,  0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  9,  9,  0,  0,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  0,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  0,  0,  1,  0,  0,  9
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[4472];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
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
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
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
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
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
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 129: 
          { System.out.println("Error en =begin: comentario no terminado"); }
        case 140: break;
        case 138: 
          { /*ML_COMMENT - DO NOTHING*/System.out.println("Token COMENTARIO MULTILINEA <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); }
        case 141: break;
        case 103: 
          {  return new Symbol(sym.EXP_ASSIGN);   }
        case 142: break;
        case 79: 
          {  return new Symbol(sym.NOT_EQUAL);   }
        case 143: break;
        case 78: 
          {  return new Symbol(sym.MOD_ASSIGN);   }
        case 144: break;
        case 76: 
          {  return new Symbol(sym.MUL_ASSIGN);   }
        case 145: break;
        case 75: 
          {  return new Symbol(sym.DIV_ASSIGN);   }
        case 146: break;
        case 22: 
          {  return new Symbol(sym.SEMICOLON);   }
        case 147: break;
        case 7: 
        case 8: 
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 19: 
        case 20: 
        case 46: 
        case 47: 
        case 48: 
        case 49: 
        case 51: 
        case 52: 
        case 53: 
        case 55: 
        case 56: 
        case 57: 
        case 58: 
        case 59: 
        case 60: 
        case 62: 
        case 63: 
        case 64: 
        case 85: 
        case 87: 
        case 91: 
        case 92: 
        case 93: 
        case 94: 
        case 95: 
        case 96: 
        case 99: 
        case 100: 
        case 101: 
        case 106: 
        case 108: 
        case 109: 
        case 110: 
        case 111: 
        case 112: 
        case 114: 
        case 115: 
        case 123: 
        case 125: 
        case 126: 
        case 130: 
          {  return new Symbol(sym.ID_FUNCTION);  }
        case 148: break;
        case 69: 
          {  return new Symbol(sym.LESS_EQUAL);   }
        case 149: break;
        case 5: 
          { /*SL_COMMENT - DO NOTHING*/System.out.println("Token COMENTARIO SIMPLE <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); }
        case 150: break;
        case 1: 
        case 35: 
        case 40: 
        case 41: 
        case 42: 
          {    }
        case 151: break;
        case 2: 
          {   }
        case 152: break;
        case 37: 
          {  return new Symbol(sym.RIGHT_RBRACKET);  }
        case 153: break;
        case 39: 
          {  return new Symbol(sym.RIGHT_SBRACKET);  }
        case 154: break;
        case 71: 
          {  return new Symbol(sym.GREATER_EQUAL);   }
        case 155: break;
        case 4: 
          {  /* ignora los tabuladores */  }
        case 156: break;
        case 74: 
          {  return new Symbol(sym.MINUS_ASSIGN);   }
        case 157: break;
        case 73: 
          {  return new Symbol(sym.PLUS_ASSIGN);   }
        case 158: break;
        case 36: 
          {  return new Symbol(sym.LEFT_RBRACKET);  }
        case 159: break;
        case 38: 
          {  return new Symbol(sym.LEFT_SBRACKET);  }
        case 160: break;
        case 135: 
          {  return new Symbol(sym.REQUIRE);  }
        case 161: break;
        case 132: 
          {  return new Symbol(sym.UNLESS);   }
        case 162: break;
        case 131: 
          {  return new Symbol(sym.RETURN);   }
        case 163: break;
        case 128: 
          {  return new Symbol(sym.FALSE);   }
        case 164: break;
        case 127: 
          {  return new Symbol(sym.WHILE);   }
        case 165: break;
        case 124: 
          {  return new Symbol(sym.RETRY);   }
        case 166: break;
        case 122: 
          {  return new Symbol(sym.ELSIF);   }
        case 167: break;
        case 121: 
          {  return new Symbol(sym.BREAK);   }
        case 168: break;
        case 102: 
          {  return new Symbol(sym.ID_ITER);  }
        case 169: break;
        case 24: 
          {  return new Symbol(sym.BIT_OR);   }
        case 170: break;
        case 6: 
          {  return new Symbol(sym.ASSIGN);   }
        case 171: break;
        case 21: 
          {  return new Symbol(sym.COMMA);   }
        case 172: break;
        case 31: 
          {  return new Symbol(sym.MINUS);   }
        case 173: break;
        case 44: 
          {  return new Symbol(sym.EQUAL);   }
        case 174: break;
        case 82: 
          {  return new Symbol(sym.ID);  }
        case 175: break;
        case 25: 
          {  return new Symbol(sym.INT);  }
        case 176: break;
        case 43: 
          {  return new Symbol(sym.DOT);  }
        case 177: break;
        case 50: 
          {  return new Symbol(sym.IF);   }
        case 178: break;
        case 54: 
          {  return new Symbol(sym.DO);   }
        case 179: break;
        case 61: 
        case 67: 
          {  return new Symbol(sym.OR);  }
        case 180: break;
        case 65: 
        case 98: 
          {  return new Symbol(sym.AND);  }
        case 181: break;
        case 81: 
          {  return new Symbol(sym.ID_GLOBAL);  }
        case 182: break;
        case 29: 
          {  return new Symbol(sym.GREATER);   }
        case 183: break;
        case 27: 
          {  return new Symbol(sym.BIT_NOT);   }
        case 184: break;
        case 26: 
          {  return new Symbol(sym.BIT_XOR);   }
        case 185: break;
        case 23: 
          {  return new Symbol(sym.BIT_AND);   }
        case 186: break;
        case 70: 
          {  return new Symbol(sym.BIT_SHL);   }
        case 187: break;
        case 72: 
          {  return new Symbol(sym.BIT_SHR);   }
        case 188: break;
        case 119: 
          {  return new Symbol(sym.FLOAT);  }
        case 189: break;
        case 118: 
          {  return new Symbol(sym.CASE);   }
        case 190: break;
        case 117: 
          {  return new Symbol(sym.THEN);   }
        case 191: break;
        case 116: 
          {  return new Symbol(sym.TRUE);   }
        case 192: break;
        case 113: 
          {  return new Symbol(sym.WHEN);   }
        case 193: break;
        case 107: 
          {  return new Symbol(sym.ELSE);   }
        case 194: break;
        case 97: 
          {  return new Symbol(sym.FOR);   }
        case 195: break;
        case 90: 
          {  return new Symbol(sym.DEF);   }
        case 196: break;
        case 89: 
          {  return new Symbol(sym.NOT);   }
        case 197: break;
        case 88: 
          {  return new Symbol(sym.NIL);   }
        case 198: break;
        case 86: 
          {  return new Symbol(sym.END);   }
        case 199: break;
        case 77: 
          {  return new Symbol(sym.EXP);   }
        case 200: break;
        case 30: 
          {  return new Symbol(sym.PLUS);   }
        case 201: break;
        case 28: 
          {  return new Symbol(sym.LESS);   }
        case 202: break;
        case 32: 
          {  return new Symbol(sym.DIV);   }
        case 203: break;
        case 33: 
          {  return new Symbol(sym.MUL);   }
        case 204: break;
        case 34: 
          {  return new Symbol(sym.MOD);   }
        case 205: break;
        case 3: 
          {  /* ignora los espacios en blanco */  }
        case 206: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
