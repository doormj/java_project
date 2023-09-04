package co.yedam.qrj.notice.map;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.yedam.qrj.notice.service.NoticeVO;

public interface NoticeMapper {
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	
	void noticeHitUpdate(int id);
	
	List<NoticeVO> noticeSelecList(@Param("key")String key, @Param("val")String val);
}
