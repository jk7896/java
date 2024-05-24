package part04_Objective;
import java.util.*;
public class Birthday {
	// 접근 제한자 
	// 외부에서 클래스를 사용하는 사용자가 클래스의 멤버에 접근할 수 있는 권한을 제어
	// private : 클래스 내부에서만 접근 가능 (외부에서는 접근 X)
	// public  : 어디에서든 접근 가능 
	// protected : 동일한 상속 관계에서만 접근
	// 접근제한자를 명시 하지 않을경우 : 동일한 패키지 내부에서만 접근 할 수 있다.
	
	// 생일 관련 변수 지정
	// 외부에서 접근 하여 데이터를 관리하지 못하도록 막음.
	private int year;
	private int month; 
	private int day; 
	
	private boolean isValid; // 유효성을 검증 할 수 있는 bool
	
	public int year_T;
	// get() / set() - 프로퍼티 (property) 멤버
	// private 으로 은닉해둔 변수 에 접근 하여 관리할 수 있도록
	// 메서드를 제공하여 데이터 검증 을 할수 있도록 하는 기법 
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		// 1 월 부터 12월 사이에 있는 데이터 만 등록되는 검증 로직 
		
		// 벨리데이션
		// 사용자가 프로그램을 개발자의 의도대로 정확히 사용할 수 있도록
		// 예외 상황을 미리 예측 하여 프로그래밍 하는 방법
		// 데이터의 변질을 막고 프로그램의 신뢰성을 높일수 있다.
		if (month <= 0 || month > 12)
		{
			System.out.println("월의 정보는 1월 ~ 12 월 사이에 입력해야 합니다.");
			isValid = false;
			return;
			
			
		}
		
		isValid = true;
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		//1.월의 고정일 수 (기존값) 확인
		//입력된 월의 정보
		int tDay; //입력되었던 월의 실제 일수
		tDay = switch(this.month) {
		case 1,3,5,7,8,10,12 ->{
			yield 31;}
		case 4,6,9,11 ->{
			yield 30;
			}
		case 2 ->{
			yield 28;
		}
		default ->{
			isValid = false;
			yield 0;
		}
			};
		if (day <= 0 || day>tDay)
		{
			isValid=false;
			System.out.println(this.month + " 월의 일수는 "+tDay+" 이내로 입력하세요");
			return;
		}

		this.day = day;
	} 

	public int Getyear()
	{
		return this.year;
	}
	
	public void Setyear(int _year)
	{
		this.year = _year;
	}
	
	// 메서드 멤버
	// 생일 정보를 표시하는 메서드 생성
	public void ShowBitrhDayInfo()
	{
		if (isValid ==  false) // !isValid
		{
			System.out.println("유효한 값을 입력 하지 않았습니다.");
			return;
		}

		System.out.println("출생 년도 : " + this.year + 
							" 출생 월 : " + this.month +
							" 출생 일 : " + this.day);
	}
}
