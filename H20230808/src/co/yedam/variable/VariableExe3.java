package co.yedam.variable;

public class VariableExe3 {
	
	int num = 100;
	
	public void showInfo() {
		int num = 100 + this.num;
		System.out.println("num: " + num);
		int num1 = 200; //로컬변수는 선언된 실행블럭 안에서만 유효값을 가짐.
	}
	
	public void printNum() {
//		System.out.println("num1: " + num1);
	}
	
	public void helloMsg(){
		int num = 200 + this.num;
		System.out.println("num: " + num);
	}
}
