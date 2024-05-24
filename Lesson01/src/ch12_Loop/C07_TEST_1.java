package ch12_Loop;
import java.util.*;
public class C07_TEST_1 {

	public static void main(String[] args) {
		int dan=2;
		int count =1;
		while(dan<10) {
			while(count<10) {
				System.out.println(dan+"X"+count+"="+dan*count);
				count+=1;
				
			}
			count=1;
			dan+=1;
		}

	}

}
