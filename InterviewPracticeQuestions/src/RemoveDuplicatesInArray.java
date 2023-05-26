import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Implement a Java program to remove duplicates from an array.
public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		System.out.println("Java program to remove duplicates from an array.");
		System.out.println("Enter the no. of Elements you want to put in an Array:");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String[] arr=new String[n];
		System.out.println("Great! Enter "+n+" elements of an array:");
		for(int i=0;i<n;i++) {
			System.out.print("Element "+(i+1)+" :");
			arr[i]=input.next();
		}
		System.out.print("The elements of array are: '[ ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			if(i<n-1) {
				System.out.print(", ");
			}
			
		}
		System.out.print(" ]'\n");
//this can print Array formatted output but actually it is set not an array		
Set<String> uniqueSet=new HashSet<>();
for(String element:arr) {
	uniqueSet.add(element);
}
boolean isFirst=true;
System.out.print("The array without duplicate elements is: '[");
for(String element:uniqueSet) {
	if(!isFirst) {
		System.out.print(", ");
	}
	System.out.print(element);
	isFirst=false;
}
System.out.print("]'");
	}

}
