package co.yedam.array;

import java.util.Scanner;

public class TodoApp {
	public static void main(String[] args) {
		//	sortSample();
		// Todo class 활용하여
		// 등록/완료/조회(날짜)/미완료/
		// 등록 : 순번, 할일, 날짜(0812) 등록 시 자동 정렬
		// 완료 : 1 2 4  -> 1 2 4의 상태를 바꿈(false->true)(done)
		// 조회(날짜) : 0812 입력 시 목록 나열		1,2,4,3,6,5 순번을 기준으로
		// 미완료 : false(미완료) 목록 나열		마찬가지 순번을 기준으로 나열
		
		Todo[] todos = new Todo[10];
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int idx = 0;
		
		while(run) {
			
			System.out.println("1.등록 2.완료 3.할일 4.순번");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			
			case 1:
				Todo td = new Todo();
				
				System.out.println("순서 : ");
				td.no = Integer.parseInt(scn.nextLine());
				System.out.println("할일과 날짜 : ");
				String[] data = scn.nextLine().split(" ");
				
				td.todo = data[0];
				td.dueDate = data[1];
				td.done = false;
				System.out.println("완료상태는 미완료\n");
				
//				System.out.println("순서 : ");
//				td.no = Integer.parseInt(scn.nextLine());
//				System.out.println("할일 : ");
//				td.todo = scn.nextLine();
//				System.out.println("날짜 : ");
//				td.dueDate = scn.nextLine();
//				System.out.println("완료상태는 미완료\n");
//				td.done = false;
				
				todos[idx] = td;
				idx++;
				break;
			case 2:
//				System.out.println();
//				data = scn.nextLine().split(" ");
//				for (String noStr)
//				
//					if(todos[i].no == Integer.parseInt(scn.nextLine())
				
				for (int i = 0; i < todos.length; i++) {
					if (todos[i] != null) {
							todos[i].showInfotd();
						}
					}
					
				break;
						
			case 3:
				int lnth = 0;
				for(int i = 0; i<todos.length-1; i++) {
					if(todos[i] != null) {
						lnth++;
					}
				}
				//for 비교해서 순서교체
				for(int i = 0; i<lnth -1; i++) {
					Todo tmp = new Todo();
						if(todos[i].no < todos[i+1].no) {
							tmp = todos[i];
							todos[i] = todos[i+1];
							todos[i+1] = todos[i];
						}
					}
				// 출력.
				break;
			case 4:
				
			}
		}
	}

	public static void sortSample() {
		int[] intAry = { 45, 23, 90, 77, 12, 8 }; // 비교해서 오름차순 정열
		int len = intAry.length - 1; // 널값 비교 안하려고 -1

		for (int j = 0; j < len; j++) {
			for (int i = 0; i < len; i++) {
				if (intAry[i] > intAry[i + 1]) {
					int tmp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = tmp;
				}
			}
		}
		for (int num : intAry)
			System.out.println(num);
	}
}
