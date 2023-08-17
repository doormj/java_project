package co.yedam.friend;

public class UnivFriend extends Friend{
	
	private String univ;
	private String major;
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	
	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo() + " 학교이름은 " + univ + " 전공은 " + major;
	}
}
