package ch01_Class;

public class Ch_01 {
	//클래스
	//특정 속성들을 정의 해둔 내용을 시젤 사용 할 수 있도록 속성의 내용을 부여 하여 사용하는 설계문서
	//클래스 이름은 대문자로 시작하는것이 좋다.
	//클래스에 속하는 멤버(그룹) - 필수 사항은 아님.
	//  클래스를 구성하는 요소들을 일컷는 말.
	

	public static void main(String[] args) {
		//학생을 관리하는 프로ㅡ램을 작성한다고 할때
		//김범수 학생에 대한 정의
		int iStudent_ID_Kim=1111;
		String iStudent_Name="김범수";
		int iMajorCode=23; //학과코드
		
		//N 명의 학생을 하나하나 변수를 만들어 관리하기 힘들다.
		//입학 일자 등의 정보를 추가하여 관리하려면 수정 하는데 비용이 많이 소모된다.
		//학생들이 가지고 있는 공정적인 속성을 하나의 묶음 단위로 만들어 관리하는 방식
		//공통슥성(클래스)로정의해두고 실제 그 내용을 사용 할 때 특정한 요소를 만들어(객체)프로그램을 하는 방식
		
		//학생클래스를 실제 사용할 수 있는 상태로 선언하고 사용하기.
		Student std_Kim = new Student();
		std_Kim.iStudentID= 1111;
		std_Kim.SIndDdate= "2024-05-08";
		
		Student std_Park = new Student();
		std_Park.iStudentID=2222;
	}

}		
		
	//Ch01 ClasFormat 클래스 와 Student 클래스는 동등한 위치에 있고 형제 관계
	class Student{
		//학생이 가질수 있는 공통속성
		//클래스의 속성의 그룹을 멤버
		//첫번째 속성 : 변수
		//	변수들의 모음 -> Student클래스를 구성하기 위해 변수들이 선언되는데 이 변수들을 일컬어 클래스 멤버 변수
		
		//클래스 멤버 변수
		int iStudentID;//학번
		String sStudentName;//이름
		int iMajorCode; //학과코드
		String SIndDdate;
		
		
	}
	
		
		
		
		


