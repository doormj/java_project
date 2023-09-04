package co.yedam.qrj.memeber.map;

import java.util.List;

import co.yedam.qrj.member.service.MemberVO;

public interface MemberMapper {
	List<MemberVO> memberSelelctList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
}
