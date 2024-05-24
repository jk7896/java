package part11_Array;

public class DeepCopy {

	public static void main(String[] args) {
		//객체의 간의 깊은 복사
		//객체가 생성된 heap의 주소를 전달하는 것이 아닌 그 메모리의 데이터 자체를 새로 생성하게 하여 전혀 다른 개체로 
		
		
		//원본 배열
		int [] iOriginals = new int[] {10,20,30,40,50};
		
		//복사를 할 배열
		int [] iBackUps = new int[iOriginals.length];  //원본배열의 방크기 만큼 만듬
		
		//iBakUps = iOriginals; //참조 주소 전달의 얕은 복사 방식
		//배열 클래스에서 제공하는 깊은 복사 기능
		//Systme.ArrayCopy
		System.arraycopy(iOriginals, 0, iBackUps, 0, 5); //원본 배열의 처음부터 끝까지 데이터를 깊은 복사 방식으로 
		
		for (int i =0 ; i<iBackUps.length;i++) {
			System.out.print(iBackUps[i]+",");
		}
		
		
		

	}

}
