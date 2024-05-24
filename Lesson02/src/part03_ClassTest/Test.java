package part03_ClassTest;

public class Test {
	int tall;
	int weight;
	String flag;
	String name;
	int age;
	
	public Test() {
		tall=0;
		weight=0;
		flag="";
		name="";
		age=0;
	}
	//생성자 멤버
public Test(int _tall,int _weight,String _flag,String _name,int _age) {
	//특정 코드 블럭 안에서만 사용 할 수 있는 변수 (지역변수)
	//객체를 생성할때 객체의 특징을 나타낼 수 있는 정보를 전달 받아 초기화
	this.tall=_tall;
	this.weight=_weight;
	this.flag=_flag;
	this.name=_name;
	this.age=_age;
	System.out.println("키가 "+tall+"이고 몸무게가 "+weight+"인 "+ flag +"이 있습니다."+ " 이름은 "+name+"이고 나이는 "+age+"입니다.");
}
	public String Show()
	{
		return "키가 "+tall+"이고 몸무게가 "+weight+"인 "+ flag +"이 있습니다."+ " 이름은 "+name+"이고 나이는 "+age+"입니다.";
	}


}