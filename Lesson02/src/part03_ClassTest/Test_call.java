package part03_ClassTest;

public class Test_call {

	public static void main(String[] args) {
		//1.person 객체생성
		//2.person 객체의 데이터 표현 메소드 호출
		Test ts=new Test();
		ts.tall=174;
		ts.weight=78;
		ts.flag="남성";
		ts.name="김범수";
		ts.age=41;

		System.out.println("키가 "+ts.tall+"이고 몸무게가 "+ts.weight+"인 " + ts.flag+"이 있습니다. 이름은 "+ts.name+"이고 나이는 "+ts.age+"입니다.");
		
		ts.tall=180;
		ts.weight=75;
		ts.flag="남성";
		ts.name="박효신";
		ts.age=42;
		System.out.println("키가 "+ts.tall+"이고 몸무게가 "+ts.weight+"인 " +ts.flag+"이 있습니다. 이름은 "+ts.name+"이고 나이는 "+ts.age+"입니다.");
		
		
		Test Kim=new Test(174,78,"남성","김범수",41);
		Test Park=new Test(180,75,"남성","박효신",42);
		//각 클래스의 메소드를 이용하여 객체의 데이터를 표현 하는 방식
		System.out.println(Kim.Show());
		
	}

}
