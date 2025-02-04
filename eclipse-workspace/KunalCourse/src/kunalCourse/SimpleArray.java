package kunalCourse;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
        //for (int num : arr) {
        	//System.out.print(num + " ");
        System.out.println(Arrays.toString(arr));
        }
	}


