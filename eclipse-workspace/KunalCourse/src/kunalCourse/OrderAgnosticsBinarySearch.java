package kunalCourse;

public class OrderAgnosticsBinarySearch {

	public static void main(String[] args) {
		//int[] arr = { 115, 105, 95, 85, 75, 65, 55, 45, 35 };
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int[] arr1 = { 99, 88, 77, 66, 55, 44, 33, 22, 11 };
		int target = 11;
		System.out.println(orderAgnostics(arr1,target));
	}

	static int orderAgnostics(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			int middle = start + (end-start)/2;
			
			if(arr[middle] == target) {
				return middle;
			}
			if(isAsc) {
				if(target < arr[middle]) {
					end = middle - 1;
				}else { 
					start = middle + 1;
				}
			}else {
			
			if(target < arr[middle]) {
				start = middle + 1;
			}
			else {
				end = middle - 1;
			}
			
		}
	}
		return-1;
}
	}