package part08_Test;

public class Person {

	String Name;
	int money;
	
	public Person(String Name,int money) {
		this.Name=Name;
		this.money=money;
	}
	
	public void Taxitake(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	
	public void showInfo() {
		System.out.println(Name+"님의 남은 돈은 " + money + "원 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
