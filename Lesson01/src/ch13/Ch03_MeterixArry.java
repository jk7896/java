package ch13;

public class Ch03_MeterixArry {

	public static void main(String[] args) {
		//2차원 배열
		//배열의 요소를 배열로 관리하는 데이터 유형
		//요소 : 배열에 할당 된 단위값
		//2차원 배열의 생성 [] []
		int [][] iValues=new int[2][3]; //2개의 요소에 (3개요소를가지는 배열)을 각각 할당
		
		int[][] iValues2= {{1,2,3},{4,5,6,7}};
		
		int [] iAr_1= {1,2,3};
		int[]iAr_2= {4,5,6,7};
		int[][]iAr_3= {iAr_1,iAr_2};
		
		for (int i =0; i<iValues2.length; i++)
		{
			for (int j=0; j<iValues2[i].length;j++) 
			{
				System.out.print(iValues2[i][j]+" ");
			}
		}
	}

}
