package kunalCourse;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String x = "Hello";
		String y = "World";
		
		x=x+y;
		y = x.substring(0, (x.length() - y.length()));
		x = x.substring(y.length());
		
		System.out.println("x value is: " +x);
		System.out.println("y value is: "+y);
		
	}

}
