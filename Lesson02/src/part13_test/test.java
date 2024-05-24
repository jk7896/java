package part13_test;

public class test {

	public static void main(String[] args) {
		        // 학생 정보 생성
		        Student student1 = new Student(1001, "김범수");
		        Student student2 = new Student(1002, "이수");

		        // 과목 정보 생성 및 학생별 등록
		        Subject korean1 = new Subject("국어", 80);
		        Subject english1 = new Subject("영어", 90);
		        Subject korean2 = new Subject("국어", 60);
		        Subject math2 = new Subject("수학", 95);
		        Subject english2 = new Subject("영어", 80);

		        
		        student1.addSubject(korean1);
		        student1.addSubject(english1);
		        student2.addSubject(korean2);
		        student2.addSubject(math2);
		        student2.addSubject(english2);

		        // 학생별 성적 출력
		        printStudentInfo(student1);
		        printStudentInfo(student2);
		    }

		    private static void printStudentInfo(Student student) {
		        System.out.println("학번: " + student.getStudentId());
		        System.out.println("이름: " + student.getName());
		        System.out.println("------------------");

		        int totalScore = 0;
		        for (Subject subject : student.getSubjects()) {
		            System.out.printf("%s: %d점\n", subject.getSubjectName(), subject.getScore());
		            totalScore += subject.getScore();
		        }

		        System.out.printf("총점: %d점\n", totalScore);
		        System.out.println("------------------");
		    }
		}