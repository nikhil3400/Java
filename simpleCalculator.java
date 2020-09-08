import java.util.Scanner;
public class simpleCalculator {
	
	// This method is to do the calcultions and return the result.
	static double calculator(int num1, int num2, char ch) {
		if(ch == '+') {
			return num1+num2;
		}
		else if(ch == '-') {
			return num1-num2;
		}
		else if(ch == '*') {
			return num1*num2;
		}
		else if(ch == '/') {
			return num1/num2;
		}
		else if(ch == '%') {
			return num1%num2;
		}
		else {
			System.out.println("Try again using valid inputs");
		}
		return 0;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2; // Declaring the numbers on which the calculations is to be done.
		char ch; //This character will store the type of calculation to be done.
		String str;
		double result; // To store the final result.
		
		// Input the numbers and the type of function to be done by the calculator
		// The format of input should be as such
		// "<number1><Arthmetic to be applied><number2>" with spaces
		// for example 2 + 5, 5 * 10, 25 / 5 etc

		num1 = sc.nextInt();
		ch = sc.next().charAt(0);
		num2 = sc.nextInt();
		
		result = calculator(num1, num2, ch); // Passing the arguments to calculator method.
		
		// To display the final result
		System.out.println(result);
		
		sc.close();	
	}
}
