package test;

import java.util.Scanner;

class Student {
	String name;
	int score;
	double height;
}

public class Test {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		String[] data = scan.nextLine().split(" ");
		System.out.println(data[0]);
		System.out.println(data[1]);
	}
}

