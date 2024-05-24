package ch10;

public class c02_RelationalOP {

	public static void main(String[] args) {
		//관계 연산자
		// 두항을 비교하여 참일 경우 True 거짓일 경우 False를 반환
		
		int iValue=10;
		int iValue2=5;
		System.out.println(iValue>iValue2);
		System.out.println(iValue<iValue2);
		System.out.println(iValue<=iValue2);
		System.out.println(iValue>+iValue2);
		System.out.println(iValue==iValue2);
		System.out.println(iValue!=iValue2);
		
		//  True / False 를 담을 수 있는 자료형
		boolean bResult = iValue > iValue2;
	}

}
