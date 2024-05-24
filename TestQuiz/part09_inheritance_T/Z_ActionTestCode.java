package part09_inheritance_T;

import java.util.ArrayList;

public class Z_ActionTestCode {

	public static void main(String[] args) {
		/*
		Customer cust_Kim = new Customer("김범수",10000);
		System.out.println(cust_Kim.ShowCustomerInfo()); 
		 
		VIPCustomer cust_Park = new VIPCustomer("박효신", 10001); //  VIP 클래스 의 객체 
		System.out.println(cust_Park.ShowCustomerInfo()); 
		*/
		
		// VVIP 클래스 를 생성해서 새로운 등급 만들기
		// 결제금액의 할인율 : 12% , 적립율 : 7%
		
		// 모든 고객의 결제 금액 과 고객 정보 확인하기 로직. 필요한데 
		// 고객 객체를 일일이 만들어 기능을 호출하기에는 많은 코드가 필요하다. 
		// 부모클래스 로 upcating 하여 부모 클래스의 이름으로 자식 클래스의 기능을 수행하게 하면
		// 코드를 간결화 할 수 있다. 
		
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
