import java.util.StringTokenizer;

public class StringTokenizerUse {

	public static void main(String[] args) {
		/*
		 * The java.util.StringTokenizer class allows you to break a string into tokens.
		 * It is simple way to break string.
		 * 
		 * The set of delimiters (the characters that separate tokens) may be specified
		 * either at creation time or on a pertoken basis.
		 */

		// StringTokenizer Split
		StringTokenizer st = new StringTokenizer("02/02/2022", "/");
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " ");// 02 02 2022
		}

	}

}
