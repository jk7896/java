package part08_Test;

public class Taxi {
	
	int TaxiNumber;
	int Smoney;
	int Tmoney;
	
	public Taxi(int TaxiNumber) {
		this.TaxiNumber =TaxiNumber;
	}
	
	
	public void Stake(int money) {
		//택시 탑승하여 비용감소
		this.Smoney -=money;

	}
	public void take(int money) {
		//택시 수입 증가
		this.Tmoney +=money;

	}
	public void showTaxiInfo() {
		System.out.println(TaxiNumber +"번 택시의 수입은 "+Tmoney + "원 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
}
