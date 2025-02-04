package kunalCourse;

public class FindingMinimumNumArray {

	public static void main(String[] args) {
		int[] arr = {1,4,-5,2,6,7};
		System.out.println(minNum(arr));
	}
	
	static int minNum(int[] arr) {
		if(arr.length == 0) {
			return -1;
		}
		int temp = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] < temp) {
				temp = arr[i];
			}
		}
		return temp;
		
	}

}
