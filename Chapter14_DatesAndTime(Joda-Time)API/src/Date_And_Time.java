import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/*until java 1.7version the classes present in java.util package to handle Date and Time(like
Date,Calendar,TimeZoneetc) are not upto the mark with respect to convenience and performance.

To overcome this problem in the 1.8version oracle people introduced Joda-Time API . This API
developed by joda.org and available in java in the form of java.time package.*/

public class Date_And_Time {

	public static void main(String[] args) {

		// display System Date and time.
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);// 2022-02-11
		LocalDate date2 = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println(date2);// 2022-02-11

		LocalTime time1 = LocalTime.now();
		System.out.println(time1);// 23:49:04.269885200
		LocalTime time2 = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println(time2);// 13:19:04.270885100

		System.out
				.println("Time Differnce between India and USA : " + ChronoUnit.HOURS.between(time2, time1) + " hours");// Time
																														// Differnce
																														// between
																														// India
																														// and
																														// USA
																														// :
																														// 10
																														// hours

		LocalDate date3 = LocalDate.now();
		int dd = date3.getDayOfMonth();
		int mm = date3.getMonthValue();
		int yy = date3.getYear();
		System.out.println(dd + " " + mm + " " + yy);// 14 2 2022

		LocalTime time3 = LocalTime.now();
		int s = time3.getSecond();
		int m = time3.getMinute();
		int h = time3.getHour();
		System.out.println(h + " " + m + " " + s);// 21 40 24

		/*
		 * If we want to represent both Date and Time then we should go for
		 * LocalDateTime object.
		 */
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);// 2022-02-14T21:43:18.802891400

		System.out.println("After six months:" + dt.plusMonths(6));// After six months:2022-08-14T21:45:24.756893300
		System.out.println("Before six months:" + dt.minusMonths(6));// Before six months:2021-08-14T21:45:24.756893300
	}

}
