package co.yedam.friend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FriendApp {
	// 추가, 수정, 삭제, 목록:
	
	Map<String, String> userList = new HashMap<>();

	List<Friend> friends = new ArrayList<Friend>();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Scanner scn = new Scanner(System.in);

	//생성자,
	public FriendApp() {
		userList.put("user1", "1234");
		userList.put("user2", "5678");
		userList.put("user3", "9087");
	}
	
	private boolean userCheck() {
		
		System.out.println("id>> ");
		String id = scn.nextLine();
		System.out.println("pw>> ");
		String pw = scn.nextLine();	
		
//		Set<String> keyset = userList.keySet();
//		for(String key : keyset) {
//			String value = userList.get(key);
//			
//			if(id.equals(key) && pw.equals(value) {
//				return true;
//			}
//		}
//		return false;
		
		if(userList.containsKey(id)) {
			if(userList.get(id).equals(pw)) {
				return true;
			}
		}
		return false;
	}
	
	
	public void start() {
		boolean run = userCheck();
		
		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.목록 5.종료");
			System.out.println("선택 >> ");
			int menu = scn.nextInt();
			scn.nextLine();

			switch (menu) {
			case 1:
				add();
				break;
			case 2:
				edit();
				break;
			case 3:
				del();
				break;
			case 4:
				list();
				break;
			case 5:
				System.out.println("종료");
				run = false;
			}
		}
	}

	private void add() {

		System.out.println("이름 : ");
		String name = scn.nextLine();

		System.out.println("연락처 : ");
		String phone = scn.nextLine();

		System.out.println("생일(yyyy-MM-dd): ");
		String str = scn.nextLine();
		try {
			Date newdate = sdf.parse(str);
			friends.add(new Friend(name, phone, newdate));
//			Friend friend = new Friend(name, phone, sdf.parse(str));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private void edit() {
		System.out.println("수정할 이름을 입력하시오 : ");
		String name = scn.nextLine();
		System.out.println("수정할 번호를 입력하시오 : ");
		String phone = scn.nextLine();
//		String name = printString("이름");
//		String phone = printString("이름");
		
		for(int i=0; i<friends.size();i++) {
			if(friends.get(i).getName().equals(name)) {
				friends.get(i).setPhone(phone);
			}
		}
	}

	private void del() {
		System.out.println("삭제할 이름을 입력하시오 : ");
		String name = scn.nextLine();
		for(int i=0; i<friends.size();i++) {
			if(friends.get(i).getName().equals(name)) {
				friends.remove(i);
			}
		}
	}

	private void list() {
		for (Friend mem : friends) {
			System.out.println(mem);
		}
	}
}
