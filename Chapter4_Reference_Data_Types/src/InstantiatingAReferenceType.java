
public class InstantiatingAReferenceType {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Object obj=new Object();// Note the 'new' keyword

		/*
		 * Where:
			Object is a reference type.
			obj is the variable in which to store the new reference.
			Object() is the call to a constructor of Object.

			What happens:
			Space in memory is allocated for the object.
			The constructor Object() is called to initialize that memory space.
			The memory address is stored in obj, so that it references the newly created object.
		 * */
	}

}
