package co.yedam.api;



class Member {
	private int memberId;
	private String memberName;
	

	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	
	
	@Override
	public String toString() {
//		return super.toString();
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

	@Override
	public int hashCode() {
		return memberId;
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Member target = (Member) obj;
		if(this.memberId == target.memberId 	//Id가 같고,
				&& this.memberName.equals(target.memberName)) {	//이름도 같을 시(분할 가능)
			return true;	// 논리적으로는 동일.
		} else {
			return false;
		}
	}
}


public class EqualsExe {
	public static void main(String[] args) {
		String str1 = new String("Hong");
		String str2 = new String("Hong");
		
		System.out.println(str1.equals(str2));
		
		Member mem1 = new Member(101, "Hong");
		Member mem2 = new Member(101, "Hong");
		
		System.out.println(mem1.equals(mem2));
		
	}
}
