package ch01_Class;

import java.util.Scanner;

public class Ch03_Function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력");
		int i=sc.nextInt();
		System.out.println("두번째 숫자 입력");
		int j=sc.nextInt();
		//함수의 반환유형
		//void : 함수를 호출 한곳으로 결과를 반환하지 않음
		System.out.println(Doadd(i,j));
		print();
		//함수의 반환 유형2
		//특정 데이터를 반환하는 유형 ,String,int ...등등의 자료형을 반환
		//return 키워드, 반환 할 데이터 유형에 대한 자료형을 명시

	}
	static void print() {
		System.out.println("문자열만 출력합니다.");
	}
	static String Doadd(int iValue,int iValue2) {
		return ("두수의 합은 " + (iValue +iValue2) + "입니다");
	}

}
