package co.yedam.qrj.notice.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import co.yedam.qrj.notice.service.NoticeService;
import co.yedam.qrj.notice.service.NoticeVO;
import co.yedam.qrj.notice.serviceImple.NoticeServiceImpl;

@WebServlet("/ajaxNoticeSearch.do")
public class NoticeSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NoticeSearch() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeService dao = new NoticeServiceImpl();
		List<NoticeVO> notices = new ArrayList<>();
		ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());	//json 형태의 데이터로 변환
		
		String key = request.getParameter("key");
		String val = request.getParameter("val");
		
		notices = dao.noticeSelecList(key, val);
		String list = objectMapper.writeValueAsString(notices);
		
		response.setContentType("text/html; charset=UTF-8");	//한글 깨짐 방지 text/html폼 데이터라는 인식
		response.getWriter().append(list);
		return;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
