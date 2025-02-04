package kunalCourse;

public class IsNumberPrime {

	public static void main(String[] args) {
      isPrime(121);
	}
	
	public static void isPrime(int n) {
			if(n <= 1) {
			System.out.println("neither prime nor composite");
		}
		int c = 2;
		while(c*c <= n) {
			if(n%c == 0) {
				System.out.println("not prime");
			}
			c += 1;
			//System.out.println("prime");
			
		}
	}

}
