package co.yedam.thread;

import java.awt.Toolkit;

public class BeepPrintExe {
	public static void main(String[] args) {
		
		// 쓰레드 생성
				Thread beep;
				
				// 1. Runnable interface 구현하는 객체를 Thread (생성자 매개값)
				beep = new Thread(new BeepTask());
				// 2. Thread를 상속하는 class를 작성
				beep = new WorkThread();
				
				
				// 3. Runnable 인터페이스를 구현하는 익명객체 생성.	
				// 굳이 class 선언 할 필요 없을 경우 사용
				// Functional Interface. (구현할 메소드 한개만 존재할 시 구문 생략가능)
				beep = new Thread(() -> {
						Toolkit toolkit = Toolkit.getDefaultToolkit();
						for (int i = 0; i < 5; i++) {
							toolkit.beep();
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
				});
		
//		beep = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			
//		});
		
		beep.start();
		
		
		for (int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
