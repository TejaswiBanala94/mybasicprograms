package inheritance.program.java;
interface Parent_c
{
	abstract void mul();
	abstract void div();
}
class Parent_Classb
{
	static void add()
	{
		System.out.println("Addition of two numbers");
	}
	void sub()
	{
		System.out.println("subtraction of two numbers");
	}
	
}

public class Multiple_Level_Inheretance extends Parent_Classb implements Parent_c

{

	public void mul()
	{
		System.out.println("Multiplication of two numbers");
		
	}
	public void div()
	{
		System.out.println("Division of two numbers");
		
	}
	public static void main(String[] args)
	{
		add();
		new Multiple_Level_Inheretance().sub();
		new Multiple_Level_Inheretance().mul();
		new Multiple_Level_Inheretance().div();	
	}
}
