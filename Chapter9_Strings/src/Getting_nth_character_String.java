
public class Getting_nth_character_String {

	public static void main(String[] args) {

		String str = "My String";
		System.out.println(str.charAt(0)); // "M"
		System.out.println(str.charAt(1)); // "y"
		System.out.println(str.charAt(2)); // " "
		System.out.println(str.charAt(str.length() - 1)); // Last character "g"

		/*
		 * To get the nth character in a string, simply call charAt(n) on a String,
		 * where n is the index of the character you would like to retrieve NOTE: index
		 * n is starting at 0, so the first element is at n=0.
		 */
	}

}
