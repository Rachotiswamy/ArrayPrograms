package com.sample;

public class SuperElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 5, 3, 6}; 
	    int n = arr.length; 
	    findElements(arr, n); 
	}

	static void findElements(int arr[], int n) {
// Pick elements one by one  
// and count greater elements.  
// If count is more than 2,  
// print that element. 
		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 0; j < n; j++)
				if (arr[j] > arr[i])
					count++;

			if (count >= 2)
				System.out.print(arr[i] + " ");
		}
	}

}
