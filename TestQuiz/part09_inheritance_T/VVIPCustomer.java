package part09_inheritance_T;

// Customer 의 기능을 모두 상속 받는 VIPCustomer 클래스 
public class VVIPCustomer extends VIPCustomer{
   
	// 생성자 
	public VVIPCustomer(String _Name , int _ID)
	{ 
		super(_Name, _ID); 
		super.DiscountRatio  = 0.12; // 할인비율 추가.
		super.bonusRatio     = 0.07; 
		super.sCustomerGrade = "VVIP"; 
	}  
}
