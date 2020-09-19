import java.util.Scanner;
class stack {
	int arr[] = new int[10];
	int top = -1;

	public void push(int n) {
		if(top == n-1) {
			System.out.print("Overload");
		}
		else {
		top++;
		arr[top] = n; 
	    }
	}

	public void pop() {
		if(top == -1)
			System.out.print("Underflow");
		else {
			top--;
		}
	}

	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}


	public static void main(String args[]) {
		stack s = new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4); 
		//s.pop();
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);
		s.push(10);
		s.push(5);
		s.display();
	}
}