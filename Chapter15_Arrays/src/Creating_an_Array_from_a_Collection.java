import java.util.HashSet;
import java.util.Set;

public class Creating_an_Array_from_a_Collection {

	/**
	 * Two methods in java.util.Collection create an array from a collection:
	 * Object[] toArray()
	 * 
	 * <T> T[] toArray(T[] a)
	 */
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("red");
		set.add("blue");
		System.out.println(set.toArray());
		// although set is a Set<String>, toArray() returns an Object[] not a
		// String[].

		System.out.println(set.toArray(new String[0]));

		/*
		 * Version ≥ Java SE 8 Starting from Java SE 8+,
		 * 
		 * where the concept of Stream has been introduced, it is possible to use the
		 * Stream produced by the collection in order to create a new Array using the
		 * Stream.toArray method.
		 */

		String[] str = set.stream().toArray(String[]::new);
		System.out.println(str[0] + " " + str[1]);// red blue

	}

}
