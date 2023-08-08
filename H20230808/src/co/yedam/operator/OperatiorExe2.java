package co.yedam.operator;

import java.util.Scanner;

//은행 App

public class OperatiorExe2 {
	public static void main(String[] args) {
		
		// java.util.Scanner scn = new java.util.Scanner(System.in); import 사용 안할 시
		Scanner scn = new Scanner(System.in);
		int balance = 0; // 10만원 이상 불가, -금액 불가,
		
		boolean run = true;
		int sum =0;
		
		while(run) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.print("선택 >> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			if(menu ==1) {
				System.out.println("입금액 입력 >> ");
				int y1 = System.in.read();
				int hap = y1 + sum;
				if(hap <100000) {
					System.out.println("예금액 : " + hap);
				}
				else {
					System.out.println("금액 초과 입니다." );
					break;
				}
				
				//코드 작성.
			} else if(menu == 2) {
				System.out.println("출금액 입력 >> ");
				//코드 작성
			} else if (menu == 3) {
				//코드 작성
			} else if (menu ==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("end of prog");
	}

}
