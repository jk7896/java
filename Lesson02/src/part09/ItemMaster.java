package part09;

public class ItemMaster {

	//코드 : 고유한 개체를 나타내기 위한 중복되지 않는 문자열
	private String ItemCode; //품목 코드
	private String ItemName; //품목 이름
	private String MakeID; //등록자
	
	public void regItem(String _ItemCode,String _ItemName) {
		this.ItemCode=_ItemCode;
		this.ItemName=_ItemName;
		
		this.MakeID=Common.LoginID;
	}
	public void ShowItem() {
		System.out.println("******************");
		System.out.println("품목 코드 : "+this.ItemCode);
		System.out.println("품목 명 : "+this.ItemName);
		System.out.println("등록자 : "+Common.LoginID);
		System.out.println("******************");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
