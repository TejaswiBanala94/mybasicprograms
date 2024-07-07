package assignment1;

public class Overload_Mainmethod
{
	public static void main()
	{
		System.out.println("Overloading main method without args");
		
	}

	public static void main(String Your_name)
	{
		System.out.println("Overloading main method with string args");
		
	}
	public static void main(double salary)
	{
		System.out.println("Overloading main method with double args");
		
	}
	public static void main(String[] args)
	{
		main("tejaswi");
		main(34.34);
		main();
	}

}
