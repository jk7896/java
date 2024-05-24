package part02;

// customer의 기능을 모두 상속 받는 VIPCustomer 클래스 
public class VIPCustomer extends Customer {

	//고객의 기본 기능은 그대로 가지고 VIP고객에만 필요한 기능만 추가
	private int agentID; //담당직원 ID
	double salesRatio; //할인 비율
	
	public String CustomerGrade;
	
	public VIPCustomer(String _Name,int _ID)
	{
		super(_Name,_ID);
		salesRatio = 0.1; //할인비율 추가
		//부모클래스가 가지고 있는 데이터변수에 접근
		//super : 부모 클래스의 기능 또는 변수를 지칭
		super.bounsRatio = 0.05;
		// 쉐도잉(가려진다.) : 제일 가까운 곳을 들어감(Stack에 들어 간다.) super가 없으면 
		customerGrade="VVIP";
		//super.customerGrade = "VIP";
		/*쉐도잉 : 부모클래스와 자식 클래스 간에 동일한 명칭의 변수, 
		 * 기능이 구현되어 있을지우,자석 플러스의 변수 또는 기능을 기능을 우선 순위를 적용 했다.*/
		//오버로딩 같은이름으로 많이 만들수 있는것
		//생성자가 멤ㅂ저의 오버로딩 상태 (메소드 이름은 같게 하고 인수와 인자만 차이를 두어 같은 이름을 호출 할 수 있도록함).
	}
	
	public int getAgnetID()
	{
		return agentID;
	}

	@Override
	public int calPrice(int price) {
		bounsPoint +=price * bounsRatio;
		return price - (int)(price * salesRatio);
	}
	

	
	
	
	
	
	
	
	
	
	
}
