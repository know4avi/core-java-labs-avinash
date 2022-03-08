package lab2;

import java.util.Collections;
import java.util.*;

// Create a method which accepts an integer array and removes all the duplicates in the array. 
// Return the resulting array in descending order

public class Ex4 {
	
	public static void reverse(int[] array)
    {
 
        int n = array.length;
     
        for (int i = 0; i < n / 2; i++) {
  
            int temp = array[i];
  
            array[i] = array[n - i - 1];

            array[n - i - 1] = temp;
        }
    }
	
	// if the array is already sorted
	static int[] modifyArray(int[] a) {
		
		int n = a.length;
		
		if (n == 0 || n == 1) {
            return a;
        }
  
        int newLength = 0;
  
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[newLength++] = a[i];
            }
        }
  
        a[newLength++] = a[n - 1];
        
        int[] ans = new int[newLength];
        
        for (int i = 0; i < ans.length; i++) {
			ans[i] = a[i];
		}
        
        Arrays.sort(ans);
        reverse(ans);
  
        return ans;
	}
	
	// if the array is not already sorted,
	// then use set collection
	static void modifyArray2(int[] a) {
		
	   LinkedHashSet<Integer> arrSet = new LinkedHashSet<Integer>();

	   for (int i = 0; i < a.length; i++)
		   arrSet.add(a[i]);
	   
	   ArrayList<Integer> arr = new ArrayList<>(arrSet);
	   
	   Collections.sort(arr, Collections.reverseOrder());
	   
	   System.out.print(arr);

	}
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {2, 2, 4, 5, 5, 9 ,10 ,10};
		
		int[] arr2 = {22, 22, 4, 15, 15, 99 ,10 ,10};
		
		System.out.println(Arrays.toString(modifyArray(arr1)));
		
		System.out.println();
		
		modifyArray2(arr2);
		
	}

}
