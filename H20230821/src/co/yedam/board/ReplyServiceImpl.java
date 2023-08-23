package co.yedam.board;

import java.util.ArrayList;
import java.util.List;

public class ReplyServiceImpl implements ReplyService{

	List<Reply> replyList = new ArrayList<>();
	
	public ReplyServiceImpl() {
		
	}
	
	private int getMaxNo() {
		int rpyNo = 0;
		for(int i = 0; i<replyList.size();i++) {
			if(replyList.get(i).getDatNum() > rpyNo) {
				rpyNo = replyList.get(i).getDatNum();
			}
		}
		return rpyNo +1;
	}
	
	
	@Override
	public boolean add(Reply reply) {
		reply.setDatNum(getMaxNo());

		return replyList.add(reply);
	}

	@Override
	public List<Reply> list(int page) {

		List<Reply> pageList = new ArrayList<>();
		for(int i = 0; i<replyList.size(); i++) {
			pageList.add(replyList.get(i));			
		}
		return pageList;
	}

	@Override
	public boolean del(int DatNum) {
		return false;
	}

	@Override
	public void save() {
		
	}


	@Override
	public Reply search(int BrdNo) {
		for (int i = 0; i < replyList.size(); i++) {
			if (replyList.get(i).getWonNum() == BrdNo) {
				return replyList.get(i);
				
			}
		}
		return null;
	}

}
