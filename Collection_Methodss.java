package collectionprograms;

import java.util.ArrayList;

public class Collection_Methodss 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add("Tejaswi");
		a1.add("Amrutha");
		a1.add("Abhilash");
		a1.add("Ayaansh");
		a1.add(32);
		a1.add(false);
		a1.add('c');
		a1.add(2345465);
		a1.add(null);
		a1.add("Tejaswi"); //add()
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);  //addAll
		a2.add("Ram");
		System.out.println(a2);
		
		System.out.println(a2.contains("Ram"));  //contains
		
		System.out.println(a2.containsAll(a1));  //containsAll
		
		System.out.println(a2.isEmpty());  //isEmpty
		
		ArrayList a3 = new ArrayList();
		System.out.println(a3.isEmpty());
		
		
		

	}

}
