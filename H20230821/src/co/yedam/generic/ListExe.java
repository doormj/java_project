package co.yedam.generic;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");		//추가
		list.add(new String("World"));
		list.add("Good");
		
		String result = list.get(0);	// ary[0]
//		System.out.println(result);
		
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		list.set(1, "result");		//수정
		System.out.println("===수정 후===");
		list.remove(1);		//삭제
		list.clear();		//모든요소삭제
		
		for(String str : list ) {
			System.out.println(str);
		}
		
	}
}
