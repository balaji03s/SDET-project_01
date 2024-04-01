package Day18;

public class MultipleCatch {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handle exceptions");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handle exceptions");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handle exceptions");
			System.out.println(e.getMessage());
		}

}
}
