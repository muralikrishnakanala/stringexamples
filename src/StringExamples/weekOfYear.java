package StringExamples;

import java.util.Calendar;
import java.util.Date;

public class weekOfYear {
	public static void main(String[] args) {
		Date d1= new Date();
		Calendar c1= Calendar.getInstance();
		c1.setTime(d1);
		System.out.println("today  is "+ c1.WEEK_OF_YEAR +"week of the year");
		System.out.println("today is"  +   c1.DAY_OF_MONTH   +"month of the year");
		System.out.println("todat is"  +   c1.WEEK_OF_MONTH  +" week of the month");
	}
		
		
	
}
