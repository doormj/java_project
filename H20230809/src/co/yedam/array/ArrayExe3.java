package co.yedam.array;


public class ArrayExe3 {
	public static void main(String[] args) {
		
		int max = 0;
		String name = "";
		
		Student[] students = new Student[3];
		
		//초기값
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.score = 85;
		s1.height = 178.9;
		s1.gender = Gender.WOMEN;
		Student s2 = new Student();
		s1.name = "김길동";
		s1.score = 80;
		s1.height = 169.9;
		s1.gender = Gender.MEN;
		Student s3 = new Student();
		s1.name = "박길동";
		s1.score = 90;
		s1.height = 188.9;
		s1.gender = Gender.MEN;
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		// students[0].name + students[0].score;
		
		for(int i = 0; i< students.length; i++) {
			if(max<students[i].score) {
				max=students[i].score;
				name = students[i].name;
			}
		}
		System.out.printf("최고점 : %d, 이름 : %s\n", max, name);

//		String[] names = { "홍길동", "김길동", "박길동", "최길동" };
//		int[] scores = { 85, 88, 92, 75 };
//
//		
//		// String: name
//
//		
//		for(int i = 0; i< scores.length; i++) {
//			if(max<scores[i]) {
//				max=scores[i];
//				name = names[i];
//			}
//		}
//		System.out.printf("최고점 : %d, 이름 : %s", max, name);
	}
}
