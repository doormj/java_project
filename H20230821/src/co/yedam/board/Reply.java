package co.yedam.board;

public class Reply {
	private int DatNum;
	private int WonNum;
	private String Dat;
	private String DatWiter;
	
	//constructor
	public Reply() {
		
	}
	public Reply(int wonNum, String dat, String datWiter) {
		super();
		this.WonNum = wonNum;
		this.Dat = dat;
		this.DatWiter = datWiter;
	}

	//get/set
	public int getDatNum() {
		return DatNum;
	}

	public void setDatNum(int datNum) {
		DatNum = datNum;
	}

	public int getWonNum() {
		return WonNum;
	}

	public void setWonNum(int wonNum) {
		WonNum = wonNum;
	}

	public String getDat() {
		return Dat;
	}

	public void setDat(String dat) {
		Dat = dat;
	}

	public String getDatWiter() {
		return DatWiter;
	}

	public void setDatWiter(String datWiter) {
		DatWiter = datWiter;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Reply [DatNum=" + DatNum + ", WonNum=" + WonNum + 
				", Dat=" + Dat + ", DatWiter=" + DatWiter + "]";
	}

	public String DatInfo() {
		String str = "[" + DatNum + "] " + "원글번호:"+ WonNum +
				" 댓글내용: " + Dat + " 댓글작성자: " + DatWiter;
		return str;
	}
	

	
	
	
	
}
