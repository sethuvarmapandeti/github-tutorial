package BasicPrograms;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		
		String original;
		String reverse="";
		System.out.println("Enter the original number to check the palindrome or not");
		original=reader.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
			
		}
		System.out.println(reverse);
		
		
		if(original.equals(reverse)) {
			System.out.print("Entered String is palindrome String");
			
		}
		
		else {
			
			System.out.println("It is not an palindrome string");
		
		}
		
		}
	}

	
		
