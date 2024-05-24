package part06_up;

public class Testcode {

	public static void main(String[] args) {
		//업 캐스팅
		//상속 관계에 있는 부모와 자식 클래스간 형변환
		//자식 클래스 -> 부모 클래스가 되는 형변환
		//부모가 물려준 기능을 그대로 자식 클래스에서 구현하였을때
		//부모 인스턴스로 자식 클래스의 인스턴스를 참조 할 수 있으며 자식클래스에서 구현한 상속받은 기능을 부모 이름으로 수행
		//자식클래스에서만 구현한 기능은 수행하지 못한다.
		//1.자식 클래스 인스턴스
		chlid ch = new chlid();
		ch.dok();
		ch.dk();
		//2. 부모 클래스로 업캐스팅
		parent par = ch;
		//3.자식 클래스

		//가 구현한 부모 클래스의 기능을 수행
		
		System.out.println(ch);
		System.out.println(par);
		
		

	}

}
