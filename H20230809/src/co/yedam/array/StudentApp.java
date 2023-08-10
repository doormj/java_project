package co.yedam.array;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		
		boolean run = true;
		Student[] students = new Student[10];
		Scanner scn = new Scanner(System.in);
		int idx = 0;
		double max = 0;
		String maxname = "";
		
		// 1.등록 2.조회 3.목록 4.종료
		
		while (run) {
			System.out.println("1.등록 2.조회 3.목록 4.키큰 학생 이름 5.종료");
			System.out.print("선택>> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1:
				Student s1 = new Student();
				System.out.println("이름 : ");
				s1.name = scn.nextLine();
				System.out.println("성적 : ");
				s1.score = Integer.parseInt(scn.nextLine());
				System.out.println("키 : ");
				s1.height = Double.parseDouble(scn.nextLine());
				students[idx]=s1;
				idx++;
				break;
				//scanner로 이름, 점수 입력 받아
				// Student s1부터 idx 첫번째 위치에 등록, idx++로 증가시켜
				// 주번째 위치 등록~
				//둘다 입력
				
			case 2:
				boolean isExist = false;
				//이름 입력 시 점수 출력
				System.out.println("이름 : ");
				String name = scn.nextLine();
				for(int i = 0; i<students.length; i++) {
					if (students[i] != null && students[i].name.equals(name)) {//equals 사용하여 입력받은 name 변수의 값을 배열의 .name 값과 비교함
						System.out.printf("%s의 점수 : %d, 키 : %.1f\n", students[i].name, students[i].score, students[i].height);
						isExist = true;
					}
				}
				if (!isExist) {
					System.out.println("찾는 이름이 없습니다.");
				}
				break;
			case 3:
				//이름과 점수 둘다 출력
				for(int i = 0; i<students.length; i++) {
					if (students[i] != null && students[i].gender == Gender.MEN) {
						System.out.printf("이름 : %s, 점수 : %d, 키 : %.1f\n", students[i].name, students[i].score, students[i].height);
					}
				}
				break;
			case 4:
				//키 받아서 이름 출력
				for(int i = 0; i<students.length; i++) {
					if(students[i] != null && students[i].height > max) {
							max = students[i].height;
							maxname = students[i].name;
					}
				}
				System.out.printf("제일 큰 사람 : %s, 키 : %.1f\n", maxname, max);
				break;
				
			case 5:
				//종료
				System.out.println("종료합니다. ");
				run = false;
			}
		}
		System.out.println("end");
		// 등록 : 이름, 점수 Scanner
		// 조회 : 이름 넣으면 점수를 볼 수 있게
		// 목록 : 이름, 성적 출력
	}
}
