package co.yedam.array;

public class ArrayExe1 {
	public static void main(String[] args) {
		
		// 배열선언
		int[] intAry = null; //
		intAry = new int[10];//객체생성 키워드 new, 담을 수 있는 배열(공간 10개)
		intAry = new int[] {12, 25, 67, 23}; //생성 동시에 값 넣어줌(정수)			
		
		int[] intAry2 = {55, 47, 90};
		
		System.out.println(intAry[0]);
		intAry[0] = 22;
		//intAry = 50;
		intAry = intAry2;
		
		int sum = 0;
		
		sum+=intAry[0];
		sum+=intAry[1];
		sum+=intAry[2];
		
		for(int i = 0; i<3; i++) {
			sum+=intAry[i];
		}
		
		System.out.println(sum);
	}

}
