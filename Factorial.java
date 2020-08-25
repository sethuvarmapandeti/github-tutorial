package BasicPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=reader.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of the" +num+ " is  : " +fact);
	}
}
