package kunalCourse;

public class FindingMaximumValue {

	public static void main(String[] args) {
          int[] arr = {112,15,77,95,101,-9};
          System.out.println(findMax(arr));
          System.out.println(findMaxRange(arr,1,5));
	}
	static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	static int findMaxRange(int[] arr, int start, int end) {
		int max = arr[start];
		for (int i = start; i < end; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
