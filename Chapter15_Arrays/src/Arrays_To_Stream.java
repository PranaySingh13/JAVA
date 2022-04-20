import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Arrays_To_Stream {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Version ≥ Java SE 8
		 * 
		 * Converting an array of objects to Stream:
		 */
		String[] arr = new String[] { "str1", "str2", "str3" };
		Stream<String> stream = Arrays.stream(arr);

		int[] intArr = { 1, 2, 3 };
		IntStream intStream = Arrays.stream(intArr);

		/*
		 * A method similar to Arrays.stream() appears in the Stream class: Stream.of().
		 * The difference is that Stream.of() uses a varargs parameter, so you can write
		 * something like:
		 */

		Stream<Integer> intStream1 = Stream.of(1, 2, 3);
		Stream<String> stringStream = Stream.of("1", "2", "3");
		Stream<Double> doubleStream = Stream.of(new Double[] { 1.0, 2.0 });
	}

}
