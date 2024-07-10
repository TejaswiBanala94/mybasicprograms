package typecastingprogarams;
class Parent_Class
{
	void add()
	{
		System.out.println("Addition");
	}
}

public class Upcasting_Downcasting extends Parent_Class
{
	void sub()
	{
		System.out.println("Subtraction");
	}

	public static void main(String[] args) 
	{
		Parent_Class p1 = new Upcasting_Downcasting();   //upcasting implecitly
		Parent_Class p2 = (Parent_Class)new Upcasting_Downcasting(); //upcasting explicitly
		p1.add();
		Upcasting_Downcasting u1 = (Upcasting_Downcasting)p1;  //downcasting explicitly
		u1.sub();
		

	}

}
