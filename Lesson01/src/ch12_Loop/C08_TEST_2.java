package ch12_Loop;

public class C08_TEST_2 {

	public static void main(String[] args) {
		int i =0 ;
		int j =0 ;
		for (i =5; i>0; i--) {
			for (j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for (int i2 =0; i2<4; i2++) {
			for (int j2=0; j2<3-i2; j2++) {
				System.out.print(" ");
				
			}	
			for (int z2=0; z2<2*i2+1; z2++){
				System.out.print("*");
			}System.out.println("");
			
			
		}
		
		System.out.println("\n");
		int i3 = 4;//행을 바꾸는 변수
		int j3 = 0; //별을 표현할 개수 변수
		while(i3>=0) {
			while(i3>=j3) {
				System.out.print("*");
				j3++;
			}
			i3--;
			j3=0;
			System.out.println("");
		}
		
		

	}

}
