import java.time.LocalTime;

public class LocalTimeUse {

	public static void main(String[] args) {
		/*
		 * To use just the time part of a Date use LocalTime.
		 * 
		 * LocalTime also has a built in toString method that displays the format very
		 * nicely.
		 */
		LocalTime time = LocalTime.now();
		System.out.println(time);// 23:49:40.973380

		// The time of midnight at the start of the day, '00:00'.
		time = LocalTime.MIDNIGHT;
		System.out.println(time);// 00:00

		// The time of noon in the middle of the day, '12:00'.
		time = LocalTime.NOON;
		System.out.println(time);// 12:00

		time = LocalTime.of(13, 12, 45, 5623526);
		System.out.println(time);// 13:12:45.005623526

		/*
		 * We can also get, add and subtract hours, minutes, seconds, and nanoseconds
		 * from the LocalTime object i.e.
		 */

		System.out.println(time.plusHours(1));// 14:12:45.005623526

		System.out.println(time.minusHours(1));// 12:12:45.005623526

		System.out.println(time.plusMinutes(8));// 13:20:45.005623526

		System.out.println(time.minusMinutes(8));// 13:04:45.005623526

		System.out.println(time.plusSeconds(5));// 13:12:50.005623526

		System.out.println(time.minusSeconds(5));// 13:12:45.005623526

		System.out.println(time.getHour());// 13

		System.out.println(time.getMinute());// 12

		System.out.println(time.getSecond());// 45
	}

}
