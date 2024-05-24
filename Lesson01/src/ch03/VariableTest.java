package ch03;

public class VariableTest {
//변수
	//프로그램 내에서 필요하 데이터를 담을수 있는 그릇
	//일정한 크기의 메모리에 해당 값을 대입(할당) 해 두고 후속 로직에서
	//간편하게 변수의 이름만으로 해당 값 또는 연산 값을 저장
	public static void main(String[] args) {
		//초기화
		//특정 변수 또는 객체에 신규값을 최초 1회 등록 하는 과정
		int age;
		age=10;
		
		int level =10000;
		System.out.println(age);
		System.out.println(level);
		
		//리터럴 - 변수에 대입하려는 값.
		// JAVA의 정수 리처럴은 기본 int형
		//int iValue1 = 1234567890L;
		//long iValue2 = 1234567890L;
		long iValue3 = 1234567890L;
		for(int i=1;i<=10;i++) {
			if (i>=10) {
				System.out.println("10이상임");
			}
			else {
				System.out.println("10이하임");
			}
		}
	}
}
