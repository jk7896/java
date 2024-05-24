package part09_singletonpattern;

public class Company {
	
	// 사원수를 관리하는 변수
	public int MemberCount = 0 ;

	public int getMemberCount() {
		return MemberCount;
	}

	public void setMemberCount(int memberCount) {
		MemberCount = memberCount;
	}
	
	private Company() {}
	
	private static Company instance = new Company();
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
	

}
