package jour23;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.swing.text.DateFormatter;

public class Date {

	public static void main(String[] args) {


		LocalDate.now();
		System.out.println(LocalDate.now());//2020-05-21

		LocalTime.now();
		System.out.println(LocalTime.now());//09:36:01.360
		
		LocalDateTime.now();
		System.out.println(LocalDateTime.now());//2020-05-21T09:36:01.360
		
		LocalDate date= LocalDate.now();
		date = date.plusDays(2);
		System.out.println(date.plusDays(2));//2020-05-23
		
		LocalTime time = LocalTime.now();
		time = time.plusHours(2);
		System.out.println(time.plusHours(2));//09:39:58.020
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		dtf.format(date);
		System.out.println(dtf);//Value(DayOfMonth,2)'-'Text(MonthOfYear,SHORT)'-'Value(YearOfEra,3,19,NORMAL)
		System.out.println(dtf.format(date));//23-mai-2020
		
		DateTimeFormatter saat = DateTimeFormatter.ofPattern("hh.mm");
	    saat.format(time);
		System.out.println(saat.format(time));
	
	}

}
