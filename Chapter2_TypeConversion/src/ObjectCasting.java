
public class ObjectCasting {

	@SuppressWarnings({ "unused", "removal" })
	public static void main(String[] args) {
		// objects can be cast both explicitly and implicitly.

		Float floatVar = new Float(42.0f);
		Number n = floatVar; // Implicit (Float implements Number)
		Float floatVar2 = (Float) n; // Explicit
		Double doubleVar = (Double) n; // Throws exception (the object is not Double)
	}

}
