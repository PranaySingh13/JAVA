import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Splitting_Strings {

	public static void main(String[] args) {
		/*
		 * You can split a String on a particular delimiting character or a Regular
		 * Expression, you can use the String.split() method that has the following
		 * signature:
		 * 
		 * public String[] split(String regex)
		 * 
		 * Note that delimiting character or regular expression gets removed from the
		 * resulting String Array.
		 */

		// Example using delimiting character:
		String lineFromFile = "Pranay;Singh;Age;28";
		String[] dataCells = lineFromFile.split(";");
		for (int i = 0; i < dataCells.length; i++)
			System.out.print(dataCells[i] + " ");
		System.out.println();

		// Example using regular expression:
		String str = "What   do you need     from me ?";
		String[] words = str.split("\\s+");// Escaping one or more space chars
		for (int i = 0; i < words.length; i++)
			System.out.print(words[i] + " ");
		System.out.println();

		// You can even directly split a String literal:
		String[] firstNames = "Pranay, Singh, Age, 28".split(", ");
		for (int i = 0; i < firstNames.length; i++)
			System.out.print(firstNames[i] + " ");
		System.out.println();

		String[] str1 = "aaa.bbb".split(".");
		for (int i = 0; i < str1.length; i++)
			System.out.print(str1[i] + " ");
		System.out.println();
		/*
		 * . is treated as the regular expression wildcard that matches any character,
		 * and since every character is a delimiter, the result is an empty array.
		 */

		/*
		 * Splitting based on a delimiter which is a regex meta-character The following
		 * characters are considered special (aka meta-characters) in regex < > - = ! (
		 * ) [ ] { } \ ^ $ | ? * + .
		 */

		/*
		 * To split a string based on one of the above delimiters, you need to either
		 * escape them using \\ or use Pattern.quote():
		 */

		// Using Pattern.quote():
		String str2 = "a|b|c";
		String regex = Pattern.quote("|");
		String[] arr = str2.split(regex);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		// Escaping the special characters:
		String[] arr1 = str2.split("\\|");
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();

		/*
		 * Split removes empty values
		 * 
		 * split(delimiter) by default removes trailing empty strings from result array.
		 * To turn this mechanism off we need to use overloaded version of
		 * split(delimiter, limit) with limit set to negative value like
		 * 
		 * String[] split = data.split("\\|", -1);
		 * 
		 * split(regex) internally returns result of split(regex, 0).
		 * 
		 * The limit parameter controls the number of times the pattern is applied and
		 * therefore affects the length of the resulting array.
		 * 
		 * If the limit n is greater than zero then the pattern will be applied at most
		 * n - 1 times, the array's length will be no greater than n, and the array's
		 * last entry will contain all input beyond the last matched delimiter.
		 * 
		 * If n is negative, then the pattern will be applied as many times as possible
		 * and the array can have any length.
		 * 
		 * If n is zero then the pattern will be applied as many times as possible, the
		 * array can have any length, and trailing empty strings will be discarded.
		 */
		String strLimit = "a|b|c|d|e";
		String regex1 = Pattern.quote("|");
		String[] arr2 = strLimit.split(regex1, 3);
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();

		/*
		 * Splitting with a StringTokenizer Besides the split() method Strings can also
		 * be split using a StringTokenizer. StringTokenizer is even more restrictive
		 * than String.split(), and also a bit harder to use. It is essentially designed
		 * for pulling out tokens delimited by a fixed set of characters. ach character
		 * will act as a separator. Because of this restriction, it's about twice as
		 * fast as String.split().
		 */

		String str3 = "The Lazy fox jumped over the brown fence";
		StringTokenizer token = new StringTokenizer(str3);
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

		// You can use different character sets for separation.
		// In this case character `u` and `e` will be used as delimiters
		StringTokenizer tokenizer = new StringTokenizer(str3, "ue");
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}

}
