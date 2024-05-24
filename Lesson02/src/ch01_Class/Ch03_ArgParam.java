package ch01_Class;
import java.util.*;
public class Ch03_ArgParam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력");
		int i=sc.nextInt();
		System.out.println("두번째 숫자 입력");
		int j=sc.nextInt();
		add(i,j);

	}
	static void add(int iValue,int iValue2) {
		//두수의 합을 연산 로직
		System.out.println("합 : "+(iValue+iValue2));
	}

}
