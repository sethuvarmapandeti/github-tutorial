package BasicPrograms;

import java.util.Scanner;

public class Fibonaciseries {
	
	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number upto to perform the fibonaci series :");
		int num=reader.nextInt();
		int t1=0;
		int t2=1;
		int sum;
		while(t1<=num) {
			
			System.out.print(t1 +" + ");
			sum=t1+t2;
			t1=t2;
			t2=sum;
			
		}
	}
	

}
