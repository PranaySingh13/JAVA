import java.text.SimpleDateFormat;
import java.util.Date;

public class Converting_Date_To_String_Format {

	public static void main(String[] args) {
		/*
		 * format() from SimpleDateFormat class helps to convert a Date object into
		 * certain format String object by using the supplied pattern string.
		 */

		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");// pattern is specified here
		System.out.println(dateFormat.format(today));// 04-Feb-22

		// Patterns can be applied again by using applyPattern()
		dateFormat.applyPattern("dd-MM-yyyy");
		System.out.println(dateFormat.format(today));// 04-02-2022

		dateFormat.applyPattern("dd-MM-yyyy hh:mm:ss E");
		System.out.println(dateFormat.format(today));// 04-02-2022 09:57:12 Fri

		/*
		 * Note: Here mm (small letter m) denotes minutes and MM (capital M) denotes
		 * month. Pay careful attention when formatting years: capital "Y" (Y) indicates
		 * the "week in the year" while lower-case "y" (y) indicates the year.
		 */
	}

}
