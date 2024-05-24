package part13;

public class BackEnd implements DbHepher {
	public void DataBaseCont(int Loginid,String url) {
		//백엔드에서 실제 데이터베이스에 데이터를 처리하는 로직은 백엔드 부서에서 위와같이 구현하여 프론트앤드개발자들과 다른 로직을 구현해
		//둘 수 있다.
		//메소드 이름, 인수 인자가 맞지 않아 취합하는 과정에서 불필요한 비용이 발생한다.
		//인터페이스를 두어 두 클래스가 인터페이스를 바라보게 한다.
		//상호의존적인 요소를 인터페이스로 방향을 돌린다.
		
	}
	@Override
	public boolean DoClickGood() {
		//실제로 데이터베이스 처리 로직을 백앤드부서에서 구현
		return true;
	}

}
