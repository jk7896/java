package part11_abstractMethod;

public abstract class Computer {
	/*컴퓨터의 기본 기능을 구현 하고 싶다.
	컴퓨터라면 반드시 해야 하는 기능이 있을때 추상화를 위해 추상클래스를 만들수 있다.
	
	추상클래스
		구현 코드 없이 메서드의 선언만 있는 메소드를 포함한 클래스
		메소드 중 추상메소드가 포함 되어있으면 반드시 클래스는 추상 클래스가 되어야 한다.
		abstract 클래스가 되면 new키워드를 통해 객체를 생성 할 수 없다.(오로지 상속용으로만 사용된다.)
		추상클래스를 상속 받은 클래슨느 반드시 추상메소드를 구현해야 한다.
		
	*/
	
	abstract void turnOn();
		//컴퓨터 켜는 동작

	
	abstract void TurnOff();
		//컴퓨터 끄는 동작

	public void Display() {
		System.out.println("화면을 나타냅니다.");
	}


	public void typing() {
		System.out.println("타자를 칩니다.");
		
	}

	
	
	
	
	
	

}
