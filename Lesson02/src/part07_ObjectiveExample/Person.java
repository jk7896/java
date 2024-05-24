package part07_ObjectiveExample;

public class Person {
	
	String Name; //학생이름
	int money; //가지고 있는돈
	
	public Person(String studentName, int money) {
		this.Name = studentName;
		this.money = money;
	}
	
	//버스를 탈때 할당 
	public void takeBus(Bus bus) {
		bus.take(1600);
		this.money -= 1600;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -=1200;
	}
	
	
	public void showInfo() {
		System.out.println(Name+"님의 남은 돈은 " + money + "원 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
