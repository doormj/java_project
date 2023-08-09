package co.yedam.array;

public class ArrayExe2 {
	public static void main(String[] args) {
		
		//
		int num1, num2, num3;
		num1 = 56;
		num2 = 72;
		num3 = 67;
		
		
		int[] aryy = new int[] {num1, num2, num3};
		int max = 0;
		
		//큰값 :
		
		for(int i = 0; i<2; i++) {
			if(aryy[i] > aryy[i+1]) { //i+1 가 마지막 배열에서 이상한 값 들어가 오류 날 수 있으니
				max = aryy[i];
			}
		}
		System.out.printf("큰값 : %d\n",max);
		
		for(int i = 0; i<aryy.length; i++) {
			if(max<aryy[i]) {
				max = aryy[i];
			}
		}
		System.out.printf("큰값 : %d\n",max);
		
		
		
		
		
		
		int[] ary = new int[5];
		
		// 1~100 임이의 값
		double sum = 0;
		double avg = 0;
		
		for(int i=0; i<5; i++) {
			ary[i] = (int)(Math.random()*100+1);
			System.out.println(ary[i]);
			sum += ary[i];
			avg = sum/5;
		}
		System.out.printf("합 : %.1f, 평군 : %.2f\n",sum, avg);
			
	}
}
