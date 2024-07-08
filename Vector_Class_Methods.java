package legacyclass;

import java.util.Vector;

public class Vector_Class_Methods 
{

	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add("Mahesh");
		v1.add("Rajesh");
		v1.add("Tinku");
		v1.add("null");
		v1.add(32);
		System.out.println(v1);
		v1.addElement("Sushma");  //addElement
		v1.addElement("teju");
		System.out.println(v1);
		System.out.println(v1.firstElement());  //firstElement
		System.out.println(v1.lastElement());   //lastElement
		v1.removeElement("Tinku");   //removeElement
		System.out.println(v1);
		v1.removeElementAt(3);  //removeElementAt
		System.out.println(v1);
		v1.removeAllElements(); //removeAllElements
		System.out.println(v1);
		System.out.println(v1.capacity());  //capacity
		
		
		

	}

}
