import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Creating_a_List_from_an_Array {

	public static void main(String[] args) {

		/*
		 * The Arrays.asList() method can be used to return a fixed-size List containing
		 * the elements of the given array. The resulting List will be of the same
		 * parameter type as the base type of the array.
		 */
		String[] stringArray = { "Pranay", "Singh" };
		List<String> stringList = Arrays.asList(stringArray);
		System.out.println(stringList);// [Pranay, Singh]

		/*
		 * Note: This list is backed by (a view of) the original array, meaning that any
		 * changes to the list will change the array and vice versa. However, changes to
		 * the list that would change its size (and hence the array length) will throw
		 * an exception.
		 */

		/*
		 * In Java SE 7 and later, a pair of angle brackets <> (empty set of type
		 * arguments) can be used, which is called the Diamond. The compiler can
		 * determine the type arguments from the context. This means the type
		 * information can be left out when calling the constructor of ArrayList and it
		 * will be inferred automatically during compilation. This is called Type
		 * Inference which is a part of Java Generics.
		 */

		// Using Arrays.asList()
		String[] stringArray1 = { "Virat", "Kohli" };
		List<String> stringList1 = new ArrayList<>(Arrays.asList(stringArray1));
		System.out.println(stringList1);// [Virat, Kohli]

		// Using ArrayList.addAll()
		String[] stringArray2 = { "Rohit", "Sharma" };
		ArrayList<String> stringList2 = new ArrayList<>();
		stringList2.addAll(Arrays.asList(stringArray2));
		System.out.println(stringList2);// [Rohit, Sharma]

		// Using Collections.addAll()
		String[] stringArray3 = { "MS", "Dhoni" };
		ArrayList<String> stringList3 = new ArrayList<>();
		Collections.addAll(stringList3, stringArray3);
		System.out.println(stringList3);// [MS, Dhoni]

		// Using Streams
		int[] ints = { 1, 2, 3 };
		List<Integer> intList = Arrays.stream(ints).boxed().collect(Collectors.toList());
		System.out.println(intList);//[1, 2, 3]
	}

}
