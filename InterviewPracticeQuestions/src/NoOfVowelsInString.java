import java.util.Scanner;

//Write a Java program to count the number of vowels in a string.
public class NoOfVowelsInString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String:");
		 int count=0 ,na=0, ne=0, ni=0,no=0, nu=0;
	 String s=input.next().toLowerCase();
	 for(int i=0;i<s.length();i++) {
		
		 
		 if(s.charAt(i)=='a') {
			na++;
			 count++;
		 }
		 else if(s.charAt(i)=='e'){
			 count++; 
			 ne++;
		 }
		
		 else if(s.charAt(i)=='i') {
			 count++;  
			 ni++;
		 }
		 else if(s.charAt(i)=='o') {
			 count++; 
			 no++;
		 }
		 else if(s.charAt(i)=='u') {
			 count++; 
			 nu++;
		 }
			
		 
		 
	 }
	 System.out.println(s+" Contains '"+count+"' Vowels ");
	 System.out.println("a = "+na+"\ne = "+ne+"\ni = "+ni+"\no = "+no+"\nu = "+nu);
	 
	}

}
