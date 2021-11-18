
public class BasicNumericPromotion {

	public static void main(String[] args) {

		char char1 = 1, char2 = 2;
		short short1 = 1, short2 = 2;
		int int1 = 1, int2 = 2;
		float float1 = 1.0f, float2 = 2.0f;
		// char1 = char1 + char2; // Error: Cannot convert from int to char;
		// short1 = short1 + short2; // Error: Cannot convert from int to short;
		int1 = char1 + char2; // char is promoted to int.
		int1 = short1 + short2; // short is promoted to int.
		int1 = char1 + short2; // both char and short promoted to int.
		float1 = short1 + float2; // short is promoted to float.
		int1 = int1 + int2; // int is unchanged.

	}

}
