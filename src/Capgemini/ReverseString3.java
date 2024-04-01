package Capgemini;

public class ReverseString3 {

	public static void main(String[] args) {
		
		//using sting concatenation operator
		String str="Selenium";
		String rev="";
		
		/*int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);*/
		
		
		/*using character array
		
		char a[]=str.toCharArray();
		int len1=a.length;
		for(int i=len1-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		
		//Using string buffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}
	
	
	


}
