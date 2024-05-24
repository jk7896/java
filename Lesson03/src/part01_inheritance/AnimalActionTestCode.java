package part01_inheritance;

public class AnimalActionTestCode {

	public static void main(String[] args) {
		
		//사람, 고양이, 강아지의 기능을 구현하기
		Human man = new Human();
		System.out.println("◆사람입니다");
		man.Eat();
		man.Walk();
		man.Sleep(); //7. 동물의 공통 기능을 구현없이 수행 할 수 있다.
		man.Think(); //8. 자식 클래스에서만 구현한 기능을 따로 수행 할 수 있다.
		man.Jump();
		
		cat cat =new cat();
		System.out.println("◆고양이입니다");
		cat.Eat();
		cat.Sleep(); //7. 동물의 공통 기능을 구현없이 수행 할 수 있다.
		cat.Think(); //8. 자식 클래스에서만 구현한 기능을 따로 수행 할 수 있다.
		cat.Jump();
		
		Dog dog =new Dog();
		System.out.println("◆강아지입니다");
		dog.Eat();
		dog.Sleep(); //7. 동물의 공통 기능을 구현없이 수행 할 수 있다.
		dog.Think(); //8. 자식 클래스에서만 구현한 기능을 따로 수행 할 수 있다.
		dog.Jump();
		
		Turtle tur =new Turtle();
		System.out.println("◆거북이입니다");
		tur.Eat();
		tur.Sleep(); //7. 동물의 공통 기능을 구현없이 수행 할 수 있다.
		tur.Think(); //8. 자식 클래스에서만 구현한 기능을 따로 수행 할 수 있다.
		tur.Move();
		// 10. 거북이는 점프기능이 없을때 선택적으로 사용하지 않을 수 있다.
		
		
		
		
		

	}

}
