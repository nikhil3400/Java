import java.util.*;
import java.lang.*;
import java.io.*;

class Gen<E extends Comparable <E>> {
	E arr[];
	Gen(E a[]) {
		arr = a;
	}

	public E getSmallestValue() {
		E s = arr[0];
		for(int i=0;i<arr.length;i++)
		if(arr[i].compareTo(s) == -1)
			s = arr[i];
		return s;
	}
}

class Generics
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        Gen <Integer> ob1 =  new Gen <Integer> (new Integer[] {a,b,c,d,e});
        System.out.println("Smallest Integer:"+ob1.getSmallestValue());
        
        char a1 = sc.next().charAt(0);
        char a2 = sc.next().charAt(0);
        char a3 = sc.next().charAt(0);
        char a4 = sc.next().charAt(0);
        char a5 = sc.next().charAt(0);
        char a6 = sc.next().charAt(0);
        Gen <Character> ob2 = new Gen <Character> (new Character[] {a1,a2,a3,a4,a5,a6});
        System.out.println("Smallest Character:"+ob2.getSmallestValue());
        sc.close();
    }
}
