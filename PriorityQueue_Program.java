package collectionprograms;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueue_Program {

	public static void main(String[] args)
	{
		PriorityQueue p1 = new PriorityQueue();
		p1.add("teju");
		p1.add("mouni");
		p1.add("ayaan");
		p1.add("surya");
		//Collections.sort(p1);//sorting
		//System.out.println(p1);//Not following indexing
//		p1.add(null);
//		p1.add(null);
//		p1.add(null);
//		System.out.println(p1);//does not Accepting null
//		p1.add(53);
//		p1.add(454.4646);
//		p1.add('c');
//		System.out.println(p1);//Does not Accepting hetrogenious value
		p1.add("teju");
		p1.add("teju");
		p1.add("tejaswi");
		p1.add("surya");
		System.out.println(p1);//Accepting duplicate
		

	}

}
