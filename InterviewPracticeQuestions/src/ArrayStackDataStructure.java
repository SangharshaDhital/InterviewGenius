import java.util.Scanner;

//Write a Java program to implement a stack data structure using an array.
public class ArrayStackDataStructure {

	public static void main(String[] args) {
		System.out.println("Java program to implement a stack data structure using an array.");
		System.out.println("Enter the maximum size of Stack:");
		Scanner input = new Scanner(System.in);
		int maxSize = input.nextInt();
		ArrayStackDataStructure stack = new ArrayStackDataStructure(maxSize);
		while (true) {
			System.out.println("\n Choose an Operation:");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Top");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choise:");
			int choise = input.nextInt();
			switch (choise) {
			case 1:
				System.out.println("Enter the item you want to Push: ");
				int item = input.nextInt();
				stack.push(item);
				printStack();
				break;
			case 2:
				stack.pop();
				printStack();
				break;

			case 3:
				stack.top();
				printStack();
				break;

			case 4:
				System.out.println("Exiting the program.......");
				input.close();
				System.exit(0);
			default:
				System.out.println("!!! Invalid choice !!!");
			}
		}
	}

	private int maxSize;
	private static int top;
	private static int[] stackArray;

	public ArrayStackDataStructure(int size) {
		maxSize = size;
		top = -1;
		stackArray = new int[maxSize];

	}

	public static boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("Stack is full. Cannot Push anymore item.!!!");
		} else {
			stackArray[++top] = item;
			System.out.println("Pushed item: " + item);
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty. There is no element to Pop!!!");
			return -1;
		} else {
			int item = stackArray[top--];
			System.out.println("Popped item: " + item);
			return item;
		}
	}

	public int top() {
		if (isEmpty()) {
			System.out.println("Stack is Empty.");
			return -1;
		} else {
			int item = stackArray[top];
			System.out.println("Top item: " + item);
			return item;
		}
	}
	public static void printStack() {
		if(isEmpty()) {
			System.out.println("Stack is Empty.");
		}
		else {
			System.out.println("Stack Elements:");
			for(int i=0;i<=top;i++) {
				System.out.println(stackArray[i]+" ");
			}
			System.out.println();
		}
	}
}
