
public class Array_Index_Out_Of_Bounds_Exception {

	public static void main(String[] args) {
		/*
		 * The ArrayIndexOutOfBoundsException is thrown when a non-existing index of an
		 * array is being accessed. Arrays are zero-based indexed, so the index of the
		 * first element is 0 and the index of the last element is the array capacity
		 * minus 1 (i.e. array.length - 1). Therefore, any request for an array element
		 * by the index i has to satisfy the condition 0 <= i < array.length, otherwise
		 * the ArrayIndexOutOfBoundsException will be thrown.
		 */
		String[] people = new String[] { "Carol", "Andy" };
		System.out.println(people[2]);// java.lang.ArrayIndexOutOfBoundsException

	}

}
