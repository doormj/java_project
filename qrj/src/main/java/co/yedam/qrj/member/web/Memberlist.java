package co.yedam.qrj.member.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.qrj.common.ViewResolve;
import co.yedam.qrj.member.service.MemberService;
import co.yedam.qrj.member.service.MemberVO;
import co.yedam.qrj.member.serviceImpl.MemberServiceImpl;


@WebServlet("/memberlist.do")
public class Memberlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Memberlist() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService dao = new MemberServiceImpl();
		
		List<MemberVO> list = dao.memberSelelctList();
		
		request.setAttribute("members", list);
		
		String page = "member/memberlist";
		ViewResolve.Forward(request, response, page);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
