package part10_Test_Pro;


public class Empolyee {
	private int employeeId; // 사번
    private String name; // 이름

    public Empolyee(String name) {
        this.employeeId = Company.setNextEmployeeId(); // 회사에서 사번 부여
        this.name = name;
    }

    public int setEmpId() {
        return employeeId;
    }

    public String setName() {
        return name;
    }
}
