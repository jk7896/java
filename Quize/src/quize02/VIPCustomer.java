package quize02;

// Customer 의 기능을 모두 상속 받는 VIPCustomer 클래스 
public class VIPCustomer extends Customer{
 
	private int agentID; 	 	  // 담당직원 ID
	protected double DiscountRatio; // 할인 비율
	
	
	// 생성자 
	public VIPCustomer(String _Name , int _ID)
	{ 
		super(_Name, _ID); 
		this.DiscountRatio = 0.1; // 할인비율 추가.
		 
		bonusRatio = 0.05; 
		super.sCustomerGrade = "VIP"; 
	}
	
	public void ShowChildAddress()
	{
		System.out.println(this);
	}
	
	
	// VIP 고객의 결제 메서드
	@Override 
	public int calPrice(int _price)
	{	
		super.bonusPoint += _price * this.bonusRatio; // 적립 의 역
		
		return _price - (int)(_price * DiscountRatio);
	}
}
