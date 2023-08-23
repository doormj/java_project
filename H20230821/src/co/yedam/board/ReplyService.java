package co.yedam.board;

import java.util.List;

public interface ReplyService {

	//등록
	public boolean add(Reply reply);
	
	//목록
	public List<Reply> list(int page);
	
	//댓글(상세)
	public Reply search(int BrdNo);
	
	//삭제
	public boolean del(int DatNum);
	
	//종료(저장)
	public void save();
}
