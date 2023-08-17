package co.yedam;

public class Ex03 {
	public static void main(String[] args) {
		
		int num1 = (int) (Math.random()*10)+1;
		int num2 = (int) (Math.random()*10)+1;
		int num3 = (int) (Math.random()*10)+1;
		int num4 = (int) (Math.random()*10)+1;
		int num5 = (int) (Math.random()*10)+1;
		
		int max = 0;
		int min = 10;
		
		int[] intAry = new int[] {num1, num2, num3, num4, num5};
		
		for(int i=0; i<intAry.length; i++) {
			if(intAry[i]>max) {
				max = intAry[i];
			}
		}
		
		
		for(int i=0; i<intAry.length; i++) {
			if(intAry[i]<min) {
				min = intAry[i];
			}
		}
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d\n", min);
	}
}
