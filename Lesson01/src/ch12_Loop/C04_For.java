package ch12_Loop;

public class C04_For {

	public static void main(String[] args) {
		/*
		//for
		//특정 조건ㅇ르 만족하는 동안 조건을 변화 시켜 로직을 수행 반복문
		//1. for 문의 기본용법
		// 1~10까지의 누적 합을 구하는 반복문
		int iSum=0;
		for(int i = 0 ; i<=10 ; i++) {
			iSum += i;
		}
		System.out.println(iSum);
		*/
		/*
		//2. 초기값을 외부에서 지정하고 반복
		int iValue =5;
		//초기값 5부터 10가지 반복, 한 반복 당 초기값에서 2씩 증가.
		for (int i =0; true ;iValue+=2)
		{
			System.out.println(iValue);
		}
		*/
		/*
		//3.초기값과 조건이 없이진행
		//무한루프 (종료 조건이 필요)
		int i=0;
		for(;;i++)
		{
			System.out.println(i);
			if(i==100);
			{
				break; //i가 1 씩 증가하는데 i가 100일 경우 종료
			}
		}
		*/
		/*
		//4. 증가식도 제외
		int i = 0;
		for(;;) {
			//무한루프 Do-while와 동일
			//종료 하는 조건이 필요
			i++;
			if(i== 100) {
				break;
			}
		}
		*/
		
		//5.continue;
		//반복문을 종료 하지 않고 다음 조건을 증가 시켜 수행 하도록 하는 키워드.
		for (int i=0; i<=100;i+=2)
		{
			if(i % 6 == 0)
			{
				continue;
			}
			if(i>30)break;
			System.out.println(i);
		}
		
	}

}
