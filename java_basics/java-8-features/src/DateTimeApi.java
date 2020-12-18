import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeApi {

	public static void main(String[] args) {

		System.out.println(compareLocalDateTime(LocalDateTime.now(), LocalDateTime.now().plusHours(4)));

		System.out.println(LocalTime.now());
		
		System.out.println(ZonedDateTime.now());
		
	}

	static Object compareLocalDateTime(LocalDateTime ld1, LocalDateTime ld2) {

		ChronoUnit chronoUnit = ChronoUnit.MILLIS;
		long duration = chronoUnit.between(ld1, ld2);

		// First All Unit are in Milli
		long secondsInMilli = 1000;
		long minutesInMilli = secondsInMilli * 60;
		long hoursInMilli = minutesInMilli * 60;
		long daysInMilli = hoursInMilli * 24;

		long days = duration / daysInMilli;
		duration = duration % daysInMilli;

		long hours = duration / hoursInMilli;
		duration = duration % hoursInMilli;

		long minutes = duration / minutesInMilli;
		duration = duration % minutesInMilli;

		long seconds = duration / secondsInMilli;

		return days + "d:" + hours + "h:" + minutes + "m:" + seconds + "s";
	}
}
