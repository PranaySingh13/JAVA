
public class Changing_Case_Of_String {

	public static void main(String[] args) {
		/**
		 * Changing the case of characters within a String The String type provides two
		 * methods for converting strings between upper case and lower case: toUpperCase
		 * to convert all characters to upper case toLowerCase to convert all characters
		 * to lower case These methods both return the converted strings as new String
		 * instances: the original String objects are not modified because String is
		 * immutable in Java(unable to get changed).
		 */

		String str = "This is a Random String";

		String upperstr = str.toUpperCase();
		String lowerstr = str.toLowerCase();

		System.out.println(str);
		System.out.println(upperstr);
		System.out.println(lowerstr);

	}

}
