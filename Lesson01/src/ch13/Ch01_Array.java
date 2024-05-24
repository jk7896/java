package ch13;

public class Ch01_Array {

	public static void main(String[] args) {
		//배열
		//같은 자료형의 데이터를 N개의 이상 관리하도록 제공되는 자료형
		//배열의 선언
		int[] Array=new int[5]; //5개의 물리적 공간을 사용할 int 배열
		//등록할 데이터가 정해져 있을 경우 데이터를 등록하면서 배열 생성
		int[] Array1=new int[] {10,20,30,40,50}; 
		int[] Array3 = new int[10];
		
		//split 이라는 기능을 이용하여 배열을 생성
		String sValue[] = "안,녕,하,세,요".split(",");
		
		//배열에 할당 된 index보다 큰 index의 값은 호출 할 수 없다.
		int Value4=Array1[2]; //iValue2 배열의 2번 index값을 ivalue할당
		//iValue = Array1[10]; //런타임 오류 발생 index 
		
		System.out.println("#################문자 배열 결과##############");
		char[]alpabets = new char[26];
		char ch='A';
		
		for (int i = 0 ; i < alpabets.length ; i++) 
		{
			alpabets[i]= ch++; // 후위 증가 A부터 할당
		}
		for (int i = 0 ; i<alpabets.length; i++)
		{
			System.out.println(alpabets[i]+","+ (int)alpabets[i]);
		}
		
		System.out.println("#################문자 배열 결과(개선for문)##############");
		for(char alpha:alpabets ) {
			System.out.println(alpha+","+(int)alpha);
		}
	}
	

}
