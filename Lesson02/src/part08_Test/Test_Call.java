package part08_Test;

public class Test_Call {

	public static void main(String[] args) {
		
		
		//학생 객체
		Person per = new Person("이수",20000);
		Taxi taxi=new Taxi(678);
			
		
		per.Taxitake(taxi);
		per.showInfo();
		taxi.showTaxiInfo();
		per.Taxitake(taxi);
		per.showInfo();
		taxi.showTaxiInfo();
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
