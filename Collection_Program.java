package collectionprograms;

import java.util.ArrayList;

public class Collection_Program {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Tejaswi");
		a1.add("Amrutha");
		a1.add("Abhilash");
		a1.add("Ayaansh");
		System.out.println("the size of a1 is-->"+a1.size());
		System.out.println("Before removel-->"+a1);
		a1.remove("Tejaswi");
		System.out.println("After removel-->"+a1);
		
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		a2.add("surya");
		a2.removeAll(a1);
		System.out.println(a2);
		
		System.out.println(a1.size());
		
		System.out.println(a2.size());
		
		ArrayList a3 = new ArrayList();
		a3.add(1);
		a3.add(14);
		a3.add(36);
		a3.add(37);
		a3.add(67);
		System.out.println("Before clearing-->"+a3);
		a3.clear();
		System.out.println("After clearing-->"+a3);
		
	}

}
