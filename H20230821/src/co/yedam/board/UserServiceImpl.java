package co.yedam.board;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
	// user.txt에서 정보를 읽고 User 정보를 List컬렉션에 저장.
	// User classs 생성

	List<User> userList = new ArrayList<>();

	public UserServiceImpl() {
		loadFile();
	}
	
	@Override
	public User checkLogin(User user) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getUserId().equals(user.getUserId())) {
				if (userList.get(i).getUserPw().equals(user.getUserPw())) {
					return userList.get(i);
				}
			}
		}
		return null;
	}

	void loadFile() {
		try {
			FileReader fr = new FileReader("c:/Temp/userid.txt");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				String[] data = str.split(" ");
				userList.add(new User(data[0], data[1], data[2]));
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
