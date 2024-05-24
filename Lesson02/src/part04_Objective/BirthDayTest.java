package part04_Objective;

public class BirthDayTest {

	public static void main(String[] args) {
		Birthday Bd = new Birthday(); 
		Bd.Setyear(2024);
		//System.out.println(Bd.Getyear());
		Bd.setMonth(12);
		Bd.setDay(31); 
		
		Bd.ShowBitrhDayInfo(); // 출생 정보 를 볼수있는 기능. 
		// public 으로 공개 시 변질 우려있는데이터는 매번 검증 로직을 추가 
		// 해야한다.
		int a = 10000;
		Bd.year_T =  a < 3000 ? a : 0;
		
		// setter 메서드에 검증로직을 추가하면 이 기능을 사용하는 모든 
		// 입력되는 데이터가 변질 되었는지 검증 하는 로직을 수행하게 된다.
	}

}
