package co.yedam.api;

public class StringUtils {
	static String checkGender(String ssn) {
		// 주민번호 구분해서 남자, 여자, 오류 케이스 판별.

		int idx = ssn.length() - 7;
		
		int year = Integer.valueOf(ssn.substring(0, 2));
		boolean before2000 = year > 23;
		
		char chr = ssn.charAt(idx);
		
		String gen = "오류";
		
		if (before2000) {	//오류 구문(2000년대 - 3,4 / 90년대 - 1,2)
			if (chr == '3' || chr == '4') {
				return gen;
			}
		} else {
			if (chr == '1' || chr == '2') {
				return gen;
			}
		}

		switch (chr) {
		case '1':
		case '3':
			gen = "남자";
			break;
		case '2':
		case '4':
			gen = "여자";

		}
		return gen;
	}
		
		
		
		
//		int len = ssn.length()-7;
//		char chr = ssn.charAt(len);
//		
//		int year = Integer.valueOf(ssn.substring(0,2));
//		boolean before2000 = year > 23;
//
//		String gen = "오류";
//		
//		switch (chr) {
//		case '1':
//		case '2':
//			gen = "남자";
//		case '3':
//		case '4':
//			gen = "여자";
//		}
		
		
//		if (len == 13) {
//			char sex =  ssn.charAt(7);
//			switch (sex) {
//			case 1:
//			case 3:
//				System.out.println("남자 입니다.");
//				break;
//			case 2:
//			case 4:
//				System.out.println("여자 입니다.");
//				break;
//			default:
//				System.out.println("오류입니다.");
//			}
//		}else if (length == 14) {
//			char sex = ssn.charAt(8);
//			switch (sex) {
//			case 1:
//			case 3:
//				System.out.println("남자 입니다.");
//				break;
//			case 2:
//			case 4:
//				System.out.println("여자 입니다.");
//				break;
//			default:
//				System.out.println("오류입니다.");
//			}
//		} else {
//			System.out.println("주민번호를 잘못 입력 하셨습니다.");
//		}
//		return null;
//	}

	static String getFileName(String filePath) {
		// 전체 경로에서 파일명만 추출
		return null;
	}
}
