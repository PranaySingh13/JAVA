import org.apache.commons.lang3.StringUtils;

public class Counting_Occurences_In_String {

	public static void main(String[] args) {
		/*
		 * countMatches method from org.apache.commons.lang3.StringUtils is typically
		 * used to count occurrences of a substring or character in a String:
		 */

		String text = "One fish, two fish, red fish, blue fish";

		// count occurrences of a substring
		String stringTarget = "fish";
		int stringOccurrences = StringUtils.countMatches(text, stringTarget);// 4

		// count occurrences of a char
		char charTarget = ',';
		int charOccurrences = StringUtils.countMatches(text, charTarget); // 3

	}

}
