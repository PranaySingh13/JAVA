
public class NumericPrimitveCasting {

	public static void main(String[] args) {

		// Implicit casting happens when the source type has smaller range than the
		// target type.
		// Implicit casting
		byte b = 42;
		System.out.println(b);

		short shortb = b;
		System.out.println(shortb);

		int intb = shortb;
		System.out.println(intb);

		long longb = intb;
		System.out.println(longb);

		float floatb = longb;
		System.out.println(floatb);

		double doubleb = floatb;
		System.out.println(doubleb);

		// Explicit casting has to be done when the source type has larger range than
		// the target type.

		double doubleVar = 42.0d;
		System.out.println(doubleVar);

		float floatVar = (float) doubleVar;
		System.out.println(floatVar);

		long longVar = (long) floatVar;
		System.out.println(longVar);
		
		int intVar = (int) longVar;
		System.out.println(intVar);
		
		short shortVar = (short) intVar;
		System.out.println(shortVar);
		
		byte byteVar = (byte) shortVar;
		System.out.println(byteVar);
	}

}
