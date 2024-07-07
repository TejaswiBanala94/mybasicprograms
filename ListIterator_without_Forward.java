package collectionprograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_without_Forward {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Mouni");
		a1.add("Siri");
		a1.add("Ayaan");
		a1.add("Venky");
		System.out.println(a1);
		
		ListIterator i1 = a1.listIterator();
		System.out.println("lets Iterate in backward direction");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
		

	}

}
