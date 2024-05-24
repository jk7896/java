package part02_ClassTest;

public class Student {
	public int iStudentId;//학번
	public String sStudentName; //이름
	public String sAddress; //주소
	
	public void ShowStudentInfo() {
		System.out.println(sStudentName + " , "+ sAddress);
		
	
	}
	//클래스의 생성자 멤버
			//클래스 이름과 동일 하며 객체화 (인스턴스화)시 자동 호출 되는 특수 형태의 메소드
			//>클래스 이름과 동일하게 만들 수 있는 메소드
			//>메소드를 만들지 않아도 자동으로 호출되어 사용(객체화 과정에 참여).
	public Student()
	{
		iStudentId=0000;
		sStudentName="이름";
		sAddress="대한민";
		
	}
}
