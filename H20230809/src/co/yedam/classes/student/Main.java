package co.yedam.classes.student;

public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();	//인스턴스.(static 없는 것들) new키워드로 사용
		double result = cal.sum(20, 40);
		System.out.println(result);
		
		double result2 = Calculator.multi(10, 20); //정적 타입
		System.out.println(result2);
		
		
		
//		public void start() {		//	main 이 인스턴스 일 시 실행메소드
//			Main main = new Main();
//			main.main(null);
//		}
		
	}
}
