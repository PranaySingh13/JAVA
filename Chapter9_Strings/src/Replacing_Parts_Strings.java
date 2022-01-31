
public class Replacing_Parts_Strings {

	public static void main(String[] args) {

		/*
		 * Two ways to replace: by regex or by exact match.
		 * 
		 * Note: the original String object will be unchanged, the return value holds
		 * the changed String.
		 */

		// Exact match

		// Returns a new string resulting from replacing all occurrences of oldChar in
		// this string with newChar.

		String s = "popcorn";
		System.out.println(s.replace('p', 'W'));// WoWcorn

		// Replace sequence of characters with another sequence of characters:

		String s1 = "metal petal at al";
		System.out.println(s1.replace("etal", "etallica"));// metallica petallica at al

		// Regex
		// Note: the grouping uses the $ character to reference the groups, like $1.

		// Replaces each substring of this string that matches the given regular
		// expression with the given replacement.

		String s2 = "My name is Mike. My name is Tyson";
		System.out.println(s2.replaceAll("is", "was"));// My name was Mike. My name was Tyson

		// Replaces the first substring of this string that matches the given regular
		// expression with the given replacement

		System.out.println(s2.replaceFirst("is", "was"));// My name was Mike. My name is Tyson
	}

}
