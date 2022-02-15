import java.util.Arrays;

public class Creating_and_Initializing_Arrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * ArrayType Type of the array. This can be primitive (int, long, byte) or
		 * Objects (String, MyObject, etc).
		 * 
		 * index Index refers to the position of a certain Object in an array.
		 * 
		 * length Every array, when being created, needs a set length specified.
		 */

		/*
		 * An array is a data structure that holds a fixed number of primitive values or
		 * references to object instances.
		 * 
		 * Each item in an array is called an element, and each element is accessed by
		 * its numerical index. The length of an array is established when the array is
		 * created:
		 */
		int size = 42;
		int[] array = new int[size];

		/*
		 * The size of an array is fixed at runtime when initialized. It cannot be
		 * changed after initialization. If the size must be mutable at runtime, a
		 * Collection class such as ArrayList should be used instead. ArrayList stores
		 * elements in an array and supports resizing by allocating a new array and
		 * copying elements from the old array.
		 */

		/*
		 * If the array is of a primitive type, i.e.the values are stored in the array
		 * itself. In the absence of an initializer (as in array2 below), the default
		 * value assigned to each element is 0 (zero).
		 */
		int[] array1 = { 1, 2, 3 };
		int[] array2 = new int[10];

		/*
		 * If the array type is an object reference, as in
		 * 
		 * SomeClassOrInterface[] array = new SomeClassOrInterface[10];
		 * 
		 * then the array contains references to objects of type SomeClassOrInterface.
		 * Those references can refer to an instance of SomeClassOrInterface or any
		 * subclass (for classes) or implementing class (for interfaces) of
		 * SomeClassOrInterface. If the array declaration has no initializer then the
		 * default value of null is assigned to each element.
		 */

		/*
		 * Because all arrays are int-indexed, the size of an array must be specified by
		 * an int. The size of the array cannot be specified as a long:
		 */

		long size1 = 23L;
		// int[] array3 = new int[size1]; // Compile-time error:

		/*
		 * Arrays use a zero-based index system, which means indexing starts at 0 and
		 * ends at length - 1.
		 */

		// Creating and initializing primitive type arrays
		int[] array3 = new int[] { 1, 2, 3 };// Create an array with new operator and array initializer.
		int[] array4 = { 1, 2, 3 };// Shortcut syntax with array initializer.
		int[] array5 = new int[3];// Equivalent to { 0, 0, 0 }
		int[] array6 = null;// The array itself is an object, so it can be set as null.

		// In Java, it is possible to have arrays of size 0:
		int[] array7 = new int[0];// Compiles and runs fine.
		int[] array8 = {};// Equivalent syntax.

		// since it's an empty array, no elements can be read from it or assigned to it:
		array7[0] = 1;// Throws java.lang.ArrayIndexOutOfBoundsException.
		int i = array8[0];// Also throws ArrayIndexOutOfBoundsException.

		// The length of an array must be a non-negative integer:
		int[] array9 = new int[-1]; // Throws java.lang.NegativeArraySizeException

		// The array size can be determined using a public final field called length:
		System.out.println(array.length); // Prints 42 in this case.

		/*
		 * Note: array.length returns the actual size of the array and not the number of
		 * array elements which were assigned a value, unlike ArrayList.size() which
		 * returns the number of array elements which were assigned a value.
		 */

		// Creating and initializing multi-dimensional arrays
		int[][] a = new int[2][3];// It will create two three-length int arrays—a[0] and a[1].

		// You can create and initialize at the same time:
		int[][] b = { { 1, 2 }, { 4, 5, 6 } };

		/*
		 * Unlike C, where only rectangular multi-dimensional arrays are supported,
		 * inner arrays do not need to be of the same length, or even defined:
		 */

		// Filling an array after initialization
		// Arrays.fill() can be used to fill an array with the same value after
		// initialization:

		Arrays.fill(array2, 9);
		for (int j = 0; j < array2.length; j++)
			System.out.print(array2[j] + " ");// 9 9 9 9 9 9 9 9 9 9

		// fill() can also assign a value to each element of the specified range of the
		// array:
		Arrays.fill(array2, 1, 2, 8);
		for (int j = 0; j < array2.length; j++)
			System.out.print(array2[j] + " ");// 9 8 9 9 9 9 9 9 9 9

		/*
		 * Since Java version 8,
		 * 
		 * the method setAll, and its Concurrent equivalent parallelSetAll, can be used
		 * to set every element of an array to generated values. These methods are
		 * passed a generator function which accepts an index and returns the desired
		 * value for that position. The following example creates an integer array and
		 * sets all of its elements to their respective index value:
		 */

		int[] array10 = new int[5];
		Arrays.setAll(array10, index -> index);
		for (int j = 0; j < array10.length; j++)
			System.out.print(array10[j] + " ");// 0 1 2 3 4

		// Arrays may not be re-initialized with array initializer shortcut syntax

		// First initialization of array
		int[] array11 = new int[] { 1, 2, 3 };

		// array11 = { 1, 2, 3, 4 }; // Compile-time error! Can't re-initialize an array
		// via shortcut
		// syntax with array initializer.

		for (int index : array11) {
			System.out.print(index + " ");// 1 2 3
		}

		// Re-initializes array to a new int[] array.
		array11 = new int[] { 4, 5, 6 };

		for (int index : array11) {
			System.out.print(index + " ");// 4 5 6
		}

	}

}
