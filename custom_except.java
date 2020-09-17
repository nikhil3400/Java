import java.util.*;
class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}

class Custom {
	static void validate(int n) throws InvalidAgeException{
	  if(n < 18)
	  	throw new InvalidAgeException("UnderAge");
	  else
	  	System.out.println("Valid");
	}
}

class custom_except {
	public static void main(String args[]) throws InvalidAgeException {
	  Scanner s = new Scanner(System.in);
	  Custom ob = new Custom();
	  int age = s.nextInt();
	  try {ob.validate(age);}
	  catch(Exception e){System.out.println(e);}
	}
}