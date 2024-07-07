package collectionprograms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Iterator {

	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add("teju");
		l1.add("mouni");
		l1.add("ayaan");
		l1.add("surya");
		l1.add("Manisha");
		System.out.println(l1);
		
		Iterator i1 = l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		

	}

}
