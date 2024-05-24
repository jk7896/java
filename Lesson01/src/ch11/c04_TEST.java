package ch11;
import java.util.*;
public class c04_TEST {

	public static void main(String[] args) {
		// 수를 입력 받아 2,5의 공백 임을 확인
		//2,5의 공백이 아닌경우 8의 배수임을 확인
		// > 8의 배수 일경우 첫번째 수와 합을 표현
		//1. 수를 입력 받기
		//2. 2 와 5의 공배수 인지 확인
		//3. 2와 5의 공배수 가 아니면 8의 배수인지확인
		//4. 8의 배수이면 두번째 수를 입력받기
		//4-1. 첫번째 수와 합친 결과 표현하기.
		
		System.out.println("숫자를 입력 하세요"); // 숫자를 입력
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
			if ((inum % 2 == 0) && (inum % 5 == 0)) { //2와5의 배수를 찾기
				System.out.println("숫자는 2와 5의 공배수 입니다.");
				}
			else if (inum % 8 == 0) { //2와5의 배수가 아닐때
				System.out.println("숫자는 2와 5의 공배수 아닙니다.");
				System.out.println("숫자는 8의 배수 입니다.");
				System.out.println("숫자를 한번 더 입력해주세요.");
				int inum2 = sc.nextInt();
				System.out.println("첫번째 숫자은 "+inum + "두번째 숫자은"+ inum2 +" "+ "첫번째 숫자와 두번째 숫자의 합은 "+((int)inum+(int)inum2)+"입니다." );
		}
			else {
				
				System.out.println("숫자는 2와 5의 공배수도 아니고 8의 배수도 아닙니다.");
			}

	}//자동 정렬 : ctrl + shift + F

}
