import java.util.Scanner;
public class SImpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int principle = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleinterest = principle * rate * time / 100;
		
		System.out.println("Simple Interest Calculated is "+simpleinterest);
	}

}
