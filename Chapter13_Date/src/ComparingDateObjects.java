import java.time.LocalDate;

public class ComparingDateObjects {

	public static void main(String[] args) {
		/*
		 * Version ≥ Java SE 8
		 * 
		 * isBefore, isAfter, compareTo and equals methods
		 */

		// Use of LocalDate
		final LocalDate now = LocalDate.now();
		System.out.println(now);// 2022-02-10

		final LocalDate birthdate2 = LocalDate.of(2012, 6, 30);
		final LocalDate birthdate3 = LocalDate.of(2012, 6, 30);

		System.out.println(now.isBefore(birthdate2));// false
		System.out.println(now.isBefore(birthdate3));// false

		System.out.println(now.isAfter(birthdate2));// true
		System.out.println(now.isAfter(birthdate3));// true

		System.out.println(now.isEqual(now));// true

		// comapreTo gives year difference of dates
		System.out.println(now.compareTo(birthdate2));// 10
		System.out.println(birthdate3.compareTo(now));// -10
		System.out.println(now.compareTo(now));// 0

	}

}
