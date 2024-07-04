package basic_additions;

public class And_Operator
{

	public static void main(String[] args) 
	{
		int age = 30;
		int salary = 20000;
		
		if(age == 20 && salary == 1000)//f  f
		{
			System.out.println("I will execute if both are true");
		}
		if(age == 30 && salary == 10000)//t f
		{
			System.out.println("I will execute if both are true");
		}
		if(age == 20 && salary == 20000)//f t
		{
			System.out.println("I will execute if both are true");
		}
		if(age == 30 && salary == 20000)//t t
		{
			System.out.println("I will execute if both are true...");
		}
	}

}
