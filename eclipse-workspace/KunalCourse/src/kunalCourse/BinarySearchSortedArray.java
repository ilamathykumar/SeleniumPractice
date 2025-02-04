package kunalCourse;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearchSortedArray {

	public static void main(String[] args) {
		int[] arr = {11,15,23,85,96,112,136,178,196,215,253,279,312};
		int target = 215;
		System.out.println(BinarySearch(arr,target));
	}
	
	public static int BinarySearch(int[] arr, int target) {
		 int start = 0;
		 int end = arr.length - 1;
		 
		 while(start <= end) {
		 int middle = (start + end) /2;
		
		 if(target < arr[middle]) {
			 end = middle - 1;
		 }
		 if(target > arr[middle]) {
			 start = middle + 1;
		 }
		 else {
			 return middle;
		 }
	}
		 return -1;

}
}