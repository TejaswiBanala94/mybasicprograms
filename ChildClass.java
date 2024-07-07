package assignment1;
class ParentClass
{
	static void add()
	{
		int a= 4;
		int b= 10;
		int sum = a+b;
		System.out.println(sum);
	}
	
}

public class ChildClass extends ParentClass 
{
	static void subtract()
	{
		int a= 4;
		int b= 10;
		int subtract = a-b;
		System.out.println(subtract);
	}

	public static void main(String[] args) 
	{
		add();
		subtract();

	}

}
