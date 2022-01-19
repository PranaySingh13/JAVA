import java.util.Locale;
import java.util.Objects;

public class Comparing_Strings {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		// Strings (java.lang.String) are pieces of text stored in your program. Strings
		// are not a primitive data type in Java,
		// In Java, Strings are immutable, meaning that they cannot be changed.

		/*
		 * In order to compare Strings for equality, you should use the String object's
		 * equals or equalsIgnoreCase methods
		 */

		// equals will determine if the two instances of String are equal on all
		// characters
		String str1 = "Test123";
		String str2 = "Test" + 123;
		System.out.println(str1.equals(str2));// true

		// equalsIgnoreCase will compare them, independent of their case
		String str3 = "Test123";
		String str4 = "TEST123";
		System.out.println(str3.equals(str4));// false

		/*
		 * Note that equalsIgnoreCase does not let you specify a Locale. For instance,
		 * if you compare the two words "Taki" and "TAKI" in English they are equal;
		 * however, in Turkish they are different (in Turkish, the lowercase I is ı).
		 * For cases like this, converting both strings to lowercase (or uppercase) with
		 * Locale and then comparing with equals is the solution.
		 */

		String str5 = "TaKi";
		String str6 = "TAKI";
		System.out.println(str5.equalsIgnoreCase(str6));// true

		Locale locale = Locale.forLanguageTag("tr-TR");

		System.out.println(str5.toLowerCase(locale).equals(str6.toLowerCase(locale)));// false

		/*
		 * Do not use the == operator to compare Strings Unless you can guarantee that
		 * all strings have been interned (see below), you should not use the == or !=
		 * operators to compare Strings. These operators actually test references, and
		 * since multiple String objects can represent the same String, this is liable
		 * to give the wrong answer. Instead, use the String.equals(Object) method,
		 * which will compare the String objects based on their values.
		 */

		/**
		 * Comparing Strings in a switch statement
		 * 
		 * Version ≥ Java SE 7 As of Java 1.7,
		 * 
		 * it is possible to compare a String variable to literals in a switch
		 * statement. Make sure that the String is not null, otherwise it will always
		 * throw a NullPointerException. Values are compared using String.equals, i.e.
		 * case sensitive.
		 */

		String stringToSwitch = "A";

		switch (stringToSwitch) {
		case "a":
			System.out.println("a");
			break;
		case "A":
			System.out.println("A");// the code goes here
			break;
		case "B":
			System.out.println("B");
			break;
		default:
			break;
		}

		/**
		 * Comparing Strings with constant values
		 * 
		 * When comparing a String to a constant value, you can put the constant value
		 * on the left side of equals to ensure that you won't get a
		 * NullPointerException if the other String is null.
		 */
		String str7 = "ABC";
		String str8 = null;
		System.out.println("abc".equals(str7));// false
		System.out.println("abc".equals(str8));// false
		//System.out.println(str8.equals("abc")); null pointer exception

		/**
		 * While foo.equals("baz") will throw a NullPointerException if foo is null,
		 * "baz".equals(foo) will evaluate to false.
		 * 
		 * Version ≥ Java SE 7
		 * 
		 * A more readable alternative is to use Objects.equals(), which does a null
		 * check on both parameters: Objects.equals(foo, "baz").
		 * 
		 * (Note: It is debatable as to whether it is better to avoid
		 * NullPointerExceptions in general, or let them happen and then fix the root
		 * cause; see here and here. Certainly, calling the avoidance strategy "best
		 * practice" is not justifiable.)
		 */
		
		String str9="CDE";
		System.out.println(Objects.equals(str9, "cde"));//false
	}

}
