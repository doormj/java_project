package co.yedam.array;

public class TodoApp {
	public static void main(String[] args) {
		//	sortSample();
		// Todo class 활용하여
		// 등록/완료/조회(날짜)/미완료/
		// 등록 : 순번, 할일, 날짜(0812) 등록 시 자동 정렬
		// 완료 : 1 2 4  -> 1 2 4의 상태를 바꿈(false->true)(done)
		// 조회(날짜) : 0812 입력 시 목록 나열		1,2,4,3,6,5 순번을 기준으로
		// 미완료 : false(미완료) 목록 나열		마찬가지 순번을 기준으로 나열
	}
	
	public static void sortSample() {
		int[] intAry = {45, 23, 90, 77, 12, 8}; //비교해서 오름차순 정열
		int len = intAry.length - 1;
		
		for(int j = 0; j<len; j++) {
			for (int i = 0; i <len ; i++) {
				if (intAry[i] > intAry[i+1]) {
					int tmp = intAry[i];
					intAry[i] = intAry[i+1];
					intAry[i+1] = tmp;
				}
			}
		}
		for (int num : intAry)
			System.out.println(num);
	}
}
