package part12_Interface;

public class CalComplete extends Calculator {

	@Override
	public int times(int num1, int num2) {
		// 인터페이스의 기능을 구현
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// 인터페이스의 기능을 구현
		return num1/num2;
	}
	
	public void showInfo() {
		System.out.println("모두 구현하였습니다.");
	}

}
