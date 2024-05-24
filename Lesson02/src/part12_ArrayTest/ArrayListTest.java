package part12_ArrayTest;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		//ArrayList
		//배열보다 유연한 데이터 집합을 관리할 수 있는 자료형
		//선형을 구성되어 연결방식으로 데이터를 관리하여 추가 / 삭제가 가능하지만 그에대한 비용이 발생한다.
		//검색을 위해 순차적으로 검색을 하므로 검색속도는 배열보다 느리다.
		//검색을 위해 순차적으로 검색을 하므로 검색속도는 배열보다 느리다.
		//배열 과 같은 자료형과 선형자료형 등 여러가지 자료형의 장/단점을 알고 프로그래밍에 적절히 사용하는것이 중요하다.
		//효율적인 프로그램 = 메모리 관리와의 싸움.
		
		//Book 클래스를 요소로 관리하는 ArrayList클래스 생성
	
	ArrayList<Book> library = new ArrayList<Book>();
	
	//요소 추가 (방이 정해져있지 않아도 언제든지 추가가 가능)
	library.add(new Book("삼국지1","경비석"));
	library.add(new Book("삼국지2","이문열"));
	
	//Book 객체의 기능을 이용하여 정보 확인
	// 0 index에 있는 book 객체를 추출하여 기능실행
	library.get(0).showBookInfo(); //삼국지, 경비석
	
	
	
	//요소 개수 확인
	System.out.println(library.size()); //2
	
	//1. index의 요소 삭제 후 삭제된 객체 정보 반환
	library.remove(1).showBookInfo();;
	System.out.println(library.size()); //1

	System.out.println(library.isEmpty());
	
	
	
	
	
	
	
	
	
	}

}
