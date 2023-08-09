package co.yedam.loop;

public class WhileExe {
	public static void main(String[] args) {
		boolean  run = true;
		while(run) {
			int tmp = (int) (Math.random()*100);
			if(tmp > 90) {
				//break;			//빠져나옴
				run = false;		//빠져나옴
			}
			System.out.println(tmp);
		}
		System.out.println("end");
		
		int aa = 0;
		
		while(aa<=10) {
			System.out.println(aa);
			aa++;
		}
		int bb = 1;
		int sumb = 0;
		while(bb <=100) {
			sumb +=bb;
			bb++;
		}
		System.out.println(sumb);
		
		
	}
}


