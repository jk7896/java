package part09;

public class UserMaster {

	private String UserID;
	private String UserName;
	private String MakerID;
	
	public void regUser(String _UserID, String _UserName) {
		this.UserID = _UserID;
		this.UserName = _UserName;
		
		this.MakerID = Common.LoginID;
	}
	
	public void showUser() {
		System.out.println("*******************");
		System.out.println("사용자정보");
		System.out.println("사용자 ID : " + this.UserID);
		System.out.println("사용자 명 : " + this.UserName);
		System.out.println("등록자 : " + Common.LoginID);
		System.out.println("*******************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
