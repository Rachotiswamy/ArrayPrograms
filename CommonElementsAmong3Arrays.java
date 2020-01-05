package com.practise.logicals;

public class CommonElementsAmong3Arrays {

	public static void main(String[] args) {

		int arr1[] = {1, 5, 10, 20, 40, 80};
	      int arr2[] = {6, 7, 20, 80, 100};
	      int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
	      int i = 0, j = 0, k = 0, x = 0;
	      System.out.print("Array1: ");
	      for(x = 0; x < arr1.length; x++) {
	         System.out.print(arr1[x] + " ");
	      }
	      System.out.print("\nArray2: ");
	      for(x = 0; x < arr2.length; x++) {
	         System.out.print(arr2[x] + " ");
	      }
	      System.out.print("\nArray3: ");
	      for(x = 0; x < arr3.length; x++) {
	         System.out.print(arr3[x] + " ");
	      }
	      System.out.print("\nThe common elements in the 3 sorted arrays are: ");
	      while (i < arr1.length && j < arr2.length && k < arr3.length) {
	         if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
	            System.out.print(arr1[i] + " ");
	            i++;
	            j++;
	            k++;
	         }else if (arr1[i] < arr2[j]) {
	            i++;
	         }else if (arr2[j] < arr3[k]) {
	            j++;
	         }else {
	            k++;
	         }
	      }
	}

}
