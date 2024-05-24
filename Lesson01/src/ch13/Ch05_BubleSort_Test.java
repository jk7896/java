package ch13;

import java.util.*;

public class Ch05_BubleSort_Test {
	public static void main(String[] args) {
		//배열의 정렬
		//버블 정렬 : 기준 값과 순차적으로 다음 값을 비교하여 큰 수를 찾는방법
		//내림 차순으로 정렬을 할 배열
		int [] iValues= {20,13,22,16,11,1,6,12,8,6};
		int iTemp=0;
		//i: 기준 값이 있는 index
		for (int i=0;i<iValues.length;i++) {
			//j: 기준값 다음부터 끝까지 비교하는 index
			for(int j=i+1;j <iValues.length;j++) {
				if (iValues[i]<iValues[j])	{
					int temp = iValues[i];
					iValues[i] = iValues[j];
					iValues[j] = temp;
				}
				
				
			}
		}System.out.println(Arrays.toString(iValues));
		
		
	}
}
