package kunalCourse;

import java.util.Arrays;

public class SwapAndReverseArray {

	public static void main(String[] args) {
         int[] arr = {1,15,74,12,86};
         //swapElement(arr,0,4);
         reverse(arr);

         System.out.println(Arrays.toString(arr));
         //System.out.println(Arrays.toString(arr));
	}
	
	
	 static void reverse(int[] arr) {
		// int start = 0; 
		 int end = arr.length - 1;
	 // while(start < end) { 
		  for(int start =0; start< end;start++,end--)
		  swapElement(arr,start,end); 
		 // start++; 
		  //end--;
	 
	  }
	   
	 static void swapElement(int[] arr, int start, int end) {
		 
		 int temp =arr[start];
		 arr[start] = arr[end]; 
		 arr[end] = temp;
	  
	 }
	 }
	 
    	 
     

