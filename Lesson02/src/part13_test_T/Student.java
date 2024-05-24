package part13_test_T;

import java.util.*;

public class Student {
	
	//클래스변수
	private String sName;
	private int Code;
	private ArrayList<Subject> SubjectList;
	
	
	
	public Student(int _Code, String _Name) {
		//객체 리스트를 초기화
		this.sName=_Name;
		this.Code =_Code;
		SubjectList=new ArrayList<Subject>();
	}
	
	//클래스 메소드 멤버
	public void SetSubjectResult(String sSubName, int iScore) {
		//Subject 객체를 만들어 담기
		//sub 라는 객체 그릇을 만드는 과정이 한번더 수행되는 로직
//		Subject sub = new Subject();
//		SubjectList.add(sub);
		//객체를 바로 리스트에 할당하는 방법
		SubjectList.add(new Subject());
		
		
	}
	
	public void ShowStudentInfo() {
		//학생의 정보를 표현하는 메소드
		System.out.println(this.sName+"학생의 학번은 : " + this.Code+"입니다.");
		//학생이 취득한 과목별 점수를 표현
		//subjdectList.size() : subjectList 의 방의 개수
		//i는 subjectList의 노드번호(인덱스)
//		for (int i=0 ; i<SubjectList.size();i++) {
//			SubjectList
//		}
		
		//개선된 for문으로 하나씩 추출(Subject 객체)
		for(Subject sub : SubjectList) {
			System.out.println(this.sName + "학색의 "+sub.getsName() + "과목의 점수는 : " + sub.getScore()+" 점입니다.");
			int iTotlal=sub.getScore();
		}
		
	}
}
	
	
	

