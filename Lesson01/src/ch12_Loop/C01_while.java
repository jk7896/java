package ch12_Loop;
import java.time.LocalDateTime;
import java.util.*;
public class C01_while {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 일반적인 while문
		 * 조건이 참일 경우 반복 로직을 수행한다.
		 * 무한 루프를 구현해야할 경우 자주 사용한다.
		 */
		
		int iNum = 0; //누적 해야 할 수 while을 종료할 조건이 되는수
		int iSum = 0; //누적 값이 등록 되는 결과의 수
		//1~10 까지의 누적합 값을 표현하세요.
		/*
		while(iNum <10){
			iNum++;
			iSum+=iNum;
		}
		System.out.println(iSum);
		
		int iSum2=0;
		for(int i=1 ; i<11; i++) {
			iSum2+=i;
		}
		System.out.println(iSum2);
		*/
		
		/*
		//2.무한루프
		//일정한 조건을 만족 시키기 전가지 계속 반복되는 반복문
		LocalDateTime now;
		while(true) 
		{
			now = LocalDateTime.now(); //현재 일시를 now에 할당
			System.out.println(now);
			Thread.sleep(1000);
		}
		*/
		
		//무한루프를 종료하는 break;
		/*
		iNum=0;
		while(true) 
		{
			++iNum;
			if(iNum>10)
			{
				break;
			}
			else 
			{
				System.out.println(iNum);
			}
			
		}
		*/
		//무한루프를 사용하지 않고 1~100까지 출력하기
		// ++iNum 전위 증가 표시일 경우 : 1 부터 출력
		// iNum++ 후위 증가 표시일 경우 : 0 부터 출력
		
		//프로젝트 할 때는 전위증가를 많이 사용한다.
		int i = 1;
		while (i<100) {
			i++;
			System.out.println(i);
			
		}
	}

}
