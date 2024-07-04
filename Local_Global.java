package basic_additions;

public class Local_Global
{
	int age = 30;
	static double salary = 50000.39;
	
	public static void main(String[] args)
	{
		System.out.println(salary);
		Local_Global l1 = new Local_Global();
		System.out.println(l1.age);
		

	}

}
