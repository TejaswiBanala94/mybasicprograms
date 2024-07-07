package collectionprograms;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayList_Program_Iterator_Method {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Tejaswi");
		a1.add("Amrutha");
		a1.add("Abhilash");
		a1.add("Ayaansh");
		System.out.println(a1);
		
		Iterator i1 = a1.iterator();
		while(i1.hasNext()) //true if the iteration has more elements
		{
			System.out.println(i1.next()); ////true if the iteration has more elements
		}
		

	}

}
