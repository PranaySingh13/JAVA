
public class Literals {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Decimal, Hexadecimal, Octal and Binary literals

		/*
		 * A hexadecimal number is a value in base-16. There are 16 digits, 0-9 and the
		 * letters A-F (case does not matter). A-F represent 10-15.
		 * 
		 * An octal number is a value in base-8, and uses the digits 0-7.
		 * 
		 * A binary number is a value in base-2, and uses the digits 0 and 1.
		 */

		// For 110 representation
		int dec = 110; // no prefix --> decimal literal
		int bin = 0b1101110; // '0b' prefix --> binary literal
		int oct = 0156; // '0' prefix --> octal literal
		int hex = 0x6E; // '0x' prefix --> hexadecimal literal

		// Boolean literals

		boolean flag = true; // using the 'true' literal
		flag = false; // using the 'false' literal

		// String literals

		String s1 = "Hello world"; // A literal denoting an 11 character String
		String s2 = ""; // A literal denoting an empty (zero length) String
		String s3 = "\""; // A literal denoting a String consisting of one
		// double quote character
		String s4 = "1\t2\t3\n"; // Another literal with escape sequences
		
		System.out.println("\"Hello Pranay\"");
		System.out.println(s4);
		System.out.println("\'Hello Pranay\'");
		
		// Long strings

		String typingPractice = "The quick brown fox" + 
								"jumped over" + 
								"the lazy dog.";

		// The Null literal
		// The Null literal (written as null) represents the one and only value of the
		// null type.
		Literals literals = null;

		if (literals != null) {
			// Do something
		}

		//Character literals
		char a = 'a';
		char doubleQuote = '"';
		char singleQuote = '\'';
		System.out.println(a+" "+doubleQuote+" "+singleQuote);
		
		//A line-break in a character literal is a compilation error.

		//Integer literals
		
		int max = 2147483647; // OK
		int min = -2147483648; // OK
		//int tooBig = 2147483648; // ERROR
		
		//Long integer literals
		//Literals of type long are expressed by adding an L suffix.

		//long big = 2147483648; // ERROR
		long big2 = 2147483648L; // OK
		
		//Floating-point literals
		float fnum=1.0F; // a `float` literal
		double dnum=1.0D; // a `double` literal.
	}

}
