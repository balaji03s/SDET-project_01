package Capgemini;

import java.util.Scanner;

public class Palindrom4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		int oring=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(oring==rev)
		{
			System.out.println("Palindrom");
			
		}
		else {
			System.out.println("Not palindrom");
		}
	}

}
