package co.yedam.classes.friend;

public class FriendMain {
	public static void main(String[] args) {
		//		System.out.println(args[0]+args[1] + args.length);
		
		// FriendApp.start();				//정적 메소드		(static 일시)
		FriendApp app = new FriendApp();	//인스턴스 일 경우
		app.start();						//인스턴스 일 경우 	(static 아닐 시)
		
	}
}

// 
