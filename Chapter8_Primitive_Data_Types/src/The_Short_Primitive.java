
public class The_Short_Primitive {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// A short is a 16-bit signed integer. It has a minimum value of (-32,768), and
		// a maximum value of (32,767)

		short example = -48;
		short myShort = 987;
		short anotherShort = 17;
		short addedShorts = (short) (myShort + anotherShort); // 1,004
		short subtractedShorts = (short) (myShort - anotherShort); // 970

		// The maximum and minimum values of short can be found at:
		short high = Short.MAX_VALUE; // high == 32767
		short low = Short.MIN_VALUE; // low == -32768

		// The default value of a short is 0
		short defaultShort; // defaultShort == 0

	}

}
