package co.micol.project.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.project.notice.map.ReplyMapper;
import co.micol.project.notice.service.ReplyVO;

public class MainExe {
	public static void main(String[] args) {
		SqlSession sqlSession = DataSource.getInstance().openSession(true);
		ReplyMapper map = sqlSession.getMapper(ReplyMapper.class);
		
		ReplyVO rvo = new ReplyVO();
		// rvo.setNoticeId(1);
//		rvo.setReply("댓글테스트임...");
		rvo.setReplyId(8);
		System.out.println(map.select(rvo.getReplyId()));
//		map.delete(rvo.getReplyId());
		
		List<ReplyVO> list = map.list(1);
		for(ReplyVO vo : list) {
			System.out.println(vo.toString());
		}
	}
}
