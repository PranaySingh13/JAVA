import java.time.ZoneId;
import java.time.ZonedDateTime;

//ZoneId object can be used to represent Zone.
public class Zone {

	public static void main(String[] args) {
		ZoneId zone1 = ZoneId.systemDefault();
		System.out.println(zone1);// Asia/Calcutta

		// We can create ZoneId for a particular zone as follows
		ZoneId zone2 = ZoneId.of("America/New_York");
		System.out.println(zone2);// America/New_York
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);// 2022-02-14T21:51:08.040724+05:30[Asia/Calcutta]

	}

}
