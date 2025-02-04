package kunalCourse;

public class FirstAndLastPositionOfSortedArray {

	public static void main(String[] args) {
		int[] nums= {5,7,7,7,7,8,8,10,11};
		int target = 7;
		
	}

	static int firstAndLastOccurence(int[] nums, int target) {
		int [] ans = {-1,-1}; 
		
		int start = search(nums,target,findStartIndex:true);
		int end =  search(nums, target,findStartIndex:false);

}
	int search(int[] nums, int target, boolean findStartIndex) {
		int start = 0;
		 int end = nums.length - 1;
		 
		 while(start <= end) {
		 int middle = start + (end-start) /2;
		
		 if(target < nums[middle]) {
			 end = middle - 1;
		 }
		 if(target > nums[middle]) {
			 start = middle + 1;
		 }
		 else {
			 ans = mid;
			 if(findStartIndex) {
				 end = mid - 1;
			 }else {
				 start = mid+1;
			 }
		 }
	}
		 return ans ;
	}
	
}
