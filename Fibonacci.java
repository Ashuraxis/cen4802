
/**
 * This method performs the Fibonacci sequence on a given number
 * 
 * @param n the number being used for the sequence
 * @returns the recursive sum of the numbers in the sequence
 * 
 * @author Abner Roman Diaz
 * @version 1.0
 */
public class Fibonacci {
	
	static int fib(int n) {
		
		if(n <= 1)
			return n;
		
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 10;
		
		for (int i = 0; i < N; i++) {
			
			System.out.print(fib(i) + " ");
		}
		
		System.out.println("\nThe " + N + "th term of the Fibonacci sequence is " + fib(N - 1) + ".");

	}

}
