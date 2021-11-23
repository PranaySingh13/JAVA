
public class The_char_Primitive {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// A char can store a single 16-bit Unicode character. A character literal is
		// enclosed in single quotes.

		char myChar = 'u';
		char myChar2 = '5';
		char myChar3 = 65; // myChar3 == 'A'
		System.out.println(myChar + " " + myChar2 + " " + myChar3);// u 5 A

		// There are also other escape sequences:
		char tab = '\t';
		char backspace = '\b';
		char newline = '\n';
		char carriageReturn = '\r';
		char formfeed = '\f';
		char singleQuote = '\'';
		char doubleQuote = '\"'; // escaping redundant here; '"' would be the same; however still allowed
		char backslash = '\\';
		char unicodeChar = '\u0000'; // XXXX represents the Unicode-value of the character you want to display
		
		char heart = '\u2764';
		System.out.println(Character.toString(heart)); // Prints a line containing "❤".
	}

}
