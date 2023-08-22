package co.yedam.board;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardServiceImpl implements BoardService {

	List<Board> boardList = new ArrayList<>();

	public BoardServiceImpl() {
		init();
	}

	private void init() {
		try {
			FileInputStream fis = new FileInputStream("c:/Temp/board.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			boardList = (List<Board>) ois.readObject();

			ois.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int getMaxNo() {
		int brdNo = 0;
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getBrdNo() > brdNo) {
				brdNo = boardList.get(i).getBrdNo();
			}
		}
		return brdNo + 1;
	}

	@Override
	public boolean add(Board board) {
		board.setBrdNo(getMaxNo());
		board.setWriteDate(new Date());
		board.setUpdateDate(new Date());

		return boardList.add(board);
	}

	@Override
	public List<Board> list(int page) {
		int start = (page - 1) * 5;
		int end = page * 5;
		List<Board> pageList = new ArrayList<>();
		for (int i = 0; i < boardList.size(); i++) {
			if (i >= start && i < end)
				pageList.add(boardList.get(i));
		}
		return pageList;
	}

	@Override
	public boolean modify(Board board) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getBrdNo() == board.getBrdNo()) {
				boardList.get(i).setBrdContent(board.getBrdContent());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean remove(int BrdNo) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getBrdNo() == BrdNo) {
				boardList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public Board search(int BrdNo) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getBrdNo() == BrdNo) {
				return boardList.get(i);
			}
		}
		return null;
	}

	@Override
	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Temp/board.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(boardList);
			oos.flush();oos.close();
			fos.flush();fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getTotal() {
		return boardList.size();
	}
}
