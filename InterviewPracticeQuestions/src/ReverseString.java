import java.util.Scanner;

//Write a Java program to reverse a given string.
public class ReverseString {

	public static void main(String[] args) {
		System.out.println("This is a Java program to reverse a given string.");
System.out.println("Enter the String:");
Scanner input=new Scanner(System.in);
String str=input.next();
System.out.println("Your Original string is: "+str);
System.out.print("Your Reversed string is: ");
for(int i=str.length()-1;i>=0;i--) {
	System.out.print(str.charAt(i));
}
	}

}
