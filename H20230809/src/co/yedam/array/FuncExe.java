package co.yedam.array;

public class FuncExe {
	public static void main(String[] args) {
		//printStar();
		//printStar(3);
		//printString(5,"N번 반복하기");
		int n3 = sum(5, 7);
		System.out.println(n3);
		
		int[] intAry = {5,7,9,2,6};
		int n4 = arry(intAry);
		System.out.println(n4);
		
		Friend f = getFriend("홍길동", "010-4567-2345", Gender.MEN);
		f.showInfo();
	}
	
	public static void printStar() {
		System.out.println("*");
	}
	
	public static void printStar(int times) { //매개변수
		for(int i = 0; i<times; i++)
		System.out.println("*");
	}
	
	public static void printString(int times, String str) { //매개변수 여러개 선언
		for(int i = 0; i<times; i++)
		System.out.println(str);
	}
	
	public static int sum(int n1, int n2) { //매개변수 반환 sum = (n1+n2)
		int result = n1 + n2;
		return result;
	}
	
	public static int arry(int[] arry) { 
		int hap = 0;
		for(int i=0; i < arry.length; i++) {
			hap += arry[i];
		}
		return hap;
	}
	
	public static Friend getFriend(String name, String phone, Gender gender) {
		Friend f = new Friend();
		f.name = name;
		f.phone = phone;
		f.gender = gender;
		return f;
		
		}

}
