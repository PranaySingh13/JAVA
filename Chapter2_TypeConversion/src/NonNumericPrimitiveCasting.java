
public class NonNumericPrimitiveCasting {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// int badInt = (int) true; // Compiler error: incompatible types

		char char1 = (char) 65; // A
		byte byte1 = (byte) 'A'; // 65
		short short1 = (short) 'A'; // 65
		int int1 = (int) 'A'; // 65
		char char2 = (char) 8253; // ‽
		byte byte2 = (byte) '‽'; // 61 (truncated code-point into the ASCII range)
		short short2 = (short) '‽'; // 8253
		int int2 = (int) '‽'; // 8253

	}

}
