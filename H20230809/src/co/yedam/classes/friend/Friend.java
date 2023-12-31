package co.yedam.classes.friend;

import java.util.Date;

import co.yedam.array.Gender;

public class Friend {
	private String name;
	private String phone;
//	private Date birth;
	private String birth;
	
	
	public Friend(String name, String phone, String birth) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}



	public String getPhone() {
		return phone;
	}



	public String getBirth() {
		return birth;
	}



	public void setName(String name) {
		this.name = name;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override					//toString = Object class가 가지고 있는 메소드
	public String toString() {	//
		return "Friend [name=" + name + ", phone=" + phone + ", birth=" + birth + "]";
	}


	public void showInfo() {
		System.out.printf("이름 : %s, 연락처 : %s, 생일 : %s\n", name, phone, birth);
	}
	
	
	

}
