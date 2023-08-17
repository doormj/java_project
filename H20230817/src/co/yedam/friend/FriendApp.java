package co.yedam.friend;

import java.util.Scanner;

public class FriendApp {
	//	배열 > 컬랙션 > 파일 > DB
	Friend[] friends = new Friend[10];
	Scanner scan = new Scanner(System.in);

	//컨트롤
	public void start() {
		boolean run = true;
		int menu = -1;
		
		while(run) {
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("선택>> ");
			
			menu = scan.nextInt(); // 3엔터
			scan.nextLine();
			
			switch(menu) {
			case 1:
				addFriend();
				break;
			case 2:
				search();
				break;
			case 3:
				modify();
				break;
			case 4:
				delete();
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
				default:
					System.out.println("잘못된 메뉴입니다");
			}
		}
	}
	
	//
	private String printString(String msg) {
		System.out.println(msg + ">> ");
		return scan.nextLine();
	}
	
	
	//Create
	private void addFriend() {
		System.out.println("1.학교 2.회사 3.기타");
		System.out.println("선택>> ");
		int subMenu = scan.nextInt();
		scan.nextLine();
		
		Friend friend = null;
		String name = printString("이름입력");
		String phone = printString("연락처입력");
		
		if(subMenu == 1) {
			String univ = printString("학교입력");
			String major = printString("전공입력");
			
			friend = new UnivFriend(name, phone, univ, major);
			
		} else if (subMenu == 2) {
			String comp = printString("회사입력");
			String dept = printString("부서입력");
			
			friend = new CompFriend(name, phone, comp, dept);
			
		} else {
			
			friend = new Friend(name, phone);
		}
		
		//
		for(int i=0; i<friends.length;i++) {
			if(friends[i] == null) {
				friends[i] = friend; // F/C/U
				break;
			}
		}
	}
	
	//Read 이름 -> 해당 이름 조회. 입력값 없으면 -> 전체
	private void search() {
		System.out.println("이름을 입력해 조회하거나 전체조회는 엔터를 누르시오");
		String name = scan.nextLine();
		
		for(int i=0; i<friends.length;i++) {
			if(friends[i] != null && name.equals("")) {
				System.out.println(friends[i].showInfo());
			} else if (friends[i] != null && friends[i].getName().equals(name)){
				System.out.println(friends[i].showInfo());
				break;
			}
		}
	}

	//Update : 이름 넣으면 연락처 수정.
	private void modify() {
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("수정 할 연락처 : ");
		String phone = scan.nextLine();
		
		for(int i=0; i<friends.length;i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				friends[i].setPhone(phone);
				break;
			}
		}
	}
	
	//Delete  : 이름
	private void delete() {
		System.out.println("삭제할 이름: ");
		String name = scan.nextLine();
		for(int i=0; i<friends.length;i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			}
		}
	}
}
