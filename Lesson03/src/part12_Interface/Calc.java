package part12_Interface;



/*인터페이스
 * 클래스가 반드시 구현해야 하는 메소드의 시그니처
 * 다형성을 지원, 코드의 유연성을 높이며,일관성을 가지도록 해준다.
 * 일관성
 * >모든 프로젝트 참여자가 동일한 이름의 메소드를 반드시 구현하도록 강제하여 누락과 기능이름이 다르게 구현하는 경우를 배제 할 수 있다.
 * >실수로 인한 수정 시간을 줄일수 있어 생산성이 향상된다.
 * 
 * 
 * */
public interface Calc {
	
	//변수를 정의 할 수 있다. 기본 값은 final이 정의
	//final : 최초 1회 초기화 되면 값을 바꿀 수 없는 상태(모든 변수들)
	final Double PI = 3.14;
	int Error = -9999; //final이 기본값으로 적용되어 있는 상태
	
	//메소드의 시그니처만 정의, 기본적으로 abstract(강제구현 강요) 속성을 가지고 있다.
	//무조건 구현 해야 하는 기능이므로 인터페이스의 규칙을 적용하는 클래스(implement)를 구현체라고 한다.
	//예) 계산기 기능을 구현하는 프로글매은 반드시 4개의 기능이 구현 되어있어야 한다.
	int add(int num1,int num2);
	int subStract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
