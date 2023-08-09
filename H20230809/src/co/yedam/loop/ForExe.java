package co.yedam.loop;

public class ForExe {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		sum = 0;
		
		for(int i = 0; i<=5; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
		
		int hap = 0;
		
		for(int i = 0; i<=100; i++) {
			hap +=i;
		}
		System.out.println(hap);
		
		for(int i=2; i<=9; i++) {
			
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) {
				System.out.println( i + "*" + j + "=" + i*j);
			}
		}
		
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print("*"); //ln 은 줄바꿈 하기에 just print
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j <= 4 ; j++) {
				if(i+j<5) {
					System.out.print(" ");
				}
				else {
					System.out.print("*"); 
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
		for(int i = 1; i<5; i++) {
			for(int j = 1; j < i ; j++) {
				System.out.print(" "); 
			}
			for(int k = 4; k >=i ; k--) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\nend");
	}
}
