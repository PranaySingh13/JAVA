
public class ConvertingPrimitives {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// boolean is the only primitive datatype that cannot be converted to or from
		// any other primitive datatype.

		/*
		 * A widening conversion is when a value of one datatype is converted to a value
		 * of another datatype that occupies more bits than the former. There is no
		 * issue of data loss in this case.
		 * 
		 * Correspondingly, A narrowing conversion is when a value of one datatype is
		 * converted to a value of another datatype that occupies fewer bits than the
		 * former. Data loss can occur in this case.
		 */
		
		//Widening Conversion:
			int a = 1;
			double d = a; // valid conversion to double, no cast needed (widening)
			
		//Narrowing Conversion:
			double d1 = 18.96;
			
			//int b = d1; // invalid conversion to int, will throw a compile-time error
			
			int b = (int) d1; // valid conversion to int, but result is truncated (gets rounded down)
			// This is type-casting
			// Now, b = 18

	}

}
