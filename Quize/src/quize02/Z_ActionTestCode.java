package quize02;

import java.util.ArrayList;

public class Z_ActionTestCode {

	public static void main(String[] args) { 
		ArrayList<Customer> custmoerList = new ArrayList<Customer>();
		custmoerList.add(new Customer("김범수",10000));
		custmoerList.add(new VIPCustomer("박효신",10001));
		custmoerList.add(new VVIPCustomer("윤종신",10002));
		
		
		for(Customer cus : custmoerList)
		{
			System.out.println(cus.ShowCustomerInfo());
		}
	} 
}
