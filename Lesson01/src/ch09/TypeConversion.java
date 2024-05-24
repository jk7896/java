package ch09;

public class TypeConversion {
//형변환: 프로그램 연산 처리를 위해 데이터 형식을 일치화 하는 작업.
//묵시적(암시적) 형변환 : 작은 자료형 -> 큰자료형, 더 정밀한 자료형으로 변환할 경우
//명시적 형변환 : 큰 자료형 -> 작은 자료형, 명시적으로 변환할 타입을 지정 해 주어야 한다.
	
	public static void main(String[] args) {
		byte bNum=10;
		int iNum =bNum;
		
		int iNum1 =20;
		float fNum = iNum1;
		
		int iNum2 =10;
		byte bNum2 = (byte)iNum2;
		
		double dNum =3.14;
		int iNum3 = (int)dNum;
		
		double dNum1 = 1.2;
		float fNum1 = 0.9F;
		
		int iNum4 = (int)dNum1 + (int)fNum1;
		int iNum5= (int)(dNum1+fNum);
		System.out.println(iNum4);
		System.out.println(iNum5);
		
		//문자열의 숫자 형변화
		//숫자로 변환 할 수 없는 문자일 경우
		//컴파일러는 문자의 숫자 변환 여부 까지는 검증하지 않는다.
		//그래서 프로그램이 실행 될때 오류를 반환한다.
		//컴파일 오류 : 컴파일 시 오류 검출
		//런타임 오류 : 프로그램 실행시 오류 검출
		String str = "123";
		//1. byte로 변환 (별도의 기능이 필요)
		byte bValue = Byte.parseByte(str);
		System.out.println(bValue);
		
		int iValue = Integer.parseInt(str);
		System.out.println(iValue);
		
		//2.Boolean의 형변환
		//True가 아인 문자열은 모두 false로 할당된다.
		String strBool ="true";
		boolean boValue = Boolean.parseBoolean(strBool);
		System.out.println(strBool);
		
		
	}

}
