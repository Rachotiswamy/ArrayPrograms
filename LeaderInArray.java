package com.sample;

public class LeaderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	LeaderInArray lead = new LeaderInArray(); 
	        int arr[] = new int[]{1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7}; 
	        int n = arr.length; 
	        lead.printLeaders(arr, n);
	}

	/*Java Function to print leaders in an array */
    void printLeaders(int arr[], int size)  
    { 
        for (int i = 0; i < size; i++)  
        { 
            int j; 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] <= arr[j]) 
                    break; 
            } 
            if (j == size) // the loop didn't break 
                System.out.print(arr[i] + " "); 
        } 
    } 
  
	
}
