package co.yedam.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/img1.jpg");
			FileOutputStream fos = new FileOutputStream("C:/Temp/copy.jpg");
			byte[] buf = new byte[100];
			
			while (true) {
				int val = fis.read(buf);
				if (val == -1) { // 읽어들일 값이 없어지면 브레이크
					break;
				}
				fos.write(buf);
			}
			fis.close();
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("end - " + (end - start) + "ms");
	}
}
