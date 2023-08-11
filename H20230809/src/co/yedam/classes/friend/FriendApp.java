package co.yedam.classes.friend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FriendApp {

	Friend[] friends = new Friend[10];
	Scanner scn = new Scanner(System.in);

	FriendApp() {

	}

	void addFriend() {
		System.out.println("이름 연락처 생년월일");
		String[] data = scn.nextLine().split(" ");
		// 19950304 ->

//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		//Date birth = sdf.parse(data[2]); //String -> Date
//		
//		Date birth = null;	//String -> Date
//		try {
//			birth = sdf.parse(data[2]);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

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
	}

	static void start() {

		FriendApp app = new FriendApp();
		Scanner scn = app.scn;
		boolean run = true;

		while (run) {

			System.out.println("1.등록 2.목록 9.종료");
			System.out.println("선택 >> ");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				app.addFriend();
				break;
			case 2:
				app.list();
				break;
			case 9:
				System.out.println("종료합니다. ");
				run = false;
			} // end of switch
		} // end of while
	} // end of start
} // end of class
