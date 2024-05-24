package part09;

public class VVIPCustomer extends VIPCustomer {
	
	public VVIPCustomer(String _customerName, int _customerID, int _agentId) {
		super(_customerName, _customerID, _agentId);
		customerGrade ="VVIP";
		bounsRatio = 0.07;
		salesRatio = 0.12;
	}


	
	public int calcPrice(int price) {
		bounsRatio +=price * bounsRatio;
		return price - (int)(price * salesRatio);
	}
	
	

}
