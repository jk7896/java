package ch12_Loop;
import java.util.*;
public class C03_DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iInputValue;
		int iSum=0;
		do
		{
			System.out.println("값을 입력하세요.");
			iInputValue = sc.nextInt();
			iSum+=iInputValue;
			System.out.println("누적 값은 : " + iSum + "입니다.");
		}
		while(iInputValue !=0 );
		System.out.println("총 누적 값은 : " + iSum + "입니다.");

	}

}
