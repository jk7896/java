package part07_ObjectiveExample;

public class Bus {
	int busNumber; //버스번호
	int passengerCount; //버스로 승객이 지불한 금액
	int money;
	
	public Bus(int busNumber) {
		this.busNumber =busNumber;
	}
	
	//손님승차
	public void take(int money) {
		//버스 누적 비용 증가
		this.money +=money;
		//승객 수 증가
		passengerCount++;
	}
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 "+passengerCount + "명 이고, 수입은 " + money +"원 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
