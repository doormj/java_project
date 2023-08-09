package co.yedam.condition;

public class ConditionExe {
	public static void main(String[] args) {
		
		//임의의 수 1 2 3
		
		int a = (int)(Math.random()*3);
		String b = "";
		
		if (a==2) {
			b = "가위";
		}
		else if(a==1) {
			b = "바위";
		}
		else {
			b = "보";
		}
		
		
		System.out.printf("%d, %s\n", a, b);
		
		int num = 97;
		char chr = 65;
		System.out.println(chr);
		String dd = "";
		
		System.out.println("어떤 혜택을 원하세요?");
		
		byte b1 = 2;
		byte b2 = 2;
		int sult = b1 + b2; //자동 형변환 (작은 유형 -> 큰 유형)
		
		
		char chra = (char)((Math.random()*4)+65); //수동 해줘야함
		switch(chra) {					//큰 유형 -> 작은 유형
		case 'A' :
			dd = "VVIP";
			System.out.printf("%s 혜택을 받으실 수 있습니다. \n", dd);
			break;
		case 'B' :
			dd = "VIP";
			System.out.printf("%s 혜택을 받으실 수 있습니다. \n", dd);
			break;
		case 'C' :
			dd = "우수 회원";
			System.out.printf("%s 혜택을 받으실 수 있습니다. \n", dd);
			break;
		case 'D' :
			dd = "일반 회원";
			System.out.printf("%s 혜택을 받으실 수 있습니다. \n", dd);
			break;
		default :
			System.out.println("혜택이 없습니다.");
			break;
		}
		System.out.println("감사합니다. ");
	}
}
