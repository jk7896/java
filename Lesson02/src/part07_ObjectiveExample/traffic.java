package part07_ObjectiveExample;

public class traffic {

	public static void main(String[] args) {
		//학생 객체
		Person studentB = new Person("범수",10000);
		Person studentH = new Person("효신",8000);
	//김범수가 25번버스를 탈때
	//>25번 버스 객체
	Bus bus25 = new Bus(25);
	//>김범수가 25번 버스를 탄다.
	Subway subwayNum2 = new Subway(2);
	
	studentB.takeBus(bus25);
	
	studentH.takeSubway(subwayNum2);
	
	studentB.showInfo();
	
	studentH.showInfo();
	
	bus25.showBusInfo();
	
	subwayNum2.showSubwayInfo();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
