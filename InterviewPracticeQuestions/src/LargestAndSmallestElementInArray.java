import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Write a Java program to find the largest and smallest number in an integer array.
public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		System.out.println("Java program to find the largest and smallest number in an integer array.");
		System.out.println("Enter the no. of Elements you want to put in an Array:");
		Scanner input = new Scanner(System.in);
		try {
			int n = input.nextInt();
			if (n < 0) {
				System.out.println("Warning !!! Numbers of elements cannot be negative !!!");
				return;
			}
			System.out.println("Great enter: ");
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Element " + (i + 1) + "= ");
				arr[i] = input.nextInt();
			}
			System.out.print("Your Array is: '[");
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]);
				if (i < n - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("]'\n");
			Arrays.sort(arr);
			System.out.println("Smallest integer of an Array is: " + arr[0]);
			System.out.println("Largest integer of an Array is: " + arr[n - 1]);
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid integer Value!!!");

		}
	}
}
