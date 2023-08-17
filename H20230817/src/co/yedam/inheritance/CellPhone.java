package co.yedam.inheritance;

public class CellPhone {
	private String model;
	private String color;
	
	
	CellPhone(){
		
	}
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// extends Object 상태이기 때문 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return color + ", " + model;
	}
	
}
