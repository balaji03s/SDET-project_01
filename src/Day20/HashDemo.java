package Day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashDemo {

	public static void main(String[] args) {
		
		//Declration
		
		HashSet myset=new HashSet();
		
		//Set myset= new HashSet();
		
		//HashSet<String> myset=new HashSet<String>();
		
		//adding elements into hashset
		
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(null);
		myset.add(100);
		
		System.out.println(myset);
		
		System.out.println("Size of set:"+myset.size());
		
		//Removing element
		myset.remove(10.5); //value
		System.out.println("Afer removing: "+myset);
		
		//Inserting element - Not possible
		
		//Access specific element -  Not possible
		
		//Convert HashSet -->ArrayList
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Read all the element using for...each
		/*for(Object x:myset)
		{
			System.out.println(x);
		}*/
		
		//using iterator
		Iterator <Object> it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		myset.clear();
		System.out.println("Is Empty: "+myset.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
