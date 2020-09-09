import java.util.Scanner;

public class anagramOrNot {

	static boolean check(String str1, String str2) {
		int arr1[] = new int[26];
		int arr2[] = new int[26];

		// Converted both strings to LowerCase to avoid case sensitive test cases.
		// We can also achieve the same effect by converting both to UpperCase.
		char ch1[] = str1.toLowerCase().toCharArray();
		char ch2[] = str2.toLowerCase().toCharArray();
		
		int i,j;
		int f = 0;
		
		// Two strings are called anagrams of each other if
		// 1. they have same length
		// 2. same frequency of characters
		
		if(str1.length() != str2.length()) {
			return false;  // Since the length of strings doesn't match so they can't be anagrams.
		}
		else {
			// This array of 26 elements counts frequency of each character in alphabet
			for(i=0; i<ch1.length;i++) {  
				j = ch1[i] - 'a';
				arr1[j]++;
			}
			for(i=0; i<ch2.length;i++) {
				j = ch2[i] - 'a';
				arr2[j]++;
			}
			
			// Using this we are checking whether or not the frequency of characters in both strings are equal or not 
			for(i=0;i<26;i++) {
				if(arr1[i] != arr2[i]) { // if this statement is true then strings are not anagrams
					f = 1;
					break;
				}
			}
			
			if (f == 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		boolean anagram;
		anagram = check(str1,str2);
		
		if(anagram) {
			System.out.println("Strings are anagram of each other");
		}
		else {
			System.out.println("Strings are not anagram of each other");
		}
		
		sc.close();
 	}
}
