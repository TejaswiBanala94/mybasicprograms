package collectionprograms;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_behaviour 
{

	public static void main(String[] args)
	{
		//linkedhasset arraylist to set
		Set s1 = new TreeSet();
		s1.add(12);
		s1.add(18);
		s1.add(6);
		s1.add(87);
		s1.add(65);
		System.out.println(s1);
		//duplicate
		s1.add(87);
		s1.add(87);
		System.out.println(s1);
		//accepting null
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		//iterate iterator
		//does not iterate the ListIterator

	}

}
