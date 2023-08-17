package co.yedam.interfaces;

public class Example01 {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5]; //intAry[0]
		
//		for(int n = 1; n<=25; n++) {
//			System.out.println(intAry[4][4]);
//		}
		
		int no = 1;
		
		for (int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				intAry[r][c] = no++;
 			}
		}
		
		for (int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				System.out.printf("%3d", intAry[c][r]);
			}
			System.out.println();
		}
		
		System.out.println();
		no = 1;
		
		for (int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				intAry[r][c] = no++;
 			}
		}
		
		for (int r=4; r>=0; r--) {
			for(int c=0; c<5; c++) {
				System.out.printf("%3d", intAry[c][r]);
			}
			System.out.println();
		}
	}
}
