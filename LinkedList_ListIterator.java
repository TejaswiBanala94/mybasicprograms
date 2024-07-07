package collectionprograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_ListIterator {

	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add("Mouni");
		l1.add("Pooja");
		l1.add("Siri");
		l1.add("Soumya");
		l1.add("Alexa");
		System.out.println(l1);
		System.out.println("Now using list iterator farward traversing");
		
		ListIterator lI = l1.listIterator();
		while(lI.hasNext())
		{
			System.out.println(lI.next());
		}
		System.out.println("Now using list iterator backward traversing");
		while(lI.hasPrevious())
		{
			System.out.println(lI.previous());
		}
		

	}

}
