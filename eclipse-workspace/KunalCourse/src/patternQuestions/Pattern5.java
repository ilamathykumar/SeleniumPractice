package patternQuestions;

public class Pattern5 {

	public static void main(String[] args) {
		pattern3(5);
	}
	
	static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for(int col = 1; col <= row ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row = 1; row <= n; row++) {
			for(int col = 4; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
