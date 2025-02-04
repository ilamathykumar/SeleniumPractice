package kunalCourse;

public class SearchWithinRange {

	public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 12;
        System.out.println(linearSearch(arr,target,1,4));
	}
	
	static int linearSearch(int[] arr, int target, int start, int stop) {
		if(arr.length == 1) {
			return -1;
		}
		for(int index = start; index <= stop; index++) {
			if (arr[index] == target){
				return index;
			}
		}
		return -1;
	}

}
