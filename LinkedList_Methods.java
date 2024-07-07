package collectionprograms;

import java.util.LinkedList;

public class LinkedList_Methods {

	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add("teju");
		l1.add("mouni");
		l1.add("ayaan");
		l1.add("surya");
		l1.add("Venky");
		l1.add("Siri");
		System.out.println(l1);	
  		l1.addFirst("Sushma");  //addFirst
		System.out.println(l1);
		l1.addLast("Meena");
		System.out.println(l1);  //addLast
		l1.removeFirst();
		System.out.println(l1); //removeFirst
		l1.removeLast();
		System.out.println(l1);  //removeLast
		
		
		System.out.println(l1.getFirst());  //getFirst
		System.out.println(l1.getLast());  //getLast
		System.out.println(l1);
		l1.pollFirst();
		System.out.println(l1);//PollFirst
		l1.pollLast();  //PollLast
		System.out.println(l1);
		
		
		

	}

}
