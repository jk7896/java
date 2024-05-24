package part10_Test_Pro;



public class TestCode {

	public static void main(String[] args) {
	
		//다음 테스트 코드를 만족 시키는 클래스를 만들고 결과를 구현
		Company comp = Company.SetCompany();
		

		Empolyee Kim = comp.NewEmpReg("Kim"); 
		Empolyee Na = comp.NewEmpReg("Na");

        System.out.println(Kim.setEmpId());
        System.out.println(Na.setEmpId());
		
		
		
		

	}

}
