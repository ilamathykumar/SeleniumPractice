package kunalCourse;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("eNTER");
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			al.add(input.nextInt());
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(al.get(i));
		}
		System.out.println(al);
	}

}
