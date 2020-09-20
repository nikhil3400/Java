class queue {
	int a[] = new int[5];
	int front=-1,rear=-1,f=0;

	void enqueue(int n){
	 if(front<0) {
	  front++;
	  rear++;
	  a[front]=n;
	  }
	 else {
	   if(rear == 4) {
	   	 f=1;
	     System.out.print("overflow");
	   }
	   else {
	   	 rear++;
	   	 a[rear]=n;
	   }
	 }
	}

	void dequeue() {
	  if(front==-1 && rear==-1) {
	  System.out.print("Underflow");
	  }
	  else if(front==rear) {
	    front = rear = -1;
	  }
	  else {
	    front++;
	  }
	}

	void display() {
		if(f==0) {
		for(int i=front;i<=rear;i++)
			System.out.print(a[i]+" ");
	     }
	}

}

class queue2 {
	public static void main(String args[]) {
		queue ob = new queue();
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
		ob.enqueue(4);
		ob.enqueue(5);
		ob.dequeue();
		ob.enqueue(6);
		ob.display();
	}
}