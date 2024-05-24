package ch12_Loop;
import java.util.*;
public class C05_test {

	public static void main(String[] args) {
		//숫자를 2개 입력
		//범위에 2배수의 개수
		//범위에 2배수의 목록
		int i1;
		int i2;
		int i,j=0;
		String str3 = "";
		Scanner sc =new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		i1=sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		i2=sc.nextInt();
		System.out.print("2의배수 목록 : ");
		for(i=i1; i<=i2 ; i++) {
			if(i%2==0) {
			
				System.out.print(""+i+",");
				j++;
			}
		
		}System.out.print("\n");
		System.out.println("2의배수 : "+ j);
		
		j = 0;
		System.out.print("6의배수 목록 : ");
		for(i=i1; i<=i2 ; i++) {
			if(i%6==0) {
				str3+=i+""
						+ ""
						+ ",";
				
				System.out.print(i+",");
				j++;
				
			}
			
		}
		System.out.print("\n");
		System.out.println("6의배수 : "+ j);
		System.out.println(str3);
	}
}