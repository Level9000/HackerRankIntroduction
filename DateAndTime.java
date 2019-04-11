package Introduction;

/*
 * You are given a date. You just need to write the method, getDay, which returns the day on that date. 
 * To simplify your task, we have provided a portion of the code in the editor.
 * 
 * For example, if you are given the date August 14th, 2017, the method should return MONDAY as the day on that date.
 */

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Solution {
    public static String getDay(String day, String month, String year) {
        
        
		//String month = in.next();
		int mm = integer.valueOf(month);
		//String day = in.next();
		int dd = integer.valueOf(day);
		//String year = in.next();
		int yy = integer.valueOf(year);
		LocalDate dt = LocalDate.of(yy, mm, dd);
		return dt;
        
    }

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String month = in.next();
	    String day = in.next();
	    String year = in.next();
	    
	    System.out.println(getDay(day, month, year));
	}
}