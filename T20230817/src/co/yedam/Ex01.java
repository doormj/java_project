package co.yedam;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("둘 중 큰 수를 구합니다. ");
		System.out.println("첫번째 수를 입력하시오 : ");
		int num1 = scn.nextInt();
		scn.nextLine();
		System.out.println("두번째 수를 입력하시오 : ");
		int num2 = scn.nextInt();
		scn.nextLine();
		
		
		if(num1 > num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
	}
}
