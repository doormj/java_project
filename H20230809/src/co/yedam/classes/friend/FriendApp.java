package co.yedam.classes.friend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


//접근지시자(access modifier)
public class FriendApp {

	private Friend[] friends = new Friend[10];
	private Scanner scn = new Scanner(System.in);

	public FriendApp() {

	}

	void addFriend() {
		System.out.println("이름 연락처 생년월일 순으로 입력");
		String[] data = scn.nextLine().split(" ");
		
		Friend friend = new Friend(data[0], data[1], data[2]); // data[2] -> birth

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	} // addFriend

	void list() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].toString());
			}
		}
	} // list
	
	void finefriend() { //조회
		System.out.println("이름 : ");
		String name = scn.nextLine();
		for(int i = 0; i< friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				friends[i].showInfo();
			}
		}
	}
	
	void editfriend() { //수정
		System.out.println("이름 : ");
		String name = scn.nextLine();
		System.out.println("연락처 : ");
		String phone = scn.nextLine();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i].setPhone(phone);
				break; // for
				}
			}
		}

	void delfriend() {
		System.out.println("이름 : ");
		String name = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null; // 삭제
				break;
				}
			}
	}
	
	public void start() {	//private public default //public - 다른 패키지에서도 접근 가능

		FriendApp app = new FriendApp();
		Scanner scn = app.scn;
		boolean run = true;

		while (run) {

			System.out.println("1.등록 2.목록 3.조회(이름) 4.수정(연락처) 5.삭제 9.종료");
			System.out.println("선택 >> "); // findfriend / editfriend / delfriend

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case Menu.ADD:
				app.addFriend();
				break;
			case Menu.LIST:
				app.list();
				break;
			case Menu.SEARCH:
				app.finefriend();
				break;
			case Menu.EDIT:
				app.editfriend();
				break;
			case Menu.DEL:
				app.delfriend();
				break;
			case Menu.EXIT:
				System.out.println("종료합니다. ");
				run = false;
			} // end of switch
		} // end of while
	} // end of start
} // end of class
