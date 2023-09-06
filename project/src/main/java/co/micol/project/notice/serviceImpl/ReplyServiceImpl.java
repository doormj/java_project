package co.micol.project.notice.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.project.common.DataSource;
import co.micol.project.notice.map.ReplyMapper;
import co.micol.project.notice.service.ReplyService;
import co.micol.project.notice.service.ReplyVO;

public class ReplyServiceImpl implements ReplyService {
		SqlSession sqlSession = DataSource.getInstance().openSession(true);
		ReplyMapper map = sqlSession.getMapper(ReplyMapper.class);

	@Override
	public boolean addReply(ReplyVO vo) {
		return map.insert(vo) == 1;
	}

	@Override
	public boolean editReply(ReplyVO vo) {
		return map.update(vo) == 1;
	}

	@Override
	public boolean delReply(int replyId) {
		return map.delete(replyId) == 1;
	}

	@Override
	public ReplyVO getReply(int replyId) {
		return map.select(replyId);
	}

	@Override
	public List<ReplyVO> listReply(int noticeId) {
		return map.list(noticeId);
	}
	
}
