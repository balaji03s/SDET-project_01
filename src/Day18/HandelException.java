package Day18;

import java.util.Scanner;

public class HandelException {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		try {
		System.out.println(100/num); //ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data");
			
		}
		
		
	}

}
