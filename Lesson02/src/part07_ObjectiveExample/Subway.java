package part07_ObjectiveExample;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	//손님 승차
	public void take(int money) {
		//지하철 누적 요금증가
		this.money += money;
		//지하철 승객 수 증가
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber +"번 지하철의 승객은 " +passengerCount+ "명 이고 수입은 "+money + "원 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
