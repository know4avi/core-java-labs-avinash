package lab2;

// Create a method which accepts an integer array, 
// reverse the numbers in the array and returns the resulting array in sorted order

import java.util.Arrays;

public class Ex3 {
	
	static int reverse(int n) {
		int rev=0;
		
		while(n>0) {
			rev = rev*10 + (n%10);
			
			n /= 10;
		}
		
		return rev;
	}
	
	static void getSorted(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reverse(arr[i]);
		}
		
		Arrays.sort(arr);
		
		//return 2;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {123, 568, 885, 456};
		
		getSorted(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
