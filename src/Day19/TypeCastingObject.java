package Day19;


class parent
{
	String name="Balaji";
	
	void m1() {
		System.out.println("This is parent class");
	}
}

class child extends parent
{
	int id=101;
	void m2() {
		System.out.println("This is child class");
	}
} 
public class TypeCastingObject {

	public static void main(String[] args) {
		
		child ch=new child();
		System.out.println(ch.name);
		ch.m1();
		System.out.println(ch.id);
		ch.m2();
		
		parent p=new child(); //upcasting
		System.out.println(p.name);
		p.m1();
		
		//System.out.println(p.id); //we cant access
		//p.m2();
		
		
		parent p1=new parent(); //downcasting  error in runtime
		child c=(child) p1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		
		
		
	}

}
