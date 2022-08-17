package palindrome;

import java.util.Scanner;

public class Palindrome {
public static void main (String[]args)
{
	String original,reverse = "";
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the string/number to check if it is palindrome or not:");
	original = scan.nextLine();
	int length = original.length();
	for (int i = length-1; i>=0; i--) 
		reverse = reverse+ original.charAt(i);
	
	if(original.equals(reverse)) 
		System.out.println("The entered string/number is a palindrome");
	
	else 
		System.out.println("The entered string/number is not a palindrome");
	
}
}
