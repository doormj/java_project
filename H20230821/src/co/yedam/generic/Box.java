package co.yedam.generic;

// T: type parameter
// <T> 제네릭.
public class Box<T> {	// Box라는 클래스가 선언이 될때 타입 지정
	T obj;
	
	T get() {
		return obj;
	}
	
	void set(T obj) {
		this.obj = obj;
	}
	
}
