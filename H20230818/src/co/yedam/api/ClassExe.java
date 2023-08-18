package co.yedam.api;

import java.lang.reflect.Method;

public class ClassExe {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("co.yedam.api.Member");
			Method[] methods = cls.getDeclaredMethods();	//해당 class 포함된 method
			for(Method meth : methods) {
				System.out.println(meth.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
