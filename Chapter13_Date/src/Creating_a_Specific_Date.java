import java.util.Calendar;
import java.util.Date;

public class Creating_a_Specific_Date {

	public static void main(String[] args) {
		/*
		 * To create a new date, you will need a Calendar instance. From there you can
		 * set the Calendar instance to the date that you need.
		 */
		Calendar c = Calendar.getInstance();
		c.set(1993, 01, 13, 14, 12, 00);
		Date d = c.getTime();
		System.out.println(d);// Sat Feb 13 14:12:00 IST 1993

	}

}
