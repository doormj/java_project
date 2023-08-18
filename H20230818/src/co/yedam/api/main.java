package co.yedam.api;

public class main {
	public static void main(String[] args) {
		
	String file = "C:/Dev/temp/flower.jpg";
	StringUtils.getFileName(file);
	
	String ssn = "900405-1234567";
	System.out.println(StringUtils.checkGender(ssn));
	}
}
