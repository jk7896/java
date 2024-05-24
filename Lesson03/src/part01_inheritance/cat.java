package part01_inheritance;

//5.상속 및 키워드 (부모 클래스의 모든 기능을 그대로 가져가겠다는 뜻)
public class cat extends Animal {
	
	/*
	//2-1 동물의 특징을 가진 고양이도 모든 기능을 구현 하면서 고양이 특징을 구현
	public void Walk()
	{
		System.out.println("두발로 걷는다.");
	}
	public void Sleep()
	{
		System.out.println("잠을 잔다.");
	}
	public void Eat()
	{
		System.out.println("먹는다.");
	}
	*/
	
	//3.같은 기능 사람과 고양이 별로 구현했지만 클래스 마다 다른 이름의 메소드로 구현 할 가능성이 있다.
	//반복되는 코드가 많아지면서 효율성이 떨어진다.
	//ex)잠을 자기 전에 물을 먹는다. 로 수정하기 위해서는 구현한 모든 메소드를 수정해야한다.
	
	//4. 공통적으로 수행하는 기능을 Animal이라는 클래스에 구현해 두고 상속을 받아 똑같이 사용함으로써 유지 보수성과
	//프로그램의 확장성을 가질수 있다.
	
	
	
	
	
}

