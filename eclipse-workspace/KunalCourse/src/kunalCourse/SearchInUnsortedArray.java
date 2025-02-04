package kunalCourse;

public class SearchInUnsortedArray {

	public static void main(String[] args) {
		int[] arr = { 12, 43, 3, 66, 90, 5, 13, 77 };
		int target = 66;
		System.out.println(linearSearch1(arr, target));
		System.out.println(linearSearch2(arr, target));
		System.out.println(linearSearch3(arr, target));

	}

	static int linearSearch1(int[] arr, int target) {
		if (arr.length == 1) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	static int linearSearch2(int[] arr, int target) {
		if (arr.length == 1) {
			return -1;
		}
		for(int element : arr) {
			if(element == target) {
				return element;
			}
		}
		return -1;
}
	static boolean linearSearch3(int[] arr, int target) {
		if (arr.length == 1) {
			return false;
		}
		for(int element : arr) {
			if(element == target) {
				return true;
			}
		}
		return false;
	}
}