package Self_try;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class currentDate_and_time {
	public static void main(String [] args) {
		
		//// Current date
		Date d = new Date();
		System.out.println(d);
		
		//Formatting date
		DateFormat df = new SimpleDateFormat("YYYY/MM/dd");
		String currentD = df.format(d);
		System.out.println(currentD);
		
		DateFormat df2 = new SimpleDateFormat("dd/MM/YYYY");
		String currentD2 = df2.format(d);
		System.out.println(currentD2);
		
		System.out.println();
		
		// Current time
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		// Formatting time
		DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");
		String t2=t.format(f);
		System.out.println(t2);
	}
}
