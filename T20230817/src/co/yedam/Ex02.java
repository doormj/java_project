package co.yedam;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int hap1 = 0, hap2 = 0;
		
		System.out.println("두 수 사이의 값 중 2의 배수와 3의 배수의 합을 출력합니다. ");
		System.out.println("첫번째 수를 입력하시오 : ");
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.println("두번째 수를 입력하시오 : ");
		int num2 = Integer.parseInt(scan.nextLine());
		
		
		if (num1 > num2) {
			for(int i = num2; i<num1; i++) {
				if(i%2 == 0) {
					hap1 +=i;
				} 
				if (i%3 == 0) {
					hap2 +=i;
				}
			}
			System.out.println("두 수 사이의 2의 배수의 합 : ");
			System.out.println(hap1);
			System.out.println("두 수 사이의 3의 배수의 합 : ");
			System.out.println(hap2);
		} else if (num2 > num1) {
			for(int i = num1; i<num2; i++) {
				if(i%2 == 0) {
					hap1 +=i;
				}
				if (i%3 == 0) {
					hap2 +=i;
				}
			}
			System.out.println("두 수 사이의 2의 배수의 합 : ");
			System.out.println(hap1);
			System.out.println("두 수 사이의 3의 배수의 합 : ");
			System.out.println(hap2);
		}
	}
}
