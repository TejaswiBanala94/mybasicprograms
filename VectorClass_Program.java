package collectionprograms;

import java.util.Collections;
import java.util.Vector;

public class VectorClass_Program {

	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add("teju");
		v1.add("mouni");
		v1.add("ayaan");
		v1.add("surya");
		//Collections.sort(v1);//sorting
		System.out.println(v1);//following indexing
		v1.add(null);
		v1.add(null);
		v1.add(null);
		System.out.println(v1);//Accepting null
		v1.add(53);
		v1.add(454.4646);
		v1.add('c');
		System.out.println(v1);//Accepting hetrogenious value
		v1.add("teju");
		v1.add("mouni");
		v1.add("ayaan");
		v1.add("surya");
		System.out.println(v1);
		
		

	}

}
