
public class Remove_WhiteSpace_Beginning_End_String {

	public static void main(String[] args) {

		// The trim() method returns a new String with the leading and trailing
		// whitespace removed.
		String s = "        Hello World!!!        ";
		System.out.println(s.trim());

		/*
		 * If you trim a String that doesn't have any whitespace to remove, you will be
		 * returned the same String instance.
		 * 
		 * Note that the trim() method has its own notion of whitespace, which differs
		 * from the notion used by the Character.isWhitespace() method:
		 * 
		 * All ASCII control characters with codes U+0000 to U+0020 are considered
		 * whitespace and are removed by trim(). This includes U+0020 'SPACE', U+0009
		 * 'CHARACTER TABULATION', U+000A 'LINE FEED' and U+000D 'CARRIAGE RETURN'
		 * characters, but also the characters like U+0007 'BELL'.
		 * 
		 * Unicode whitespace like U+00A0 'NO-BREAK SPACE' or U+2003 'EM SPACE' are not
		 * recognized by trim().
		 */
	}

}
