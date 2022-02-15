import java.util.Arrays;
import java.util.List;

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
	}

}
