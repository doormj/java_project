package co.yedam.friend;

public class FriendExe {
	public static void main(String[] args) {
		// name, phone
		// 배열선언[5].
		Friend[] friends = new Friend[5];
		
//		Friend f = new Friend();	//기본생성자 만들어야 함
//		f.setName("홍길동");
//		f.setPhone("010-1111-1111");
//		friends[0] = f;
		
//		friends[0] = new Friend("홍길동", "010-1111-1111");	//배열에 직접 삽입
//		friends[1] = new Friend("김길동", "010-2222-2222");
//		friends[2] = new Friend("박길동", "010-3333-3333");
		
		for (int i = 0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = new Friend("홍길동", "010-1111-1111");
				break;
			}
		}
		
		String name = "홍길동";
		String phone = "010-9999-9999";
		
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
//				System.out.println(friends[i].showInfo());
				friends[i].setPhone(phone);
			}
		}
		
		
	}
}
