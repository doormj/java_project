package co.yedam.qrj.member.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.qrj.common.ViewResolve;


@WebServlet("/memberlogout.do")
public class Memberlogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Memberlogout() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String name = (String) session.getAttribute("name");
		session.invalidate(); //세션 정보를 완전히 삭제.
		
		request.setAttribute("message", name + "님 로그아웃 되었습니다.") ;
		String page = "member/memebermessage";
		ViewResolve.Forward(request, response, page);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
