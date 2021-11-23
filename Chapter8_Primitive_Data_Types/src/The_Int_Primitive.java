
public class The_Int_Primitive {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// int is a 32-bit signed integer

		int example = -42;
		int myInt = 284;
		int anotherInt = 73;
		int addedInts = myInt + anotherInt; // 284 + 73 = 357
		int subtractedInts = myInt - anotherInt; // 284 - 73 = 211

		// The default value of an int is 0
		int defaultInt; // defaultInt == 0

		// The maximum and minimum values of int can be found at:
		int high = Integer.MAX_VALUE; // high == 2147483647
		int low = Integer.MIN_VALUE; // low == -2147483648

		int demo = 2147483647; // maximum positive integer
		System.out.println(demo); // prints 2147483647
		demo = demo + 1; // leads to an integer overflow
		System.out.println(demo); // prints -2147483648

		// If you need to store a number outside of this range, long should be used
		// instead.

	}

}
