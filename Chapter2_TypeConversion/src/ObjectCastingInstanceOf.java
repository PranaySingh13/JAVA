import java.util.Calendar;
import java.util.Date;

public class ObjectCastingInstanceOf {

	public static void main(String[] args) {

		Object obj = Calendar.getInstance();
		long time = 0;

		if (obj instanceof Calendar) {
			time = ((Calendar) obj).getTimeInMillis();
			System.out.println(time);
		}

		if (obj instanceof Date) {
			time = ((Calendar) obj).getTimeInMillis();
			System.out.println(time);// This line will never be reached, obj is not a Date type.
		}

	}

}
