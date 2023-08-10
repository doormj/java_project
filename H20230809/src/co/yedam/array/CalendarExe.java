package co.yedam.array;

import java.util.Scanner;

public class CalendarExe {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
		System.out.println("달을 입력하시오");
		int month = Integer.parseInt(scan.nextLine());
		if(month<0 || month >12) {
			System.out.println("날짜를 잘못 입력하셨습니다.");
			break;
		}
		
		//요일
		String[] days = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
		
		for(int i=0; i<days.length;i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		
		//달력 31까지
		int  space = getFirstDay(month);
		for(int i=0; i<space; i++) {
			System.out.printf("%4s", " ");
		}
		
		for(int i=1; i<=getLastDate(month); i++) {
			System.out.printf("%4d", i);
			if((i+space) % 7 ==0) {
				System.out.println();
				}
			}
		System.out.println();
		}
	}//메소드
	
	public static int getFirstDay(int month) {
		int day = 0;
		int totalDays = 0;
		for(int i =1; i<=month -1; i++) {
			totalDays += getLastDate(i);
		}
		day = (day + totalDays) %7;
		
//		switch(month) {
//		case 1:
//		case 10:
//			day = 0;
//			break;
//		case 5:
//			day = 1;
//			break;
//		case 8:
//			day = 2;
//			break;
//		case 2:
//		case 3:
//		case 11:
//			day = 3;
//			break;
//		case 6:
//			day = 4;
//			break;
//		case 9:
//		case 12:
//			day = 5;
//			break;
//		case 4:
//		case 7:
//			day = 6;
//			break;
//		default:		
//		}
		return day;
	}
	
	public static int getLastDate(int month) {
		//1-31, 2-28, 3-31...
		int lastDate = 31;
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDate = 30;
			break;
			
		case 2:
			lastDate = 28;
		}
		return lastDate;
	}
}
