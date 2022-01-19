
public class Finding_a_String {

	public static void main(String[] args) {
		/**
		 * To check whether a particular String a is being contained in a String b or
		 * not, we can use the method String.contains() with the following syntax:
		 * b.contains(a); // Return true if a is contained in b, false otherwise The
		 * String.contains() method can be used to verify if a CharSequence can be found
		 * in the String. The method looks for the String a in the String b in a
		 * case-sensitive way.
		 */

		String str1 = "Hello World";
		String str2 = "Hello";
		String str3 = "helLO";

		System.out.println(str1.contains(str2));
		System.out.println(str1.contains(str3));

		/**
		 * To find the exact position where a String starts within another String, use
		 * String.indexOf():
		 * 
		 * The String.indexOf() method returns the first index of a char or String in
		 * another String. The method returns -1 if it is not found.
		 */
		
		String str4 = "This is a long distance";
		int i = str4.indexOf('i');
		int j = str4.indexOf("long");
		int h = str4.indexOf("LoNg");
		int k = str4.indexOf('z');

		System.out.println(i + " " + j + " " + h + " " + k);
		
		//Note: The String.indexOf() method is case sensitive.
		String str5 = "Hello World";
		String str6 = "wOr";
		
		System.out.println(str5.indexOf(str6));
		System.out.println(str5.toLowerCase().contains(str6.toLowerCase()));
		System.out.println(str5.toLowerCase().indexOf(str6.toLowerCase()));
		
		
	}

}
