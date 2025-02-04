package kunalCourse;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWithIterator {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<String>();
		
		/*for(int i=0; i<5;i++) {
			data.add(in.nextLine());
		}
		for(int i=0;i<5;i++) {
			System.out.println(data.get(i));
		}
		
		System.out.println(data);*/
		
		data.add("app");
		data.add("app");
		data.add("app");
		data.add("app");
		data.add("app");
		data.add("app");
		data.add("app");
		data.add("app");
		data.add("app");
		data.add("app");
		data.add("app");
		
		System.out.println(data.size());
		for(int i = 0; i<data.size();i++) {
			System.out.println(data.get(i));
		}
		for(String s:data) {
			System.out.println(s);
		}
	}

}
