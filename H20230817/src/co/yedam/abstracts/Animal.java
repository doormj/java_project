package co.yedam.abstracts;

public abstract class Animal {//추상 클래스
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	// 추상메소드. 구현부분이 없는..
	public abstract void sound();
	
}
