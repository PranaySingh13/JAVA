import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Java8_LocalDate_and_LocalDateTime {

	public static void main(String[] args) {
		/*
		 * Date and LocalDate objects cannot be exactly converted between each other
		 * since a Date object represents both a specific day and time, while a
		 * LocalDate object does not contain time or timezone information. However, it
		 * can be useful to convert between the two if you only care about the actual
		 * date information and not the time information
		 */

		// Creates a LocalDate

		// Create a default date
		LocalDate lDate = LocalDate.now();
		System.out.println(lDate);// 2022-02-02

		// Create a date from values
		lDate = LocalDate.of(2021, 04, 02);
		System.out.println(lDate);// 2021-04-02

		// create a date from string
		lDate = LocalDate.parse("2017-12-15");
		System.out.println(lDate);// 2017-12-15

		// creates a date from zone
		lDate = LocalDate.now(ZoneId.systemDefault());
		System.out.println(lDate);// 2022-02-02

		// Creates a LocalDateTime

		// Create a default date time
		LocalDateTime lDateTime = LocalDateTime.now();
		System.out.println(lDateTime);// 2022-02-02T23:41:35.271748600

		// Creates a date time from values
		lDateTime = LocalDateTime.of(2017, 12, 15, 11, 30);
		System.out.println(lDateTime);// 2017-12-15T11:30

		// create a date time from string
		lDateTime = LocalDateTime.parse("2021-10-15T10:30:30");
		System.out.println(lDateTime);// 2021-10-15T10:30:30

		// create a date time from zone
		lDateTime = LocalDateTime.now(ZoneId.systemDefault());
		System.out.println(lDateTime);// 2022-02-02T23:45:16.618208800

		// LocalDate to Date and vice-versa
		Date date = Date.from(Instant.now());
		ZoneId defaultZoneId = ZoneId.systemDefault();

		// Date to LocalDate
		LocalDate localDate = date.toInstant().atZone(defaultZoneId).toLocalDate();
		System.out.println(date);// Wed Feb 02 23:50:15 IST 2022
		System.out.println(localDate);// 2022-02-02

		// LocalDate to Date
		Date convertedDate = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
		System.out.println(convertedDate);// Wed Feb 02 00:00:00 IST 2022

		// LocalDateTime to Date and vice-versa

		// Date to LocalDateTime
		LocalDateTime localDateTime = date.toInstant().atZone(defaultZoneId).toLocalDateTime();
		System.out.println(localDateTime);// 2022-02-02T23:54:47.889

		// LocalDateTime to Date
		Date convertedDateTime = Date.from(localDateTime.atZone(defaultZoneId).toInstant());
		System.out.println(convertedDateTime);//Wed Feb 02 23:56:25 IST 2022
	}

}
