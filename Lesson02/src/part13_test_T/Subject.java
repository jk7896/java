package part13_test_T;

public class Subject {
	private String sName;
	private int iScore;
	
	public String getsName() {
		return sName;
	}
	public void setsNames(String sName) {
		this.sName=sName;
	}
	public void Subject(String subjectName, int score) {
        this.sName = subjectName;
        this.iScore = score;
    }

    public int getScore() {
        return iScore;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + sName + '\'' +
                ", score=" + iScore +
                '}';
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
