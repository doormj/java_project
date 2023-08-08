package co.yedam.variable;

public class VariableExe {
	public static void main(String[] args) {
		// 변수 선언
		// 정수형 변수의 유형 : byte, short, int, long
		// byte : -128 ~ 127
		// short : -32768 ~ 32767
		// int : -2147483648 ~ 2147483647
		
		int num1 = 1; //초기화.
		int num2 = 2147483647;
		
//		num1 = 10; 
//		num2 = 20;
		
		int result = num1 + num2;
		System.out.println("result : " + result);
		
		byte b1 = 10;
		byte b2 = 20;
		
		int b3 = b1 + b2; 
		//Type mismatch: cannot convert from int to byte
		
		int i1 = 100;
		byte b4 = 10;
		b3 = i1 + (int) b4; // (int)자동형변환해서 연산.(없는것과 동일)
		
		//실수타입.
		//float, double
		double dbl1 = 10.23223;
		double dbl2 = 20;
		double dbl3 = dbl1 + dbl2;
		
		float f1 = 10.1F;
		float f2 = 10.001f;
		
		float f3 = f1+f2;
		System.out.println("f3 :" +f3); //float = 근사치 계산

	}

}
