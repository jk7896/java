package ch10;
import java.util.Scanner;

public class c04_ConditionTest {

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
		
		//2.프로그램의 목적 나열
		int max;
		//3. 두수를 입력 받는 기능 구현
		Scanner sc=new Scanner(System.in);
		for (int i =0 ; i<=1 ; i++) {
			System.out.println("입력 받은 두 수중 큰 수를 출력하세요");
			System.out.println("입력 1 : ");
			int x = sc.nextInt();
			System.out.println("입력 2 : ");
			int y= sc.nextInt();
			
			max = (x>y) ? x:y ;
			System.out.println(max);
			
			if (x>y) {
				System.out.printf("처음으로 입력된 %d 값이 큽니다.\n",max);
			}
			else if (x==y) {
				System.out.printf("처음으로 입력된 %d 값과 두번째 입력된 %d 값이 같습니다.\n",max,max);
			}
			else {
				System.out.printf("두번째로 입력된 %d 값이 큽니다.\n",max);
			}
		}
			

	}

}
