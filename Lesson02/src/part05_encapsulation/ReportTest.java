package part05_encapsulation;

public class ReportTest {

	public static void main(String[] args) {
		//캡슐화
		//클래스 내부
		
		//클래스를 배표한 사람. 개발자의 의도대로 정확히 구현한경우
		MakeReport mr=new MakeReport();
		mr.Message="안녕하세요";
		mr.Unit="★";
		mr.SetUnit();
		mr.SetMessage();
		mr.SetUnit();
		
		//하지만 개발 목적을 이해 하지 못한 사람은 똑같은 클래스의 기능이지만
		//다른 방향으로 잘 못 결과를 도출 할 수 있다.
		//잘 못 출력한 예제
		mr.SetMessage();
		mr.SetUnit();
		//따라서 일련의 기능을 순차적으로 수행해야 올바른 결과를 도출하는 클래스일 경우
		//해당 기능을 순차적으로 클래스 내부에서 수행하고 외부에서는 접근 할 수 있는 메소드를 일부(한가지)만 공객하여
		//프로그램을 의도대로 구현 할 수 있다.
		
		System.out.println();
		//캡슐화가 된 클래스 
		MakeReport_capsul mrc=new MakeReport_capsul();
		mrc.Setmessage("안녕하세요");
		mrc.SetUnit("★");
		mrc.Doprint();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
