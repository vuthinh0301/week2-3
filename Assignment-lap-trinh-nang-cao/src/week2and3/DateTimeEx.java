package week2and3;

import java.util.Date;

public class DateTimeEx {
	public static void main(String[] args) {
		Date date = new Date();
		for(long i = 10000; i <= 100000000000L; i*=10) {
			System.out.print("Time elapse " + i + "ms is : ");
			date.setTime(i);
			System.out.println(date.toString());
		}
	}
}
