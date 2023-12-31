package co.yedam;

public class Friend {

	private String name;
	private String phone;
	private String birth;
	private String height;
	
	
	public Friend(String name, String phone, String birth, String height) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.height = height;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}
	
	
	public String showInfo() {
		return "이름 : " + name + " 전화번호 : " + phone + " 생년월일 : " + birth + " 키 : " + height;
	}
}
