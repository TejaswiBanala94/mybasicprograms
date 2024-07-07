package collectionprograms;

import java.util.Collections;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSet_Program {

	public static void main(String[] args)
	{
		TreeSet t1 = new TreeSet();
		t1.add("teju");
		t1.add("mouni");
		t1.add("ayaan");
		t1.add("surya");
		//Collections.sort(t1);//sorting
		//System.out.println(t1);//Not following indexing
//		t1.add(null);
//		t1.add(null);
//		t1.add(null);
//		System.out.println(t1);//does not Accepting null
//		t1.add(53);
//		t1.add(454.4646);
//		t1.add('c');
//		System.out.println(t1);//Does not Accepting hetrogenious value
		t1.add("teju");
		t1.add("teju");
		t1.add("tejaswi");
		t1.add("surya");
		System.out.println(t1);
		

	}

}
