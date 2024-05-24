package part09;

public class VIPCustomer extends Customer {
	private int agentID;
	double salesRatio;
	
	public VIPCustomer(String _CsName, int _CsId, int _agentId) {
		super(_CsName,_CsId);
		customerGrade ="VIP";
		bounsRatio = 0.05;
		salesRatio = 0.1;
		
		agentID=_agentId;
	}
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는"+agentID + "입니다.";
	}
	

}
