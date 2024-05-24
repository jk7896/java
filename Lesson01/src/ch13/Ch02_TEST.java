package ch13;
import java.util.*;
public class Ch02_TEST {

	public static void main(String[] args) {
		int num1;
		int num2;
		int i;
		int j = 0;
		int z=0;
		int []Array = new int [100];
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 수를 입력하세요");
		num1=sc.nextInt();
		System.out.println("끝 수를 입력하세요");
		num2=sc.nextInt();
		int [] iValues = new int [(num2-num1)/3+(num2%3==0?1:0)];
		for(i=0;num1<num2;num1++) {
			if(num1%3==0) {
				j++;
			
				iValues[i]=num1;
				i++;
			}
		}
		System.out.println("배열의 총 개수는 :"+j);
		System.out.print("배열의 목록는 :");
		for (i=0;i<j;i++) {
			System.out.print(iValues[i]+" ");
		}
		System.out.print("\n배열의 내림차순 :");
		i=0;
		for(i=j-1; i>=0;i--) {
			System.out.print(iValues[i]+" ");
		}
		
		
	}	

	
}
