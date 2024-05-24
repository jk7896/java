package ch10;
import java.util.Scanner;

public class c05_TEST {

	public static void main(String[] args) {
				// 두수 중 큰 수를 출력하는 프로그램을 작성하세요.
				//1. 두수를 받아서 비교하는 로직. 기능
					// 두수를 입력받는 기능
					//두수를 담아둘 변수
				//2. 두수를 비교해서 결과를 출력하는 기능
					// 조건부 연산 처리
					// 결과를 출력하는 기능
				//1.변수 지정
				int iResult; // 결과값 표현
				int iFvalue; // 첫번째 값
				int iSvalue; // 두번째 값
	
				//3. 두수를 입력 받는 기능 구현
				Scanner sc=new Scanner(System.in);
				for (int i =0 ; i<2; i++) {
					System.out.println("숫자를 입력하세요");
					System.out.println("입력 1 : ");
					int x = sc.nextInt();
					if (x%2==0) {
						System.out.println("짝수입니다.");
					}
					else {
						System.out.println("홀수입니다.");
					}
				}
					

		}
}
