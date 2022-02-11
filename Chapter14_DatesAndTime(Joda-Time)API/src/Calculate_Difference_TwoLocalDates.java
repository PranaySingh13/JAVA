import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculate_Difference_TwoLocalDates {

	public static void main(String[] args) {

		LocalDate ld1 = LocalDate.of(1993, 01, 13);
		LocalDate ld2 = LocalDate.of(1993, 01, 18);

		/*
		 * now, since the method between of the ChronoUnit enumerator takes 2 Temporals
		 * as parameters so you can pass without a problem the LocalDate instances
		 */
		long days = ChronoUnit.DAYS.between(ld1, ld2);
		System.out.println(days);// 5
	}

}
