package part11_abstractMethod;

public class Abstract_TEST {

	public static void main(String[] args) {
		//추상클래스는 new 키워드로 객체화 할 수 없다.
		//Computer co = new Computer();
		
		
		desktop dp = new desktop();
		dp.turnOn();   //desktop에서 강제 구현된메소드
		dp.Display(); //desktop클래스에서 재정의한 일반 메소드
		dp.typing();  //computer클래스에서 구현한 일반메소드
		dp.TurnOff();  //desktop에서 강제 구현된 메소드
		
		
		
		
		
		
		
		
		
		
	}

}
