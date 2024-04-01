package Capgemini;

import java.util.Scanner;

public class PalindromString5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str=sc.next();
		String orgi=str;
		String rev="";
		
		int len=str.length();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println(rev);
		if(orgi.equals(rev))
		{
			System.out.println("palindrom");
		}
		else {
			System.out.println("Not palindrom");
		}
	}

}
