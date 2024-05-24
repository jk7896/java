package part13;

public class DoService implements DbHepher {
	public boolean DoAction()
	{
		//데이터베이스에 접속하여 데이터를 전달하는 FrontEnd에서 만든 클래스	
		//데이터베이스에 등록이 완료되면 ture - 실패하면 false를 반환한다고 가정하고 프로그램
		//데이터베이스 등록 로직은 BakcEnd에서 구현를 내용이므로 성공했다고 가정하고 true를 넣고 FrontEnd를 구현을 계속 할 수 있다.
		return true;
	}
	@Override
	public boolean DoClickGood() {
		//프론트 앤드 개발부서에서 규칙을 맞는 메소드를 호출
		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
