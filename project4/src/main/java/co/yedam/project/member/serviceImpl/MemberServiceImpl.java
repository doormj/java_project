package co.yedam.project.member.serviceImpl;

import java.lang.reflect.Member;

import org.apache.ibatis.session.SqlSession;

import co.yedam.project.common.DataSource;
import co.yedam.project.member.map.MemberMapper;

public class MemberServiceImpl {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(Member.class);
	
	
}
