package kunalCourse;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfArrayList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			al.add(new ArrayList<>());		
		}
		for(int i=0; i<3; i++) {
			for(int j=0;j<3;j++) {
				al.get(i).add(in.nextInt());
			}
		}
		System.out.println(al);
}
}