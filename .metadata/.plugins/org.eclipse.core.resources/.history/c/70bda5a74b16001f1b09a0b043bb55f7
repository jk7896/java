package part12_Interface;

public class TestCode {

	public static void main(String[] args) {
		//인터페이스로 업캐스팅
		Calc calc = new CalComplete();
		
		//업캐스팅시 클래스가 다중 상속되면 기능이 중복되어 어떤기능을 수행 할지 모호성이 발생
		//인터페이스가 메소드만 정의 하여 구현시 기능에 대한 중복은 피할 수 있다.
		//다중 상속이 가능하며 상속받은 자식 클래스는 여러개의 부모 인터페이스 모습으로 다형성을 구현 할 수있다.
		int num1 = 10;
		int num2 =2;
		
		System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" + calc.subStract(num1, num2));
		System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));
		
		
		
		
		
		
		
		
		
		
		

	}

}
