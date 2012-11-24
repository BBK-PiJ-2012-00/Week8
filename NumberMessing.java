public class NumberMessing {

	
	public static void printNumbers(int n) {
		if (n <= 0) {
			return;
		}
		System.out.println(n);
		printNumbers(n-2);
		printNumbers(n-3);
		System.out.println(n);
	}
	
	
	/**
	public static String dodgyMethod(int n) {
		String result = dodgyMethod(n - 3) + n + dodgyMethod(n - 2); //enters infinite loop/checking base case too late
		if (n <= 0) {
			return "";
		}
		return result;
	}
	*/
	
	
	public static int mcCarthy91(int n) { 
		if (n > 100) {
			return n - 10;
		}
		else {
			return mcCarthy91(mcCarthy91(n+11));
		}
	}
	
	public static int factorial(int n) {
		if (n ==1) {
			return 1;
		}
		else {
			int result = n * factorial(n - 1);
			return result;
		}
	}
	
	public static int iterativeFactorial(int n) {
		int i;
		int result = n;
		int factorial = n;
		for (i = 0; i < (n - 1); i++) {
			factorial--;
			result = result * factorial;
		}
		return result;
	}
	
	public static int fib(int n) { //to calculate the nth fib no.
		if ((n == 1) || (n == 2)) {
			return 1;
		}
		else {
			int result = fib(n - 1) + fib(n - 2);
			return result;
		}
	}
	
	
	public static int iterativeFib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		}
		else {
			int i;
			int a = 1;
			int b = 1;
			for (i = 3; i <= n; i++) {
				int result = a + b;
				a = b;
				b = result;
			}
		return b;
		}
	}	
	
	public static int numberOfMoves(int n) { //where n = number of discs
		if (n == 1) {
			return 1;
		}
		/**
		if (n == 2) {
			int result = 3;
		}
		*/
		else {
			int result = (2 * numberOfMoves(n-1)) + 1;
			return result;		
		}
	}
			
			
		
		//moving 4 is like moving 3 but with an extra move
		//move n-1
		
    //move n-1 discs from A to B. This leaves disc n alone on peg A
   // move disc n from A to C
    //move n-1 discs from B to C so they sit on disc n

		
		
	
	
	public static void main(String[] args) {
	
		/**
		System.out.print("Please enter a number: ");
		int i = Integer.parseInt(System.console().readLine());
		printNumbers(i);
		*/
		
		/**
		System.out.println(mcCarthy91(50));
		*/
		/**
		System.out.println(factorial(10));
		System.out.println(iterativeFactorial(10));
		*/
		
		System.out.println(fib(7));
		System.out.println(iterativeFib(7));
		
		System.out.println(numberOfMoves(3));
		System.out.println("The number of moves for 4 discs is: " + numberOfMoves(2));
		System.out.println("The number of moves for 4 discs is: " + numberOfMoves(4));
		
		
		
	}
}