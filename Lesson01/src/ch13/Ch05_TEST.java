package ch13;

import java.util.*;

public class Ch05_TEST {

	public static void main(String[] args) {
		     int[] arr = {22,1,6,20,13,16,11,12,11,8,6};
		        bubbleSort(arr);
		        System.out.println(Arrays.toString(arr));
		    }

		    public static void bubbleSort(int[] arr) {
		        int n = arr.length;
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i -1; j++) {
		                if (arr[j] < arr[j+1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                }
		            }
		        }
		    }
		}