package part10_Test_Pro;

public class Company {

	 private static int employeeIdCounter = 10000; // 사번 카운터	
	 private static Company instance;
	
	 public static  int setNextEmployeeId() {
	        return ++employeeIdCounter; // 사번 증가 및 반환
	    }
		
	
			private Company() {} //외부에서 객체 생성을 하지 못하도록 막기위해서 private를 사용
			
			public static Company SetCompany() { //Company 객체를 반환하는 static 메소드
				if (instance == null) {
					instance = new Company();
					
					
				}
				return instance;
			}
	

	public Empolyee NewEmpReg(String name) { 
		//회사 객체의 총 사원수 증가(사번)
		//
		Empolyee employee = new Empolyee(name);
        return employee;
    }
	
	
	
}
