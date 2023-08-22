package co.yedam.board;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Board  implements Serializable {
	private int brdNo;	//	brd_no
	private String brdTitle;
	private String brdContent;
	private String brdWriter;
	private Date writeDate;
	private Date updateDate;
	
	//constructor.
	public Board() {
		
	}
	public Board(String brdTitle, String brdContent, String brdWriter) {
		super();
		this.brdTitle = brdTitle;
		this.brdContent = brdContent;
		this.brdWriter = brdWriter;
	}
	
	//get/set
	public int getBrdNo() {
		return brdNo;
	}
	public void setBrdNo(int brdNo) {
		this.brdNo = brdNo;
	}
	public String getBrdTitle() {
		return brdTitle;
	}
	public void setBrdTitle(String brdTitle) {
		this.brdTitle = brdTitle;
	}
	public String getBrdContent() {
		return brdContent;
	}
	public void setBrdContent(String brdContent) {
		this.brdContent = brdContent;
	}
	public String getBrdWriter() {
		return brdWriter;
	}
	public void setBrdWriter(String brdWriter) {
		this.brdWriter = brdWriter;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	//	toString
	@Override
	public String toString() {
		return "Board [brdNo=" + brdNo + ", brdTitle=" + brdTitle + ", brdContent=" + brdContent + ", brdWriter="
				+ brdWriter + ", writeDate=" + writeDate + ", updateDate=" + updateDate + "]";
	}
	
	public String listInfo() {
		String str =  "[" + brdNo + "]" +" 제목:" + brdTitle + " 게시자:" + brdWriter;
		return str;
	}
	
	public String showInfo() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String str = "글번호:" + brdNo + " 제목:" + brdTitle + "\n"
						+ "내용:" + brdContent + "\n"
						+ "작성자:" + brdWriter
						+ "작성일자:" + sdf.format(writeDate) + "\n"
						+ "수정일자:" + sdf.format(updateDate);
		return str;
		
	}
	

}
