package part12_Interface;

//추상클래스
//인터페이스를 받아 구현하는 구현체로 추상클래스로도 사용할 수 있다.
//>장점 : 인터페이스의 모든 기능을 적당히 완화 시켜 상속을 줄수 있다.
//추상클래스 자체도 구현을 강조한느 성격이기 때문에 인터페이스를 받아 일반 메소드(선택적 메소드)로 변행하여 
//나머지부분은 구현을 강요하면서 상속을 줄 수 있다.

//implements : 인터페이스의 구현체 임을 선언
public abstract class Calculator implements Calc{
	//오류가 뜨지 않는 이유(추상 클래스 이기 때문)
	
	@Override
	public int add(int num1, int num2) {
		//인터페이스가 가지고 있던 add메소드를 구현
		//가상 메소드로 변환하여 자신을 상속받는 클래스에서 선택적으로 구현하도록 완화
		return num1+num2;
	}
	
	
	@Override
	public int subStract(int num1, int num2) {
		//인터페이스가 가지고 있던 add메소드를 구현
		//가상 메소드로 변환하여 자신을 상속받는 클래스에서 선택적으로 구현하도록 완화
		return num1+num2;
	}

}
