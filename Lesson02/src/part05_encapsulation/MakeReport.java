package part05_encapsulation;

public class MakeReport {
	
	String Message; //출력해야 하는 메세지
	String Unit; //꾸며주는 기호 값 변수
	
	//꾸며주는 기호를 출력하는 메소드
	public void SetUnit() {
		for (int i =0 ; i<11;i++) {
			System.out.print(this.Unit);
			
		}
	}
	
	
	public void SetMessage() {
		System.out.println("\n"+ this.Message);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
