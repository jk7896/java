package part09;

public class Customer {
	
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
// 상속 한 클래스에서만 접근을 허용
	 protected int customerID;
	 protected String customerName;
	 protected String customerGrade;
	
	protected int bounsPoint;
	protected double bounsRatio;
	
	//클래스 생성멤버가 있기는 한데 인자,인수를 가지고 있다면 아무것도 없는 생성자를 호출하여 사용 할 수 없다.
	
 	public Customer(String _Name, int _ID)
	{
		customerID=_ID;
		customerName=_Name;
		customerGrade = "GUEST";
		bounsRatio = 0.01;
	}	
	
	public int calPrice(int price) 
	{
//		if (this.customerGrade=="GUEST")
//		{
//		this.bounsPoint += price * this.bounsRatio;
//		}
//		else if (this.customerGrade=="VIP")
//		{
//		this.bounsPoint += price * 0.05;
//		price = price - (int)(price * 0.01);
//		}
		//만약에 VIP등급이 아닌 여러 단계의 등급이 만들어 질 경우
		//Customer 클래스에서 모든 경우를 구현하기에는 코드가 복잡해지며
		//새로운 등급의 메소드 기능을 구현하기 위해 필요한 변수들이 복잡하게 많아진다.
		//ex) 할인비율이 새로추가 고객 담당자가 새로 추가 되어야한다.
		this.bounsPoint += price * this.bounsRatio;
		return price;
		
	}
	
	public String showCustomerInfo()
	{
		return customerName + "님의 등급은 " + customerGrade + "입니다. 누적 포인트 : "+ bounsPoint;
	}
	
	//프로퍼티 멤버

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		//값이 세팅되면 안될 경우 처리하는 로직 구련해 놓는다면
		//이 클래스와 이 메소드를 사용하는 모든 로직에서
		//검증 로직을 수행 할 수 있다.
		// set get은 수정권환,받는권한을 정해 줄 수 있다.
		return customerGrade;
	}

	public int getBounsPoint() {
		return bounsPoint;
	}

	public double getBounsRatio() {
		return bounsRatio;
	}
	
	
	
	
	
	
	
	
	
	
	

}
