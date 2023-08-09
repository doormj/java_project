package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int a = src.nextInt();
        int b = src.nextInt();
        
        int result = a - b;
        
        System.out.println(result);
	}
}

