package co.yedam.interfaces;

public interface Dao {	//규칙선언. interface
	
	static final double pi = 3.14; //상수
	
	void insert(); //interface는 abstract 안 붙혀도 추상메소드
	void update();
	void delete();
	void select();
}
