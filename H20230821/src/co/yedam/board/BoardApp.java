package co.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardApp {
	String logId;
	int brdNo;
	Scanner scn = new Scanner(System.in);
	BoardService service = new BoardServiceImpl();
	UserService uservice = new UserServiceImpl();
	ReplyService rservice = new ReplyServiceImpl();

	public void start() {

		// id /pw
		while (true) {
			String id = printString("id");
			String pw = printString("pass");
			User user = new User();
			user.setUserId(id);
			user.setUserPw(pw);

			user = uservice.checkLogin(user);

			if (user != null) {
				System.out.println(user.getUserName() + "님 환영합니다.");
				logId = id;
				break;
			}
			System.out.println("로그인 실패..");
		}

		boolean run = true;
		while (run) {
			System.out.println("1.글등록 2.목록 3.수정 4.삭제 5.상세조회 6.댓글작성 9.종료");
			System.out.print("선택>> ");

			int menu = scn.nextInt();
			scn.nextLine();

			switch (menu) {
			case 1: // 등록
				register();
				break;
			case 2: // 목록
				boardList();
				break;
			case 3: // 수정
				modify();
				break;
			case 4: // 삭제
				del();
				break;
			case 5: // 상세조회
				search();
				break;
			case 6:
				datAdd();
				break;
			case 9:
				service.save();
				System.out.println("종료");
				run = false;
			}
		}
		System.out.println("end of prog.");
	}// end of start.

	private String printString(String msg) {
		System.out.println(msg + ">> ");
		return scn.nextLine();
	}

	void register() {
		String title = printString("제목입력");
		String content = printString("내용입력");
		String writer = logId;
		Board board = new Board(title, content, writer);

		if (service.add(board)) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
	}

	void boardList() {
		int page = 1;
		while (true) {
			List<Board> list = service.list(page);
			for (Board b : list) {
				System.out.println(b.listInfo());
			}
			// 4>1page, 9>2page, 19>4page
			int totalCnt = service.getTotal();
			int lastPage = (int) Math.ceil(totalCnt / 5.0);
			for (int i = 1; i <= lastPage; i++) {
				if (page == i) {
					System.out.printf("[" + "%d" + "]", i);
				} else if (page != i) {
					System.out.printf(" %d ", i);
				}
			}
			System.out.println();
			System.out.println("조회페이지 입력>>(exit: 9)");
			page = scn.nextInt();
			if (page == 9) {
				break;
			}
		}
	}

	void modify() {
		String brdNo = printString("번호입력");
		if (service.getResponseUser(Integer.parseInt(brdNo)).equals(logId)) {
			System.out.println("권한 없음");
			return;
		}
		String content = printString("내용입력");
		Board brd = new Board();
		brd.setBrdNo(Integer.parseInt(brdNo));
		brd.setBrdContent(content);

		if (service.modify(brd)) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
	}

	void del() {
		String brdNo = printString("번호입력");
		if (service.remove(Integer.parseInt(brdNo))) {
			System.out.println("삭제 성공");
		}
	}

	void search() {
		String brdNo = printString("번호입력");
		Board result = service.search(Integer.parseInt(brdNo));
		Reply result1 = rservice.search(Integer.parseInt(brdNo));
		if (result == null) {
			System.out.println("해당 글번호가 없습니다.");
		} else {
			System.out.println(result.showInfo());
			if(result1 != null) {
				int page = 1;
				while (true) {
					List<Reply> list = rservice.list(page);
					for (Reply b : list) {
						System.out.println(b.DatInfo());
					}
					break;
				}
			}
		}
	}
		
	void datAdd() {
//		String datNum = printString("댓글 번호 입력");
//		String boardWriter = brdNo;
		
		System.out.println("댓글 작성할 글 번호:");
		int WonNum = scn.nextInt(); scn.nextLine();
		String dat = printString("댓글 내용: ");
		String datWiter = logId;
		Reply reply = new Reply(WonNum, dat, datWiter);
		
		if(rservice.add(reply)) {
			System.out.println("댓글 작성 성공");
		} else {
			System.out.println("댓글 작성 실패");
		}	
	}
}

