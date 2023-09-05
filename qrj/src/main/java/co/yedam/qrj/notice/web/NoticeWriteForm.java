package co.yedam.qrj.notice.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;

import co.yedam.qrj.common.ViewResolve;


@WebServlet("noticewriterform.do")
public class NoticeWriteForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public NoticeWriteForm() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "notice/noticewriterform";
		ViewResolve.Forward(request, response, page);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
