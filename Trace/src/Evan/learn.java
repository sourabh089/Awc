package Evan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class learn {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		String min = dtf.format(now);
		int minute = Integer.parseInt(min);

		System.out.println("minute " + now);

	}
}
