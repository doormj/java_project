package co.yedam.operator;

import java.util.Scanner;

//은행 App

public class OperatiorExe2 {
	public static void main(String[] args) {
		
		// java.util.Scanner scn = new java.util.Scanner(System.in); import 사용 안할 시
		
		Scanner scn = new Scanner(System.in);
		int balance = 0; // 10만원 이상 불가, -금액 불가,
		
		
		boolean run = true;
		int ip = 50000;
		
		while(run) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.print("선택 >> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			if(menu ==1) {
				System.out.println("입금액 입력 >> ");
				Scanner scan = new Scanner(System.in);
				String str1 = scan.nextLine();
				
				int hap = Integer.parseInt(str1);
				int sum = hap + ip;
				if(sum <100000 && sum > 0) {
					System.out.println("예금액 : " + sum);
				}
				else {
					System.out.println("금액 초과 입니다." );
					break;
				}//코드 작성.
			} else if(menu == 2) {
				System.out.println("출금액 입력 >> ");
				Scanner scan = new Scanner(System.in);
				String str2 = scan.nextLine();
				
				int minus = Integer.parseInt(str2);
				int gul = ip - minus;
				if(gul >= 0 && gul <=100000) {
					System.out.println("출금액 : " + minus);
				}
				else {
					System.out.println("잔액이 부족합니다." );
					break;
				}
			} else if (menu == 3) {
				System.out.printf("잔액 : %d \n",ip);
			} else if (menu ==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("end of prog");
	}

}
