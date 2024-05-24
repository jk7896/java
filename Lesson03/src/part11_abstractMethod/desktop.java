package part11_abstractMethod;

public class desktop extends Computer {
	//컴퓨터클래스를 상속 받았는데 깜빡하고 컴퓨터 키는 동작을 구현을 못했다.
		//이런 상황을 미연에 방지 하기 위해 강제로 기능을 구현 하도록 유도 할 수 있다.
		//Computer 클래스를 abstract(추상화) 클래스로 만들고 켜는 동작과 끄는 동작을 강제로 구현하도록 abstract 할 수 있다.

	@Override
	void turnOn() {
		System.out.println("컴퓨터를 On를 합니다.");
		
	}

	@Override
	void TurnOff() {
		System.out.println("컴퓨터를 Off를 합니다.");
		
	}
	
	
	@Override
	public void Display() {
		System.out.println("데스크탑 디스플레이 기능재정의를 하였습니다.");
	}
	@Override
	public void typing() {
		System.out.println("데스크탑에 타자를 치고있습니다.");
	}
	
	
	
	
	
	
	
	

}
