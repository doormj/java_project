package co.yedam.project4.member.serviceImpl;

import org.apache.ibatis.session.SqlSession;

import co.yedam.project4.common.DataSource;
import co.yedam.project4.member.map.MemberMapper;
import co.yedam.project4.member.service.MemberService;
import co.yedam.project4.member.service.MemberVO;

public class MemberServiceImpl implements MemberService{
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}
	
	
}
