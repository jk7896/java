package ch07;

public class LocalVariavle {

	public static void main(String[] args) {
		//var
		//특정 자료형을 지정하지 않고 
		//리터럴을 할당 시 그 자료형이 결정된다.
		var i =10;
		var j=10.0
				;
		var str="hello";
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		//.한번 초기화되어 데이터를 새로 넣을 수 있다.
		//.다른 형식으로는 새로 넣을수 없다.
		//한번 초기화(변수애 최초 1회 데이터가 할당되는 과정)
		//되면 그 특성이 고정되어 변하지 않는다.
		
		str="test";
		System.out.println(str);


	}

}
