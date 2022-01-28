import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining_Strings {

	public static void main(String[] args) {

		// Joining Strings with a delimiter

		/*
		 * Version ≥ Java SE 8 An array of strings can be joined using the static method
		 * String.join()
		 */
		String elements[] = { "Pranay", "Singh", "Age", "28" };
		String singleString = String.join("-", elements);
		System.out.println(singleString);// Pranay-Singh-Age-28

		/*
		 * To have a fine-grained control over joining, you may use StringJoiner class:
		 * 
		 * The last two arguments are optional.
		 * 
		 * they define prefix and suffix for the result string
		 */
		StringJoiner sj = new StringJoiner(",", "{", "}");
		sj.add("Pranay");
		sj.add("Singh");
		sj.add("Age");
		sj.add("28");
		System.out.println(sj);// {Pranay,Singh,Age,28}

		/*
		 * To join a stream of strings, you may use the joining collector.
		 * 
		 * The last two arguments are optional.
		 * 
		 * they define prefix and suffix for the result string
		 */

		Stream<String> stringStream = Stream.of("Pranay", "Singh", "Age", "28");
		String joined = stringStream.collect(Collectors.joining("-", "{", "}"));
		System.out.println(joined);// {Pranay-Singh-Age-28}

	}

}
