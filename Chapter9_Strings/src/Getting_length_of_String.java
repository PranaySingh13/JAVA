
public class Getting_length_of_String {

	public static void main(String[] args) {
		/*
		 * In order to get the length of a String object, call the length() method on
		 * it. The length is equal to the number of UTF-16 code units (chars) in the
		 * string.
		 */
		String str = "Hello, World!";
		System.out.println(str.length()); // 13

		// We can also use a Stream of codepoints, as of Java 8:
		
		System.out.println(str.codePoints().count());// 13
		System.out.println(str.codePointAt(0));// Unicode of char at 0 index
		System.out.println(str.codePointBefore(1));// Unicode of char before 1 index
		System.out.println(str.codePointCount(0, 2));// length between the given index range

	}

}
