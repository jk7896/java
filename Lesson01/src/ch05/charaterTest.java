package ch05;

public class charaterTest {

	public static void main(String[] args) {
		char ch1='A'; //문자를 할당, ''는 문자 1글자를 표현
					//char 라는 2byte (16bit)의 메모리 공간을 ch1이라는 주소이름으로 만들고 A라는 문자를 
					//2진수로 인코딩하여 ch1의 방에 할당 해 두는 변수를 생성
					//문자 대입시 'A'의 유니코드 값을 2진수(65)
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		char ch3 = 67;
		System.out.println(ch3);
		System.out.println((int)ch3);
		
		char ch5 = '한';
		char ch6= '\uD55C';
		System.out.println(ch5);
		System.out.println(ch6);
		//나열된 문자를 관리하는 데이터 유형
		//기본 데이터 크기를 가지고 있지 않는 자료형
		//문자 들의 나열(리터럴) 이 초기화 (할당)되는 순간 크기가 결정.
		String sMessage = "안녕하세요";

	}

}
