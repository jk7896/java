package ch11;
import java.util.*;

public class c01_if_else {

	public static void main(String[] args) {
		//나이를 입력받아 미성년자 인지 판단하는 프로그램작성
		Scanner sc = new Scanner(System.in);
		int iAge; //입력받은 나이
		System.out.println("나이를 입력하세요 : ");
		iAge = sc.nextInt();
		//비교 판단 흐름제어 구문
		if( iAge >= 20) {
			//조건이 참일때
			System.out.println("미성년자가 아닙니다.");
		}
		else {
			//조건이 거짓일때
			System.out.println("미성년자 입니다.");
		}
		System.out.println("프로그램을 종료 합니다.");	
	
		
	}

}
