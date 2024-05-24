package ch10;

public class c01_operator {

	public static void main(String[] args) {
		System.out.println("-------사칙연산--------");
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5/2); //몫
		System.out.println(5%2); //나머지
		//같은 연산자 이지만 데이터 자료형에 따라 다른 결과를 도출
		System.out.println("5"+"2");// 문자열을 합치는 결과
		
		//2.복합 대입 연산자
		System.out.println("-------복합 대입 연산자--------");
		//변수 자신의 값에 연산 결과를 갱신하여 할당
		int iValue = 10;
		iValue = iValue +2;
		System.out.println(iValue);
		iValue+=2;
		System.out.println(iValue);
		
		//음수로 갱신 후 표현
		iValue *= -1;
		System.out.println(iValue);
		
		//몫의 복합 대입
		iValue /=7;
		System.out.println(iValue);
		
		//나머지의 복합 대입
		iValue %=5;
		System.out.println(iValue);
		
		//3.증감 연산자
		System.out.println("-------증감연산자---------");
		//전위 증가
		//연산 처리후 결과를 갱신 하고 값을 유지
		//후위 증가
		//연산 처리후 로직이 흘러갔을때 값을 갱신
		int iFirst =10;
		int iSecond =++iFirst;
		System.out.println(iSecond);
		System.out.println(iFirst);
		
		int iFirst1 =10;
		int iSecond1 =iFirst1++;
		System.out.println(iSecond1);
		System.out.println(iFirst1);
	}

}
