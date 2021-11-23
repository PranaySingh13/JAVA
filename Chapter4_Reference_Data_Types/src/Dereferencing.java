
public class Dereferencing {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {

		// Dereferencing happens with the . operator

		Object obj = new Object();// obj is the variable in which to store the new reference.
		String text = obj.toString();// 'obj' is dereferenced.

		Object obj1 = null;
		obj1.toString(); // Throws a NullpointerException when this statement is executed.
	}

}
