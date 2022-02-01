import java.util.Formatter;
import java.util.StringJoiner;

public class StringBuffer_StringBuilder_Formatter_StringJoiner {

	public static void main(String[] args) {
		/*
		 * Java StringBuilder class is used to create mutable (modifiable) string. The
		 * Java StringBuilder class is same as StringBuffer class except that it is
		 * non-synchronized. It is available since JDK 1.5.
		 */

		/*
		 * The StringBuffer class has been present since Java 1.0, and provides a
		 * variety of methods for building and modifying a "buffer" containing a
		 * sequence of characters.
		 * 
		 * The StringBuilder class was added in Java 5 to address performance issues
		 * with the original StringBuffer class. The APIs for the two clases are
		 * essentially the same. The main difference between StringBuffer and
		 * StringBuilder is that the former is thread-safe and synchronized and the
		 * latter is not.
		 */
		int one = 1;
		String color = "red";
		StringBuilder sb = new StringBuilder();
		sb.append("One=").append(one).append(", color=").append(color);
		System.out.println(sb);// One=1, color=red

		/*
		 * (The StringBuffer class is used the same way: just change StringBuilder to
		 * StringBuffer in the above)
		 * 
		 * The StringBuffer and StringBuilder classes are suitable for both assembling
		 * and modifying strings; i.e they provide methods for replacing and removing
		 * characters as well as adding them in various. The remining two classes are
		 * specific to the task of assembling strings.
		 */

		/*
		 * The Formatter class was added in Java 5, and is loosely modeled on the
		 * sprintf function in the C standard library. It takes a format string with
		 * embedded format specifiers and a sequences of other arguments, and generates
		 * a string by converting the arguments into text and substituting them in place
		 * of the format specifiers. The details of the format specifiers say how the
		 * arguments are converted into text.
		 */

		Formatter f = new Formatter();
		System.out.println(f.format("One=%d, color=%s", one, color));// One=1, color=red

		// The same thing using the `String.format` convenience method
		System.out.println(String.format("One=%d, color=%s", one, color));// One=1, color=red

		/*
		 * The StringJoiner class was added in Java 8. It is a special purpose formatter
		 * that succinctly formats a sequence of strings with separators between them.
		 * It is designed with a fluent API, and can be used with Java 8 streams.
		 */
		StringJoiner joinNames1 = new StringJoiner(",", "[", "]"); // passing comma(,) and square-brackets as delimiter

		// Adding values to StringJoiner
		joinNames1.add("Rahul");
		joinNames1.add("Raju");
		System.out.println(joinNames1);// [Rahul,Raju]

		// Creating StringJoiner with :(colon) delimiter
		StringJoiner joinNames2 = new StringJoiner(":", "[", "]"); // passing colon(:) and square-brackets as delimiter

		// Adding values to StringJoiner
		joinNames2.add("Peter");
		joinNames2.add("Raheem");
		System.out.println(joinNames2);// [Peter:Raheem]

		// Merging two StringJoiner
		StringJoiner merge = joinNames1.merge(joinNames2);
		System.out.println(merge);// [Rahul,Raju,Peter:Raheem]

		/*
		 * The use-cases for the 4 classes can be summarized:
		 * 
		 * StringBuilder suitable for any string assembly OR string modification task.
		 * 
		 * StringBuffer use (only) when you require a thread-safe version of
		 * StringBuilder.
		 * 
		 * Formatter provides much richer string formatting functionality, but is not as
		 * efficient as StringBuilder. This is because each call to
		 * Formatter.format(...) entails: parsing the format string, creating and
		 * populate a varargs array, and autoboxing any primitive type arguments.
		 * 
		 * StringJoiner provides succinct and efficient formatting of a sequence of
		 * strings with separators, but is not suitable for other formatting tasks.
		 */
	}

}
