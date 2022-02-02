import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Util_To_Sql_Date_Conversion {

	public static void main(String[] args) {
		/*
		 * java.util.Date to java.sql.Date conversion is usually necessary when a Date
		 * object needs to be written in a database.
		 * 
		 * java.sql.Date is a wrapper around millisecond value and is used by JDBC to
		 * identify an SQL DATE type
		 * 
		 * java.util.Date has both date and time information, whereas java.sql.Date only
		 * has date information
		 */

		java.util.Date utilDate = new java.util.Date();

		System.out.println(utilDate);// Wed Feb 02 21:42:06 IST 2022

		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

		System.out.println(sqlDate);// 2022-02-02

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");

		System.out.println(sdf.format(utilDate));// 02/02/2022 - 09:47:18

		// A basic date output
		System.out.println(new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(Calendar.getInstance().getTime()));//2022/02/02 09:54:07
	}

}
