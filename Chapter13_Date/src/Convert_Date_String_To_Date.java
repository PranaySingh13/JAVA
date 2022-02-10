import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convert_Date_String_To_Date {

	public static void main(String[] args) throws ParseException {

		String start_dt = "1993-01-13 02:12:00 PM";

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss a");// Analysing format of date in string

		// Converting String to Date Format
		Date date = (Date) formatter.parse(start_dt);

		System.out.println(date);// Wed Jan 13 14:12:00 IST 1993

		// Converting the date into the other date format
		SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
		String finalString = newFormat.format(date);
		System.out.println(finalString);// 13-01-1993 02:12:00 PM
	}

}
