package co.yedam.interfaces;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		
		Dao dao = new OracleDao();	//new MysqlDao();
		
		String str;
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int menu = -1;
		
		while(run) {
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("선택>> ");
			
			menu = scan.nextInt(); // 3엔터
			scan.nextLine();
			
			switch(menu) {
			case 1:
				dao.insert();
				break;
			case 2:
				dao.select();
				break;
			case 3:
				dao.update();
				break;
			case 4:
				dao.delete();
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
				default:
					System.out.println("잘못된 메뉴입니다");
			}	// end of menu(switch)
		}	// end of wihle
	}	// end of main
}	// end of class
