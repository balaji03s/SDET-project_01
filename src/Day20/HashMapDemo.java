package Day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		
		//Adding pairs
		
		hm.put(101,"Bala");
		hm.put(102,"John");
		hm.put(103,"Uma");
		hm.put(104,"Moni");
		hm.put(102,"Mani");
		
		System.out.println(hm);
		System.out.println("Size of HashMap: "+hm.size());
		
		//Access value of the key
		System.out.println(hm.get(102)); //key
		
		//get all the keys from hashmap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		//for...each
		for(int k:hm.keySet())
		{
			System.out.println(k+"   "+hm.get(k));
		}
		
		//using Iterator
		Iterator <Entry<Integer, String>>it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String>entry=it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());
		
		
		
		
	}
	

}
