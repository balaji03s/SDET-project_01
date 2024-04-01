package Capgemini;

public class Swapping2Number {

	public static void main(String[] args) {

		int a=20,b=30,temp;
		
		//1
		System.out.println("Before swapping " +a+" "+b);
		temp=a;
		a=b;
		b=temp;
		
		//2 +,- whith out using temp
		a=a+b; //50
		b=a-b; //50-30=20
		a=a-b; //50-20=30
		
		//3 *. with out using temp
		a=a*b; //600
		b=a/b; //20
		a=a/b; //30
		
		//4 single statement
		b=a+b-(a=b);
		
		
		System.out.println("After swaping " +a+" "+b);
		
		//2
	}

}
