package lab2;

import java.util.Arrays;

public class Ex1 {
	
	static int getSecondSmallest(int[] arr) {
		int n = arr.length;
		
		int second_min = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
		
		for(int i=0; i<n;i++) {
			if(arr[i]<min) {
				second_min = min;
				min = arr[i];
			}
				
		}
		
		for(int i=0; i<n;i++) {
			if(arr[i]<second_min && arr[i] != min)
				second_min = arr[i];
		}
		
		return second_min;
	}
	
	// using sorting
	static int getSecondSmallest2(int[] arr) {
		Arrays.sort(arr);
		
		return arr[1];
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {4, 6, 2, 1, 9};
		 
		System.out.println(getSecondSmallest2(arr));
	}

}
