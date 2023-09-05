package co.yedam.qrj.notice.web;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.yedam.qrj.common.ViewResolve;
import co.yedam.qrj.notice.service.NoticeService;
import co.yedam.qrj.notice.service.NoticeVO;
import co.yedam.qrj.notice.serviceImple.NoticeServiceImpl;


@WebServlet("/noticewrite.do")
public class NoticeWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public NoticeWrite() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파일 업로드 처리(Notice)
//		ThumbNail thumbnail = new ThumbNail();
		NoticeService dao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		
		String saveDir = getServletContext().getRealPath("attech/notice");
		int maxSize = 1024 * 1024 * 1024;	//100M byte
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, "utf-8", new DefaultFileRenamePolicy());
		
		String imgFileName = multi.getOriginalFileName("imgfile");	//원본 파일명
		String realImg = multi.getFilesystemName("imgfile");	//저장되는 파일명
		
//		vo.setNoticeImage(realImg);	//이미지 파일 명을 저장한다.S
//		String fileExt = imgFileName.substring(imgFileName.lastIndexOf("."));
//		vo.setNoticeThumb(thumbnail.makeThumbnail(realImg, imgFileName, fileExt));
		
		String attech = multi.getOriginalFileName("attechfile");
		
		if(attech != null) {
			String attechFile = multi.getFilesystemName("attechefile");
			vo.setNoticeAttech(attechFile);
		}
		
//		String fileExt = imgFileName.substring(imgFileName.lastIndexOf(".")) + 
//		String thumb = thumbnail.makeThumbnail
		
		
		vo.setNoticeWriter(multi.getParameter("NoticeWriter"));
		vo.setNoticeDate(LocalDate.parse(multi.getParameter("NoticeDate")));
		vo.setNoticeTitle(multi.getParameter("NoticeTitle"));
		vo.setNoticeSubject(multi.getParameter("NoticeSubject"));
		vo.setNoticeWriterName(multi.getParameter("NoticeWriterName"));
		
		int n = dao.noticeInsert(vo);
		if(n != 0) {
			response.sendRedirect("noticeselectlist.do");
		}else {
			request.setAttribute("message", "게시글 등록이 실패하였습니다");
			String page = "notice/noticemessage";
			ViewResolve.Forward(request, response, page);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
