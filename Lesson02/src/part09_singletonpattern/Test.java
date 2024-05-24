package part09_singletonpattern;

public class Test {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
    	System.out.println(company2);
		
		company1.MemberCount=10;
		System.out.println(company2.MemberCount);
		
		

	}

}
