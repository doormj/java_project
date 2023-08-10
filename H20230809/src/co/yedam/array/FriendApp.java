package co.yedam.array;

import java.util.Scanner;

public class FriendApp {

	static Friend[] friends = new Friend[10]; // 변수 friends 가 다른 static에서 사용가능하게
	static Scanner scn = new Scanner(System.in);
	static String name;
	static String phone;
	static Gender gender;
	
	// boolean checkFriend(String name) {}
	public static boolean checkFriend(String name) { // 리턴값 boolean
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].name.equals(name)) {
				return true;
			}
		}
		return false;
	}

	public static void init() {
		// 초기값
		for (int i = 0; i < friends.length; i++) {
			Friend f = new Friend();
			f.name = "test" + i;
			f.phone = "010-3245-456" + i;
			f.gender = i % 2 == 0 ? Gender.MEN : Gender.WOMEN;

			friends[i] = f;
		}
	}
	
	public static void printMenu(){
		System.out.println("1.추가 2.수정 3.삭제 4.조회 5.목록 6.종료");
		System.out.print("선택>> ");
	}
		
	public static void add(){
		System.out.println("이름 : ");
		name = scn.nextLine();
		System.out.println("연락처 : ");
		phone = scn.nextLine();
		System.out.println("성별(1:남자, 2:여자) : ");
		gender = null;
		int choice = Integer.parseInt(scn.nextLine());
		if (choice == 1) {
			gender = Gender.MEN;
		} else {
			gender = Gender.WOMEN;
		}
		Friend fnd = new Friend();
		fnd.name = name;
		fnd.phone = phone;
		fnd.gender = gender;

		boolean nullExist = false;
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = fnd;
				nullExist = true;
				break;
			}
		}
		if (nullExist) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 공간이 부족합니다.");
		}
		System.out.println("OK");
	}
	public static void modify() {
	System.out.println("이름 : ");
	name = scn.nextLine();
	if (!checkFriend(name)) {
		System.out.println("찾는 이름이 없습니다.");
		return; //메소드의 실행 중지
	}
	System.out.println("연락처 : ");
	phone = scn.nextLine();

	for (int i = 0; i < friends.length; i++) {
		if (friends[i] != null && friends[i].name.equals(name)) {
			friends[i].phone = phone;
			break; // for
			}
		}
	}
	
	public static void del() {
	System.out.println("이름 : ");
	name = scn.nextLine();
	if (!checkFriend(name)) {
		System.out.println("찾는 이름이 없습니다.");
		return;
	}
	for (int i = 0; i < friends.length; i++) {
		if (friends[i] != null && friends[i].name.equals(name)) {
			friends[i] = null; // 삭제
			break;
			}
		}
	}
	
	public static void search() {
	System.out.println("이름 : ");
	name = scn.nextLine();
	if (!checkFriend(name)) {
		System.out.println("찾는 이름이 없습니다.");
		return;
	}
	for (int i = 0; i < friends.length; i++) {
		if (friends[i] != null && friends[i].name.equals(name)) {
			friends[i].showInfo(); // Friend class의 메소드 가져옴
			}
		}
	}
	
	public static void list() {
	for (int i = 0; i < friends.length; i++) {
		if (friends[i] != null) {
			friends[i].briefInfo(); // Friend class의 메소드 가져옴
			}
		}
	}
		// 추가, 수정, 삭제, 조회, 목록
	
	public static void main(String[] args) { // 리턴값 X
		init();	//초기값 호출
		
		boolean run = true;
		
		while (run) {
			printMenu();	//메뉴 호출
			int menu = Integer.parseInt(scn.nextLine());
			
			switch (menu) {
			case 1: // 추가
				add();
				break;
			case 2: // 수정
				modify();
				break; // switch
			case 3: // 삭제
				del();
				break; // switch
			case 4: // 조회 이름, 연락처, 성별
				search();
				break;
			case 5: // 목록 이름, 연락처
				list();
				break;
			case 6: // 종료
				System.out.println("종료합니다. ");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하시오.");
			}
		}
	}
}
