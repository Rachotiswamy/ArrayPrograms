package com.practise.logicals;

import java.util.Arrays;
import java.util.Scanner;

public class GetMinAndMaxValueFromArrayWithOutSortMethod {

	public static void main(String[] args) {

		//int array[] = new int[]{10, 11, 88, 2, 12, 120};
		int[] integerArray;
		Scanner scan = new Scanner(System.in);
        System.out.println("Maximum and minimum value array");
        System.out.println("--------------------------------\n");
        integerArray = new int[8];

        //input loop
        System.out.print("Enter numbers: ");
        for(int i = 0; i < 8; i++)
        {
            integerArray[i] = scan.nextInt();
        }

        System.out.print("\nHere is your array: " + Arrays.toString(integerArray) + "\n");
        
	    // Calling getMax() method for getting max value
	    int max = getMax(integerArray);
	    System.out.println("Maximum Value is: "+max);
	 
	    // Calling getMin() method for getting min value
	    int min = getMin(integerArray);
	    System.out.println("Minimum Value is: "+min);
	    
	    int secondMin = getSecondMin(integerArray);
	    System.out.println("Second Minimum Value is: "+secondMin);
	    
	    int secondMax = getSecondMax(integerArray);
	    System.out.println("Second Maximum Value is: "+secondMax);
	  }
	 
	  // Method for getting the maximum value
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	  
	  public static int getSecondMin(int[] inputArray){ 
		    int minValue = inputArray[1]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  } 
	// Method for getting the maximum value
		  public static int getSecondMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i-1]; 
		      } 
		    } 
		    return maxValue; 
		  }
	

}
