package co.yedam.friend;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanExe {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scn = null;
		File file = new File("src/co/yedam/friend/friends.txt");

		try {
			scn = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

//		While(scn.hasNext()) {
//			String line = scn.next();
//			System.out.println(line);
//		}

		List<Friend> friends = new ArrayList<>();

		while (true) {
			String line = null;
			try {
				line = scn.nextLine();
			} catch (NoSuchElementException e) {
				break;
			}
			System.out.println(line);
			String[] data = line.split(" ");
			// 홍길동 010-1111-1111 1995-05-05
			try {
				Friend newFriend = new Friend(data[0], data[1], sdf.parse(data[2]));
				friends.add(newFriend);
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		for (Friend fnd : friends) {
			System.out.println(fnd.toString());
		}
		System.out.println("end of line");
	}
}
