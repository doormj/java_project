package co.yedam.array;

import java.util.Scanner;

class Member{
	String name;
	int socre;
}

public class ScoreApp {
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		Scanner scan = new Scanner(System.in);
		double max = 0;
		double avg = 0;
		double hap = 0;		
//		String[] data = scan.nextLine().split(" ");
//		System.out.println(data[0]);
//		System.out.println(data[1]);
		
		int[] scores = null;
		int idx=0;
		
		System.out.println("-------------------------------------------");
		System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
		System.out.println("-------------------------------------------");
		System.out.println("선택 : ");
		
		while(run) {
			int menu = Integer.parseInt(scan.nextLine());
			
			switch(menu) {
			case 1:
				System.out.println("학생수 : ");
				int m = Integer.parseInt(scan.nextLine());
				scores = new int[m];
				System.out.println("학생수 : "+ m);
				System.out.println("다음 메뉴 선택");
				break;
			case 2:	
				for(int i =0; i <scores.length; i++) {
					System.out.println("점수 입력 : ");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
				System.out.println("다음 메뉴 선택");
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
						System.out.printf("%d \n", scores[i]);
					}
				System.out.println("다음 메뉴 선택");
				break;
			case 4:
				for(int i=0; i<scores.length; i++) {
					hap += scores[i];
					avg = hap/3;
					if(scores[i] > max){
						max = scores[i];
					}
				}
				System.out.printf("최고 점수 : %.1f\n평균 점수 : %.1f\n", max, avg);
				System.out.println("다음 메뉴 선택");
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
