package co.yedam.qrj.notice.serviceImple;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.qrj.common.DataSource;
import co.yedam.qrj.notice.map.NoticeMapper;
import co.yedam.qrj.notice.service.NoticeService;
import co.yedam.qrj.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeService{
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private NoticeMapper map = sqlSession.getMapper(NoticeMapper.class);

	@Override
	public List<NoticeVO> noticeSelectList() {
		return map.noticeSelectList();
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		map.noticeHitUpdate(vo.getNoticeId()); //조회수 증가
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		return map.noticeDelete(vo);
	}

	@Override
	public void noticeHitUpdate(int id) {
		
	}

	@Override
	public List<NoticeVO> noticeSelecList(String key, String val) {
		return map.noticeSelecList(key, val);
	}

}
