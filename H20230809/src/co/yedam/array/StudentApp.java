package co.yedam.array;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int idx = 0;
		
		// 1.등록 2.조회 3.목록 4.종료
	
		
		while (run) {
			System.out.println("1.등록 2.조회 3.목록 4.종료");
			System.out.print("선택>> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1:
				System.out.println("이름과 성적을 입력하세요.");
				//scanner로 이름, 점수 입력 받아
				// Student s1부터 idx 첫번째 위치에 등록, idx++로 증가시켜
				// 주번째 위치 등록~
				//둘다 입력
				String name = scn.nextLine();
				
				int score = Integer.parseInt(scn.nextLine());
				
				
				
				
			case 2:
				//이름 입력 시 점수 출력
			case 3:
				//이름과 점수 둘다 출력
			case 4:
				//종료
			}
		}
		System.out.println("end");
		// 등록 : 이름, 점수 Scanner
		// 조회 : 이름 넣으면 점수를 볼 수 있게
		// 목록 : 이름, 성적 출력
	}
}
