
public class Substrings {

	public static void main(String[] args) {

		String s = "This is an example";

		// It will hold the string starting at character 11 until the end
		System.out.println(s.substring(11));// example

		/*
		 * It will hold the string starting at character 11 and ending right before
		 * character 15
		 */
		System.out.println(s.substring(11, 15));// exam

		System.out.println(s.substring(0, s.length() - 14));// This
	}

}
