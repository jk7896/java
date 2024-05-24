package ch11;
import java.util.*;
public class c02_if_elseif_else {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int age= sc.nextInt();
		int charge;
		String sGubun;
		/* if와 else if  else는 하나의 분기 흐름입니다.
		if (age<8)//8미만 일때 실행
		{
			charge=1000;
			//System.out.println("미취학 아동입니다.");
			sGubun="미취학 아동입니다.";
			
		}
		else if (age < 14 ) //14미만 일때 실행
		{
			charge=2000;
			//System.out.println("초등학생입니다.");
			sGubun="초등학생입니다.";
		}
		else if (age <20 )//20미만 일 때 실행
		{
			charge = 2500;
			//System.out.println("중, 고등학생입니다.");
			sGubun="중, 고등학생입니다.";
		}
		else
			
		{
			charge = 3000;
			//System.out.println("일반인 입니다.");
			sGubun="일반인 입니다.";
		}
		//System.out.println("입장료는" + charge +"입니다.");
		System.out.println("입장한 사람은 "+ sGubun + "그리고 경비는 " + charge + "원 입니다.");
		 */
		//if로 시작하는 구문으로 하나의 분기 흐름을 생성하므로 if가 연속적으로 사용될 경우는 주의하여 사용해야함.
		//이유는 if가 새로 시작하는 곳에서 분기의 흐름을 새로 생성하기 때문 
		if (age<8)//8미만 일때 실행
		{
			charge=1000;
			System.out.println("미취학 아동입니다.");
			
		}
		if (age < 14 ) //14미만 일때 실행
		{
			charge=2000;
			System.out.println("초등학생입니다.");
		}
		if (age <20 )//20미만 일 때 실행
		{
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		else
			
		{
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		
		System.out.println( charge + "원 입니다.");
		
	}

}
