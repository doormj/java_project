package co.yedam.classes.friend;

import java.util.Calendar;

public class CalendarApp {
	public void showCalendar(int year, int month){
		//Sun Mon Tue Wed Thr Fri Sat
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		
		String[] days = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
		
		for(int i=0; i<days.length;i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		
		int  space = (cal.get(Calendar.DAY_OF_WEEK)-1);
		for(int i=0; i<space; i++) {
			System.out.printf("%4s", " ");
		}
		
		for(int i=1; i<=(cal.getActualMaximum(Calendar.DATE)); i++) {
			System.out.printf("%4d", i);
			if((i+space) % 7 ==0) {
				System.out.println();
				}
			}
		System.out.println();
		}
		
		
//		System.out.println(Calendar.YEAR);
//		System.out.println(Calendar.MONTH);
//		System.out.println(cal.get(1));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		
//		cal.set(year, month, 0);
//		System.out.println(cal.get(1));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.getActualMaximum(Calendar.DATE));

}
