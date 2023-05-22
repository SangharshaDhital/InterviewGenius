import java.util.Scanner;

//Write a Java program to find the largest element in an array.
public class LargestElementOfArray {

	public static void main(String[] args) {
		System.out.println("Java program to find the largest element in an array.");
		int[] arr = arrayInput();
		int largest = largestElementArray(arr);
		System.out.println("\nThe largest Eement of Given Array is: " + largest);
	}

	public static int[] arrayInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of Elements in an Array:");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Great! Enter " + n + " Integers of an Array:");

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("Your Array is : '[");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			if (i != n - 1) {
				System.out.print(", ");
			}

		}
		System.out.print("]'");
		return arr;

	}

	public static int largestElementArray(int arr[]) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;

	}
}
