package co.yedam;

import java.util.Scanner;


public class Ex05 {
	
	static Scanner scan = new Scanner(System.in);
	static Friend[] friends = new Friend[10];
	
	public static void main(String[] args) {
		
		boolean run = true;

		while(run) {
			System.out.println("1.등록 2.목록 3.전화번호수정 4.삭제 5.종료");
			int menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1:
				register();
				break;
			case 2:
				 list();
				break;
			case 3:
				modify();
				break;
			case 4:
				remove();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default :
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}
	}
	
	static void register() { //add
		
		System.out.println("이름 전화번호 생년월일 키 순으로 입력하시오.");
		String[] data = scan.nextLine().split(" ");
		
		Friend friend = new Friend(data[0], data[1], data[2], data[3]);
		
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}
	
	static void list() { //list
		System.out.println("친구 정보 목록 :");
		
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] != null) {
				System.out.println(friends[i].showInfo());
			}
		}
	}
	
	static void modify() { //modify
		System.out.println("수정할 사람의 이름 : ");
		String name = scan.nextLine();
		System.out.println("바꿀 전화 번호 : ");
		String phone = scan.nextLine();
		
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				friends[i].setPhone(phone);
				break;
			}
		}
	}
	
	static void remove() { //delete
		System.out.println("삭제할 사람의 이름 : ");
		String name = scan.nextLine();
		
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			}
		}
	}
}
