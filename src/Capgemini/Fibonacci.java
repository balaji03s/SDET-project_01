package Capgemini;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=10;i++)
		{
			int c=a+b; // 1,2,
		System.out.println(c);
		a=b; // 1
		b=c;// 1 2 
		}
	}

}
