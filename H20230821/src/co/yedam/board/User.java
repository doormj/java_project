package co.yedam.board;

public class User {
	
	private String UserId;
	private String UserPw;
	private String UserName;
	
	public User() {
		
	}
	
	public User(String userId, String userPw, String userName) {
		super();
		UserId = userId;
		UserPw = userPw;
		UserName = userName;
	}


	public String getUserId() {
		return UserId;
	}


	public void setUserId(String userId) {
		UserId = userId;
	}


	public String getUserPw() {
		return UserPw;
	}


	public void setUserPw(String userPw) {
		UserPw = userPw;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}
	
	
	
}