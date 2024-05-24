package part02;

public class _TestCode {

	public static void main(String[] args) {

	Customer customerKim = new Customer("김범수",11111);
	
		customerKim.bounsPoint = 500;
//		System.out.println(customerKim.showCustomerInfo());
//		
//		//VIP 고객 생성
//		VIPCustomer customerPark = new VIPCustomer("박효신",11112);
//		
//		customerPark.bounsPoint = 500;
//		System.out.println(customerPark.showCustomerInfo());
		
		
		
		int price =customerKim.calPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + "결제 금액 : " + price);
		
		VIPCustomer customerPark = new VIPCustomer("박효신", 11112);
		customerPark.bounsPoint=500;
		
		int price2 = customerPark.calPrice(1000);
		System.out.println(customerPark.showCustomerInfo() + "결제 금액 : " + price2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
