package co.yedam.classes.student;

public class Student {
	//필드.
	private int stdNo;	//0
	private String stdName;	//null
	private int score; //private - class 내에서만 값을 받음 (메소드 통해서)
	
	//생성자. : 필드의 값 초기화.
	Student(){
		//	기본 생성자
	}
	
	Student(int stdNo){
		this.stdNo = stdNo;
	}
	
	Student(int stdNo, String stdName, int score){ // 생성자 매개 변수 받아서
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.score = score;
	}
	
	//메소드.(기능)
	void stdInfo() {
		System.out.println("학번 : " + stdNo + 
				", 이름 : " + stdName + ", 점수 : " + score);
	}
	
	void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	
	void setStdName(String stdName) {
		this.stdName = stdName;
	}
	void setscore(int score) {
		if(score<0) {
			this.score = 0;
		}
		else {
			this.score = score;
		}
	}
	
	//getter
	public int getScore() {
		return score;
	}

	public int getStdNo() {
		return stdNo;
	}

	public String getStdName() {
		return stdName;
	}
}
