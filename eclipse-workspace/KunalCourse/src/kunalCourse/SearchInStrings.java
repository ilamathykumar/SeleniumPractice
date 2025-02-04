package kunalCourse;

import java.util.Arrays;

public class SearchInStrings {

	public static void main(String[] args) {
		String text = "Kumar";
		char target = 'r';
		System.out.println(searchForChar(text,target));
		System.out.println(searchForChar1(text,target));
         System.out.println(Arrays.toString(text.toCharArray()));
	}
	static int searchForChar(String text,char target) {
		/*
		 * if(text.length() == 0) { return -1; }
		 */
		for(int i = 0;i < text.length(); i++) {
			if(target == text.charAt(i)) {
				//if(text.charAt(i) == target) {	
				return i;
			}
		}
		return -1;
	}
	static boolean searchForChar1(String text,char target) {
		if(text.length() == 0) {
			return false;
		}
		for(char ch: text.toCharArray()) {
			if(target == ch) {
				return true;
			}
		}
		return false;
	}
	

}
