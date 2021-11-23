
public class The_Boolean_Primitive {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// A boolean can store one of two values, either true or false

		boolean foo = true;
		System.out.println("foo = " + foo); // foo = true
		boolean bar = false;
		System.out.println("bar = " + bar); // bar = false
		boolean notFoo = !foo;
		System.out.println("notFoo = " + notFoo); // notFoo = false
		boolean fooAndBar = foo && bar;
		System.out.println("fooAndBar = " + fooAndBar); // fooAndBar = false
		boolean fooOrBar = foo || bar;
		System.out.println("fooOrBar = " + fooOrBar); // fooOrBar = true
		boolean fooXorBar = foo ^ bar;
		System.out.println("fooXorBar = " + fooXorBar); // fooXorBar = true

		// The default value of a boolean is false
		boolean defaultBoolean; // defaultBoolean == false

	}

}
