package Day18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(100/num); //by zero will throw Arithmetic exception.*/
		
		//2
		/*int a[]=new int [5];
		System.out.println("Enter the position:");
		int pos=sc.nextInt();
		
		System.out.println("Enter the value:");
		int value=sc.nextInt();
		
		a[pos]=value;
		
		System.out.println(a[pos]);//0-4 only, if 5 ArrayIndexOutOfBoundsException*/
		
		//3
		/*String s="Selenium";
		int num=Integer.parseInt(s);
		System.out.println(num); // if insted of number NumberFormatException*/
		
		//4
		String s=null;
		System.out.println(s.length()); //string is null NullPointerException
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
