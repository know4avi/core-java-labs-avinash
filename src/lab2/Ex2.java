package lab2;

import java.util.Arrays;

public class Ex2 {
	
	static void StringSort(String[] arr) {
		int n = arr.length;
		
		int lowerLimit = n/2;
		
		Arrays.sort(arr);
		
		for(int i=0; i<lowerLimit; i++) {
			arr[i] = arr[i].toLowerCase();
		}
		
		for(int i=lowerLimit; i<n; i++) {
			arr[i] = arr[i].toUpperCase();
		}
		
	}
	
	public static void main(String[] args) {
		
		String[] str = {"FISH", "kite", "NEST", "ice", "Ball"};
			
		StringSort(str);
		
		System.out.println(Arrays.toString(str));
		
	}

}
