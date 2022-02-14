import java.time.LocalDate;
import java.time.Period;

/*Period Object:
Period object can be used to represent quantity of time*/
public class PeriodObject {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1993, 01, 13);

		Period p = Period.between(birthday, today);
		System.out.println(p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days.");
		// 29 years 1 months 1 days.
	}

}
