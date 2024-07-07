package assignment1;

public class Updating_Global_Variable 
{
	int age = 30;
	static int salary = 40000;
	
	

	public static void main(String[] args)
	{
		salary = 30000;
		System.out.println(salary);
		Updating_Global_Variable g1 = new Updating_Global_Variable();
		System.out.println(g1.age=40);
		

	}

}
