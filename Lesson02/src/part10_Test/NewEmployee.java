package part10_Test;

public class NewEmployee {

	public static void main(String[] args) {
		
		Company comp = Company.getInstance();
		

	        Employee Kim = comp.NewEmpReg("Kim"); // Use the NewEmpReg method
	        Employee Na = comp.NewEmpReg("Na");

	        System.out.println(Kim.getEmployeeId());
	        System.out.println(Na.getEmployeeId());

	    }
	}