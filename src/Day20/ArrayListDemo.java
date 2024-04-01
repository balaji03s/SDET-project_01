package Day20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList mylist=new ArrayList();
		
		//ArrayList<Integer> li=new ArrayList<Integer>();
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Java");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		System.out.println("Size of the arry: "+mylist.size());
		System.out.println("Printing Data:" +mylist);
		
		//Remove from arraylist
		mylist.remove(5); //index
		System.out.println("After removing:" +mylist);
		
		//Insert element in the arraylist
		mylist.add(2, 75);
		System.out.println("After insertion:" +mylist);
		
		//Modify element
		mylist.set(3,"Python");
		System.out.println("After modifying:" +mylist);
		
		//Access specific element
		System.out.println(mylist.get(3));//Index
		
		//change element
		mylist.set(1, "C++");
		System.out.println("After change:"+mylist);
		
		//search-contains()
		System.out.println(mylist.contains("C++"));
		System.out.println(mylist.contains("C"));
		
		//Reading all the element from array list
		/*for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
			
		for(Object ele:mylist)
		{
			System.out.println(ele);
		}
		*/
		//Using iterator
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//checking array list empty or not
		System.out.println("Is arry list empty?:"+mylist.isEmpty());
		
		//remove all the element is array list
		ArrayList mylist2=new ArrayList();
		mylist2.add(10.5);
		mylist2.add('A');
		
		mylist.removeAll(mylist2);
		System.out.println("Remove two elements: "+mylist);
		
		//remove all the element/clear
		mylist.clear();
		System.out.println("Is arry list empty?:"+mylist.isEmpty());
		
		
	}

}
