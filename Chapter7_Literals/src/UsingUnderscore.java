
public class UsingUnderscore {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Version ≥ Java SE 7
		int i1 = 123456;
		int i2 = 123_456;
		System.out.println(i1 == i2); // true

		// all primitive number literals
		byte color = 1_2_3;

		short yearsAnnoDomini = 2_016;

		int socialSecurtyNumber = 999_99_9999;

		long creditCardNumber = 1234_5678_9012_3456L;

		float piFourDecimals = 3.14_15F;

		double piTenDecimals = 3.14_15_92_65_35;

		// binary, octal and hexadecimal bases
		short binary = 0b0_1_0_1;

		int octal = 07_7_7_7_7_7_7_7_0;

		long hexBytes = 0xFF_EC_DE_5E;

		// Not valid Cases
		// int x=_123 or123_;
		// float y=1._23F or 1_.23F or 1.23_F;
		// long z=9999999_L;
		// long hex=0_xFFFF;

	}

}
