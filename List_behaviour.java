package collectionprograms;

import java.util.ArrayList;
import java.util.List;

public class List_behaviour 
{

	public static void main(String[] args)
	{
		//upcasting arraylist to list
		List l1 = new ArrayList();
		//check indexing
		l1.add(90);
		l1.add(45);
		l1.add(12);
		System.out.println(l1);
		//duplicate
		l1.add(90);
		l1.add(90);
		System.out.println(l1);
		//null checking
		l1.add(null);
		l1.add(null);
		System.out.println(l1);

	}

}
