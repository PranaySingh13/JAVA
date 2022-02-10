import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZones_in_Date {

	public static void main(String[] args) {
		/*
		 * A java.util.Date object does not have a concept of time zone.
		 * 
		 * There is no way to set a timezone for a Date
		 * 
		 * There is no way to change the timezone of a Date object
		 * 
		 * A Date object created with the new Date() default constructor will be
		 * Initialized with the current time in the system default timezone
		 * 
		 * However, it is possible to display the date represented by the point in time
		 * described by the Date object in a different time zone using e.g.
		 * java.text.SimpleDateFormat:
		 */

		// Print Default Timezone
		System.out.println(TimeZone.getDefault().getDisplayName());// India Standard Time

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");// note: time zone not in format!

		// print date in the original time zone
		System.out.println(sdf.format(date));// 2022-02-10 11:16:38 PM

		// Current Time in America
		sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));

		System.out.println(sdf.format(date));// 2022-02-10 12:46:38 PM
	}

}
