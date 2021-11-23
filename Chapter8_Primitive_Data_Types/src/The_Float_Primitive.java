
public class The_Float_Primitive {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * A float is a single-precision 32-bit IEEE 754 floating point number. By
		 * default, decimals are interpreted as doubles. To create a float, simply
		 * append an f to the decimal literal.
		 */
		double doubleExample = 0.5; // without 'f' after digits = double
		float floatExample = 0.5f; // with 'f' after digits = float
		float myFloat = 92.7f; // this is a float...
		float positiveFloat = 89.3f; // it can be positive,
		float negativeFloat = -89.3f; // or negative
		float integerFloat = 43.0f; // it can be a whole number (not an int)
		float underZeroFloat = 0.0549f; // it can be a fractional value less than 0

		// addition
		float result1 = 37.2f + -2.6f; // result: 34.6
		// subtraction
		float result2 = 45.1f - 10.3f; // result: 34.8
		// multiplication
		float result3 = 26.3f * 1.7f; // result: 44.71
		// division
		float result4 = 37.1f / 4.8f; // result: 7.729166
		// modulus
		float result5 = 37.1f % 4.8f; // result: 3.4999971

		System.out.println(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5);

		float defaultFloat; // defaultFloat == 0.0f

		System.out.println(Float.POSITIVE_INFINITY / Float.POSITIVE_INFINITY); // NaN
	}

}
