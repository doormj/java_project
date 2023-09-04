package co.yedam.project4.member.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.project4.common.ViewResolve;
import co.yedam.project4.member.service.MemberService;
import co.yedam.project4.member.service.MemberVO;
import co.yedam.project4.member.serviceImpl.MemberServiceImpl;



@WebServlet("/logincontroller.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		// Service 생성
		vo.setMemberId(request.getParameter("memberId"));
		vo.setMemeberPassword(request.getParameter("memberPassword"));
		// MemberVO
		
		// vo 넘어온 값 담고
		String id = request.getParameter("memberId");
		String password = request.getParameter("memberPassword");
		// dao 호출
		vo = dao.memberSelect(vo);
		
		// 결과 처리
		if (vo != null) {
			request.setAttribute("message","로그인 성공");
		} else {
			request.setAttribute("message","로그인 실패");
		}

		String page = "member/membermessage";
		ViewResolve.views(request, response, page);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
