package collectionprograms;
class Delhi
{
	void vehicle()
	{
		System.out.println("Vehicle");
	}
	void busses()
	{
	    System.out.println("Bussess");	
	}
	
}

public class Upcasting_one_Bangalore extends Delhi
{
	void add()
	{
		System.out.println("Addition");
	}

	public static void main(String[] args)
	{
		Delhi d1 =new Upcasting_one_Bangalore();
		d1.vehicle();
		d1.busses();
		
//		Upcasting_one_Bangalore b1 = new Upcasting_one_Bangalore();
//		b1.add();
//		
		

	}

}
