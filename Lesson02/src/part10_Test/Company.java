package part10_Test;


public class Company {
	 private static int employeeIdCounter = 10000; // 사번 카운터

	    public static int getNextEmployeeId() {
	        return ++employeeIdCounter; // 사번 증가 및 반환
	    }
	    
	    private Company() {}
		
		private static Company instance = new Company();
		public static Company getInstance() {
			if (instance == null) {
				instance = new Company();
			}
			return instance;
		}
		public Employee NewEmpReg(String name) { 
	        Employee employee = new Employee(name);
	        return employee;
	    }
	}
	    
