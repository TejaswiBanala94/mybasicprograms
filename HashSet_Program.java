package collectionprograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_Program {

	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add("teju");
		h1.add("mouni");
		h1.add("ayaan");
		h1.add("surya");
		//Collections.sort(h1);//sorting
		System.out.println(h1);//Not following indexing
//		h1.add(null);
//		h1.add(null);
//		h1.add(null);
//		System.out.println(h1);//does not Accepting null
		h1.add(53);
		h1.add(454.4646);
		h1.add('c');
		System.out.println(h1);//Accepting hetrogenious value
		h1.add("teju");
		h1.add("teju");
		h1.add("tejaswi");
		h1.add("surya");
		System.out.println(h1);//Does not Accepting duplicate
		

	}

}
