package part13;

public class FrontEnd {
	//프로젝트의 화면 디자인 및 기능을 담당하는 클래스
	//데이터 베이스에 주문을 처리하는 로직을 구현해야 할때
	
	public void ClickGood() {
		if(new DoService().DoAction()) {
			System.out.println("좋아요!! 증가");
		}
		if(new BackEnd().DoClickGood()) {
			System.out.println("좋아요!! 증가");
		}
	}
	
	
	
	
	
}
