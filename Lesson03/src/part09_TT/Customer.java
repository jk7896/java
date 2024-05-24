package part09_TT;

// 고객의 정보를 관리하는 클래스 
public class Customer {
	
	// 클래스 변수 
	private String sCustName; 		// 고객이름
	private int    iCustID; 		// 고객 ID
	protected String sCustomerGrade;  // 고객 등급
	
	protected int bonusPoint;    // 적립한 보너스 포인트 
	protected double bonusRatio; // 포인트 누적 비율 ( 결제 금액에 따라 포인트 누적 )
	// protected : 상속 받은 자식 클래스만 사용 할수 있도록 접근 제한.
	
	
	// 프로퍼티 멤버
	public String getsCustName() {
		return sCustName;
	}

	public void setsCustName(String sCustName) {
		
		
		this.sCustName = sCustName;
	}

	public int getiCustID() {
		return iCustID;
	}

	public void setiCustID(int iCustID) {
		this.iCustID = iCustID;
	}

	public String getsCustomerGrade() { 
		return sCustomerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}
	 
	// 메서드 멤버  

	// 결제 금액에 따라서 포인트 누적 하고 결제할 금액을 반환 하는 메서드 
	public int calPrice(int _price)
	{	
		this.bonusPoint += _price * this.bonusRatio; // 적립 의 역할은 
		return _price;
	}
	
	// 고객의 현재 정보를 확인하는 메서드 
	public String ShowCustomerInfo()
	{
		return this.sCustName +  " 고객의 등급은 " + this.sCustomerGrade + " 이고 적립금은 " 
			   + this.bonusPoint + " 입니다.";
	}
	
 
 
	// 생성자 멤버
	public Customer(String _Name, int _Id)
	{
		this.sCustomerGrade = "GUEST";
		this.bonusRatio = 0.01; // 구입금액의 0.01 % 를 적립 
		this.bonusPoint = 500; // 보너스 기본 포인트 
		this.sCustName = _Name;
		this.iCustID = _Id;

	}
}
