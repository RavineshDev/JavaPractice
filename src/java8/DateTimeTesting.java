package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeTesting {
	
	public static void main(String[] args) {
		//current date
		String date = LocalDate.now().toString();
		System.out.println(date);
		System.out.println("----------------------------");
		
		//current time
		String time = LocalTime.now().toString();
		System.out.println(time);
		System.out.println("----------------------------");
		
		//current date and time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println("----------------------------");
		
		//to print in particular format
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = dateTime.format(format);
		System.out.println(formattedDateTime);
		System.out.println("----------------------------");
		
		//print month, day and second
		int year = dateTime.getYear();
		Month month = dateTime.getMonth();
		int dayOfMonth = dateTime.getDayOfMonth();
		int dayOfYear = dateTime.getDayOfYear();
		DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
		System.out.println(dayOfMonth+", "+dayOfYear+", "+dayOfWeek);
		
		int hour = dateTime.getHour();
		int minute = dateTime.getMinute();
		int second = dateTime.getSecond();
		
		System.out.println("Year: "+year+", Month: "+month+", Day: "+dayOfWeek+", Hour: "+hour+", Minute: "+minute+", second: "+second);
		
		System.out.println("----------------------------");
		
		//print with specified date
		LocalDate manualDate = LocalDate.of(2022, 01, 13);
		System.out.println(manualDate);
		
		System.out.println("----------------------------");
		
		//String to date convertor
		String str = "2024/02/24";
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate modDate = LocalDate.parse(str, dt);
		System.out.println(modDate);
		
		System.out.println("----------------------------");
		
		//printing date with current time
		LocalDateTime prevDateWithTime = dateTime.withDayOfMonth(24).withYear(2023);
		System.out.println(prevDateWithTime);
		
		
    }
	
}
