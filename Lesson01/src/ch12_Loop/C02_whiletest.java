package ch12_Loop;
import java.util.*;
public class C02_whiletest {




		public static void main(String[] args) {
			//숫자를 입력
			//홀수 인지 짝수 인지판별
			//0을 입력시 프로그램을 종료
			int i=0;
			while(true) {
			System.out.println("숫자를 입력하세요(0이면 프로그램 종료)");
			Scanner sc = new Scanner(System.in);
			int iNum= sc.nextInt();
			if (iNum ==0 ) {
				System.out.println("종료했습니다. 총 횟수 : " + i);
				break;
			}
			else if (iNum%2==0) {
				System.out.println("짝수입니다.");
				i++;
			}
			else {
				System.out.println("홀수입니다.");
				i++;
			}
		}
			
		}
	}

