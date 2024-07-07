package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Program {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("teju");
		a1.add("mouni");
		a1.add("ayaan");
		a1.add("surya");
		//Collections.sort(a1);//sorting
		System.out.println(a1);//following indexing
		a1.add(null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);//accepting null
		a1.add(34);
		a1.add('d');
		a1.add(63);
		System.out.println(a1);//Accepting hetrogenious value
		a1.add("ayaan");
		a1.add("ayaan");
		a1.add("ayaan");
		System.out.println(a1);//Accepting duplicate
		//printing in order of insertion

		
		
		

	}

}
