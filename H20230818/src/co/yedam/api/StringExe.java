package co.yedam.api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class StringExe {
	public static void main(String[] args) throws IOException{

//		byte[] bytes = { 104, 101, 108, 108, 111 };
//		String str = null;
//		try {
//			str = new String(bytes, 0, 3, "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		System.out.println(str);
//		
//		String str2 = new String(bytes, 0,5);
//		System.out.println(str2);

		
//		byte[] bytes = new byte[100];
//		
//		System.out.println("입력 : ");
//		int readByteNo = System.in.read(bytes);
//		
//		String str = new String(bytes, 0, readByteNo-2);
//		System.out.println(str);	
		
		
//		String ssn = "010624-1230123";
//		char sex = ssn.charAt(7);
//		switch(sex) {
//		case '1':
//		case '3':
//			System.out.println("남자 입니다.");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자 입니다.");
//			break;				
//		}
		
		
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
		
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);
		
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println("byte2.legnth : " + bytes2.length);
		String str2 = new String(bytes2, "EUC-KR");
		System.out.println("bytes2 -> String : " + str2);
		
		byte[] bytes3 = str.getBytes("EUC-KR");
		System.out.println("byte3.legnth : " + bytes3.length);
		String str3 = new String(bytes3, "EUC-KR");
		System.out.println("bytes3 -> String : " + str3);
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련됨.");
		} else {
			System.out.println("자바와 관련이 없음.");			
		}
		
		
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 아닙니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
