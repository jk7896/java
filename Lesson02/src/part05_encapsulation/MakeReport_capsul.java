package part05_encapsulation;
//캡슐화를 구현한 클래스
public class MakeReport_capsul {
	
	private String Message; //출력해야 하는 메세지
	public String  GetMessage() {
		return Message;
	}
	private void SetMessage() {
		System.out.println("\n"+ this.Message);
	}
	public void Setmessage(String message) {
		Message=message;
	}
	
	private String Unit; //꾸며주는 기호 값 변수
	
	public void SetUnit(String unit) {
		Unit=unit;
	}
	public String GetUnit() {
		return Unit;
	}
	//꾸며주는 기호를 출력하는 메소드
	private void SetUnit() {
		for (int i =0 ; i<11;i++) {
			System.out.print(this.Unit);
			
		}
	}
	
	
	public void Doprint() {
		SetUnit();
		SetMessage();
		SetUnit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
