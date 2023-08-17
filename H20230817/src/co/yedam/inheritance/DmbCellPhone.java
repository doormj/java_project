package co.yedam.inheritance;

public class DmbCellPhone extends CellPhone{
	private int channel;
	
	public void changeChannel(int channel) {
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("DMB 폰을 켭니다");
	}
	
	
	//재정의(overriding) ctrl+space select
	//부모 클래스의 메소드를 자식클래스에서 재정의
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
//		super.turnOn(); //super : 부모를 가르킴
		System.out.println(getModel() + "의 전원을 켭니다. ");
		
		
	}
}
