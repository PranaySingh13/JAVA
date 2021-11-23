import java.util.Objects;

public class The_Long_Primitive {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// long is a 64-bit signed integer (in Java 8, it can be either signed or
		// unsigned).

		long example = -42;
		long myLong = 284;
		long anotherLong = 73;

		// an "L" must be appended to the end of the number, because by default,
		// numbers are assumed to be the int type. Appending an "L" makes it a long
		// as 549755813888 (2 ^ 39) is larger than the maximum value of an int (2^31 -
		// 1),
		// "L" must be appended
		long bigNumber = 549755813888L;
		long addedLongs = myLong + anotherLong; // 284 + 73 = 357
		long subtractedLongs = myLong - anotherLong; // 284 - 73 = 211

		// The maximum and minimum values of long can be found at:
		long high = Long.MAX_VALUE; // high == 9223372036854775807L
		long low = Long.MIN_VALUE; // low == -9223372036854775808L

		// The default value of a long is 0L
		long defaultLong; // defaultLong == 0L

		/*
		 * Note: letter "L" appended at the end of long literal is case insensitive,
		 * however it is good practice to use capital as it is easier to distinct from
		 * digit one:
		 */
		// 2L == 2l; // true

		// Warning: Java caches Integer objects instances from the range -128 to 127.
		Long val1 = 127L;
		Long val2 = 127L;
		System.out.println(val1 == val2); // true

		Long val3 = 128L;
		Long val4 = 128L;
		System.out.println(val3 == val4); // false

		// To properly compare 2 Object Long values, use the following code(From Java
		// 1.7 onward):
		System.out.println(Objects.equals(val3, val4)); // true

		// Comparing a primitive long to an Object long will not result in a false
		// negative like comparing 2 objects with == does.
	}

}
