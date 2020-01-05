package com.practise.logicals;

import java.util.Arrays;

public class SumofElementPairIsEqualToGivenNumber {

	public static void main(String[] args) {

		int[] numbers = { 3, 6, 8, -8, 10, 8 }; 
		//int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 }; 
		prettyPrint(numbers, 16); 
		//prettyPrint(numbersWithDuplicates, 7); 
	} 

	public static void printPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) { 
			int first = array[i]; 
			for (int j = i + 1; j < array.length; j++) { 
				int second = array[j]; 
				if ((first + second) == sum) 
				{ 
					System.out.printf("(%d, %d) %n", first, second); 
				} 
			} 
		} 
	} 
	
	public static void prettyPrint(int[] givenArray, int givenSum){ 
		System.out.println("Given array : " + Arrays.toString(givenArray)); 
		System.out.println("Given sum : " + givenSum); 
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum); 
		printPairs(givenArray, givenSum); 
	}


}


