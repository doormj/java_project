package co.yedam.qrj.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberSelelctList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
}