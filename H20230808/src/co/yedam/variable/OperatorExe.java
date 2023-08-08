package co.yedam.variable;

public class OperatorExe {
	public static void main(String[] args) {
		
		int x, y;
		y = x = 2;
		
		int result = x++ +10;
		System.out.println(result);
		System.out.println("x: "+x);
		
		result = ++y +10;
		System.out.println(result);
		System.out.println("x: "+x);
		
		
		String str = "";
		// 삼항 연산자.
		if( x > 10) {
			str = "x는 10이상.";
		}
		else {
			str = "x는 10미만.";
		}
		str = (x>=10) ? "x는 10이상." : "x는 10미만.";
		System.out.println(str);
	}
}
