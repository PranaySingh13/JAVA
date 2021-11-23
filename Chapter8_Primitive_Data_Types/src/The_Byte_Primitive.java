
public class The_Byte_Primitive {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// byte is a 8-bit signed integer. It can store a minimum value of -27 (-128),
		// and a maximum value of 27 - 1 (127)

		byte example = -36;
		byte myByte = 96;
		byte anotherByte = 7;
		byte addedBytes = (byte) (myByte + anotherByte); // 103
		byte subtractedBytes = (byte) (myByte - anotherByte); // 89

		// The maximum and minimum values of byte can be found at:
		byte high = Byte.MAX_VALUE; // high == 127
		byte low = Byte.MIN_VALUE; // low == -128

		// The default value of a byte is 0
		byte defaultByte; // defaultByte == 0

	}

}
