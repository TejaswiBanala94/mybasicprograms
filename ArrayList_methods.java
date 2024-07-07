package collectionprograms;

import java.util.ArrayList;

public class ArrayList_methods {

	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add("Tejaswi");
		a1.add("Ayaansh");
		a1.add("Sneha");
		a1.add("Venky");
		a1.add("Roma");
		System.out.println(a1);
		
		int indexofvenky = a1.indexOf("Venky");
		System.out.println(indexofvenky);
		System.out.println(a1.get(2));
		a1.set(3, "Mouni");
		System.out.println(a1);
		
		

	}

}
