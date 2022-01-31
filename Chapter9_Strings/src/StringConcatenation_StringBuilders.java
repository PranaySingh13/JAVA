
public class StringConcatenation_StringBuilders {

	public static void main(String[] args) {

		/* String concatenation can be performed using the + operator. */
		String s1 = "a";
		String s2 = "b";
		String s3 = "c";
		String s = s1 + s2 + s3;
		System.out.println(s);// abc

		/*
		 * Normally a compiler implementation will perform the above concatenation using
		 * methods involving a StringBuilder under the hood. When compiled, the code
		 * would look similar to the below.
		 * 
		 * StringBuilder has several overloaded methods for appending different types
		 */
		StringBuilder sb = new StringBuilder("d");
		String str = sb.append("e").append(2).toString();
		System.out.println(str);

		/*
		 * If you are producing many strings, it is advisable to reuse StringBuilders:
		 * 
		 * If (and only if) multiple threads are writing to the same buffer, use
		 * StringBuffer, which is a synchronized version of StringBuilder. But because
		 * usually only a single thread writes to a buffer, it is usually faster to use
		 * StringBuilder without synchronization.
		 */

		// Using concat() method

		/*
		 * This returns a new string that is string1 with string2 added to it at the
		 * end. We can also use the concat() method with string literals, as in:
		 */
		String str1 = "Pranay ";
		String str2 = "Singh";
		System.out.println(str1.concat(str2));
		System.out.println("Hello, ".concat(str1));
	}

}
