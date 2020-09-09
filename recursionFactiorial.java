import java.util.Scanner;
public class recursionFactiorial {
	
	// Method to calculte the factorial recursively
	static int calFactorial(int num) {
		if(num == 0) {
			return 1; //Since factorial of 0 is 1
			// This statement also works as the end point of our recursive calling
		}
		else {
			// return multiplication the original number with (num-1)! 
			return num*calFactorial(num-1);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // number whose factorial needs to be calculated
		int fact; // variable that will store the calculated factorial
		
		// calling the method to calculate the factorial of the above scanned number
		// The called method will return the factorial using recursive method
		fact = calFactorial(n); // The above scanned number is passed to method
		
		// display the calculated factorial
		System.out.println(fact);
		sc.close();
	}

}
