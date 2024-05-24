package part02_ClassTest;

public class StudentCall {

	public static void main(String[] args) {
		//학생클래스의 객체화
		Student std= new Student();
		std.iStudentId=1111;
		std.sStudentName=" 박효신";
		std.sAddress="서울";
		
		std.ShowStudentInfo();
		
		Student std2 = new Student();
		std.ShowStudentInfo();//클라스 메소드

	}

}
