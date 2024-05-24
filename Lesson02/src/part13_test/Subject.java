package part13_test;

public class Subject {
	 private String subjectName; // 과목명
	    private int score; // 점수

	    public Subject(String subjectName, int score) {
	        this.subjectName = subjectName;
	        this.score = score;
	    }

	    public String getSubjectName() {
	        return subjectName;
	    }

	    public int getScore() {
	        return score;
	    }

	    @Override
	    public String toString() {
	        return "Subject{" +
	                "subjectName='" + subjectName + '\'' +
	                ", score=" + score +
	                '}';
	    }
	}
