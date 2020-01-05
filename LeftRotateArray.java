package com.sample;

public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeftRotateArray rotate = new LeftRotateArray(); 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7}; 
        rotate.leftRotate(arr, 3, 7); 
        rotate.printArray(arr, 7); 
	}

	/*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr, n); 
    } 
  
    void leftRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
  
    /* utility function to print an array */
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
	
}
