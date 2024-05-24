package part10_Test;

public class Employee {
	private int employeeId; // 사번
    private String name; // 이름

    public Employee(String name) {
        this.employeeId = Company.getNextEmployeeId(); // 회사에서 사번 부여
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}