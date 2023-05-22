import java.util.Arrays;
import java.util.Scanner;

//Implement a Java program to check if two strings are anagrams.
public class Anagrams {

	public static void main(String[] args) {
		System.out.println("Java program to check if two strings are anagrams.");
		System.out.println("Enter the First String: ");
		Scanner input=new Scanner(System.in);
		String fString=input.next().toLowerCase();
		System.out.println("Enter the Second String: ");
		String sString=input.next().toLowerCase();
		boolean isAnagrams=isAnagrams(fString,sString);
		if(isAnagrams) {
			System.out.println(fString+" and "+sString+" are Anagrams");
		}
		else {
			System.out.println(fString+" and "+sString+" are not Anagrams");
		}
		
	}
	private static boolean isAnagrams(String fString, String sString) {
		
		if(fString.length()!=sString.length()) {
			return false;
		}
		
		char[] fChars=fString.toCharArray();
		char[] sChars=sString.toCharArray();
		Arrays.sort(sChars);
		Arrays.sort(fChars);
		return Arrays.equals(fChars,sChars);
}
}