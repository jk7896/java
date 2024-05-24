package quize01;

public class FindMissingNumber {

	public static void main(String[] args) {

		// 아래 배열에 할당된 수 중 
		// 1 ~ 20 범위 내에서  
		// 없는 수를 찾는 로직을 구현하여 출력하세요 
		// * iValues 에 할당된 수의 index 위치는 임의로 변경 하여도 같은 결과를 출력 할 수 있어야 한다.
		// ex) {1,11,15,3,7,5,19,6,10,16,20}; 과 {1,6,10,16,20,11,15,3,7,5,19}; 는 같은 결과를 도출해야 한다.
		
		int[] iValues = {1,11,15,3,7,5,19,6,10,16,20};
		  // 1부터 20까지의 숫자가 있는지 확인하기 위한 배열
        boolean[] present = new boolean[21]; // 0은 사용하지 않음
        
        // 주어진 배열에 있는 숫자들을 표시
        for (int i = 0; i < iValues.length; i++) {
            int num = iValues[i];
            present[num] = true;
        }
        
        // 빠진 숫자 출력
        System.out.print("1~20의 정수 중 배열에 등록되지 않은 수는 : ");
        for (int i = 1; i <= 20; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }System.out.print("입니다");
    }
}

