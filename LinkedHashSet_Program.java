package collectionprograms;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet_Program {

	public static void main(String[] args)
	{
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add("teju");
		l1.add("mouni");
		l1.add("ayaan");
		l1.add("surya");
		//Collections.sort(l1);//sorting
		System.out.println(l1);//following indexing
//		l1.add(null);
//		l1.add(null);
//		l1.add(null);
//		System.out.println(l1);//does not Accepting null
		l1.add(53);
		l1.add(454.4646);
		l1.add('c');
		System.out.println(l1);//Accepting hetrogenious value
//		l1.add("teju");
//		l1.add("teju");
//		l1.add("tejaswi");
//		l1.add("surya");
//		System.out.println(l1);	

	}

}
