package Day19;

//Upcasting- Converting value from smaller->larger----int--->long, float->double
//Downcasting-Converting value from larger->smaller----long-->int

public class TypeCasting {

	public static void main(String[] args) {
		
		//upcasting
		int val=100;
		long lo=val;
		System.out.println(lo);
		
		float flo=10.5f;
		double dou=flo;
		System.out.println(dou);
		
		//downcasting
		long lng=10000;
		int val1=(int) lng;
		System.out.println(val1);
		
		double doub=123.56;
		float flot=(float) doub;
		System.out.println(flot);
		
		//ex1
		int i=100;
		double d=i;
		System.out.println(d);
		
		//ex2
		double d1=10.5;
		int in=(int) d1;
		System.out.println(in);
		
		
		
		
		
	}

}
