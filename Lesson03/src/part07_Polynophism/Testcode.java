package part07_Polynophism;

import java.util.*;
public class Testcode {

	public static void main(String[] args) {
		//다형성 구현
		//1. Animal 부모클래스를 요소로 담는 데이터 집합
		ArrayList<Animal> arrayAnimals = new ArrayList<Animal>();
		
		//cat c = new cat();
		//c.Move();
		
		arrayAnimals.add(new cat());
		arrayAnimals.add(new human());
		arrayAnimals.add(new dog());
		
		//부모의 이름으로 자식에게물려준 기능을
		//자식이 구현한 내용대로 수행
		//부모 클래스의 이름으로 N개의 자식 클래스 기능을 일괄적으로 수행 할 수 있도록 하므로 코드가 폭발적으로 간결해진다.
		for(Animal ani: arrayAnimals) {
			ani.Move();
			
		}

	}

}
