import java.util.*;

public class linkedlist {
	class Node {
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}}
		public Node head = null;
		public Node tail = null;
		public void add(int d) {
			Node newNode = new Node(d);

			if(tail == null) {
				head = newNode;
				tail = newNode;
			}

			else {
				newNode.next = head;
				head = newNode;
			}
		}

        public void display() {
			Node current = head;

	   		if(head == null) {
	   	 	System.out.println("Empty list");
	    	return;
	  		}

	  		System.out.println("Present elements");

	 		while(current != null) {
	   		System.out.print(current.data + " ");
	   		current = current.next;
	 		}

	 		System.out.println();
		}
	
	public static void main(String args[]) {
	  linkedlist l = new linkedlist();

	  l.add(1);
	  l.add(2);
	  l.add(3);
	  l.add(4);

	  l.display();
	}
}