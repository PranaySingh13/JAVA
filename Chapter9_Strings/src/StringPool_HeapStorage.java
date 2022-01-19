
public class StringPool_HeapStorage {

	public static void main(String[] args) {

		/*
		 * When the JVM finds a String literal that has no equivalent reference in the
		 * heap, the JVM creates a corresponding String instance on the heap and it also
		 * stores a reference to the newly created String instance in the String pool.
		 * Any other references to the same String literal are replaced with the
		 * previously created String instance in the heap.
		 */

		/*
		 * When we use double quotes to create a String, it first looks for String with
		 * same value in the String pool, if found it just returns the reference else it
		 * creates a new String in the pool and then returns the reference.
		 * 
		 * However using new operator, we force String class to create a new String
		 * object in heap space. We can use intern() method to put it into the pool or
		 * refer to other String object from string pool having same value.
		 */
		String a = "alpha";
		String b = "alpha";
		String c = new String("alpha");

		// All three strings are equivalent
		System.out.println(a.equals(b) && b.equals(c));

		// Although only a and b reference the same heap object
		System.out.println(a == b);
		System.out.println(a != c);
		System.out.println(b != c);

	}

}
