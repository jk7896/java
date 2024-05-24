package ch13;

public class Ch04_TEST {

	public static void main(String[] args) {
		 int[][] numbers = {{2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};

	        // 2단부터 9단까지 반복
	        for (int i = 0; i < numbers[0].length; i++) {
	            int dan = numbers[0][i]; // 2부터 9까지의 단수

	            // 각 단의 구구단 계산 및 출력
	            for (int j = 0; j < numbers[0].length+1; j++) {
	                System.out.println(dan+"X"+numbers[1][j]+"="+dan*numbers[1][j]);
	            }
	            System.out.println(); // 한 단의 구구단 출력 후 줄바꿈
	        }
	            
	}

}
