package kunalCourse;

public class FloorOfANumber {

	public static void main(String[] args) {
		int[] arr = {11,15,23,85,96,112,136};
		int target = 12;
		System.out.println(FloorOfNumber(arr,target));
	}
	
	//RETURNS THE SMALLEST NUMBER GREAT THAN OR EQUAL TO TARGET
	static int FloorOfNumber(int[] arr, int target) {
		if(target > arr[arr.length - 1]) {
			return -1;
		}
		 int start = 0;
		 int end = arr.length - 1;
		 
		 while(start <= end) {
		 int middle = start + (end-start) /2;
		
		 if(target < arr[middle]) {
			 end = middle - 1;
		 }
		 else if(target > arr[middle]) {
			 start = middle + 1;
		 }
		 else {
			 return middle;
		 }
	}
		 return end;

}
}