package part09;

import java.util.*;


public class TestCode {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
//		Customer custKim =new Customer("김범수",1111);
//		VIPCustomer custPark =new VIPCustomer("박효신",2222,6060);
//		VVIPCustomer custYun =new VVIPCustomer("윤종신",3333,7070);
		
		customerList.add(new Customer("김범수",1111));
		customerList.add(new VIPCustomer("박효신",2222,6060));
		
		customerList.add(new VVIPCustomer("윤종신",3333,7070));
		
		
		System.out.println("======================= 할인율과 보너스 포인 계산 =======================");
		
		for (Customer cust : customerList) {
			cust.calPrice(100000);
			System.out.println(cust.showCustomerInfo());
		}
		
		

	}

}
