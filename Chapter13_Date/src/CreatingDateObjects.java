import java.util.Calendar;
import java.util.Date;

public class CreatingDateObjects {

	public static void main(String[] args) {
		// Current Date
		Date date = new Date();
		System.out.println(date);// Thu Feb 10 22:56:04 IST 2022

		// Creating Custom Date
		Calendar calendar = Calendar.getInstance();
		calendar.set(1993, Calendar.JANUARY, 13, 02, 12, 00);
		Date myBirthDate = calendar.getTime();
		System.out.println(myBirthDate);// Wed Jan 13 02:12:00 IST 1993

	}

}
