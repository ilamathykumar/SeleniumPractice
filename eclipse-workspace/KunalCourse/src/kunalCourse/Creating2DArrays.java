package kunalCourse;

import java.util.Arrays;
import java.util.Scanner;

public class Creating2DArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.println(arr.length);
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = input.nextInt();
			}
			//System.out.println();
		}
		//for(int i = 0; i <arr.length; i++) {
		for(int[] a:arr) {
		//System.out.println(Arrays.toString(arr[i]));
		System.out.println(Arrays.toString(a));
		
	}

}
}