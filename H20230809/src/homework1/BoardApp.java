package homework1;

import java.util.Scanner;

public class BoardApp {
	
	private Board[] boards = new Board[10];
	private Scanner scan = new Scanner(System.in);
	
	public BoardApp(){
		
	}
	
	void addBoard() {
		System.out.println("제목 내용 작성자 순으로 입력");
		String data[] = scan.nextLine().split(" ");
		
		Board board = new Board(data[0], data[1], data[2]);
		
		for(int i = 0; i<boards.length; i++) {
			if(boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}
	
	
	void list() {
		
	}
	
	void search() {
		
	}
	
	
	void modify() {
		
	}
	
	void del() {
		
	}
	
	public void start() {
		BoardApp app = new BoardApp();
		Scanner scan = app.scan;
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2.목록 3.상세 4.수정 4.삭제 6.종료");
			System.out.println("선택>> ");
			
			int menu = Integer.parseInt(scan.nextLine());
			
			switch(menu) {
			case 1:
				app.addBoard();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("종료합니다. ");
				run = false;
			}
		}
	}
}
