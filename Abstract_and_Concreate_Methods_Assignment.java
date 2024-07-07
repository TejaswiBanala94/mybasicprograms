package abstractclassprograms;
class Notepad
{
	void add()
	{
		int a = 4;
		int b = 6;
		int sum = a+b;
		System.out.println(sum);
		
	}
	void subtract()
	{
		int a = 37;
		int b = 6;
		int subtract = a-b;
		System.out.println(subtract);
		
	}
	
}
abstract class Command_Prompt1 extends Notepad
{
	abstract void add1();
	abstract void subtract1();
	
	void mul()
	{
		int a = 14;
		int b = 10;
		int mul = a*b;
		System.out.println(mul);
		
	}
	void div()
	{
		int a = 4;
		int b = 4;
		int div = a/b;
		System.out.println(div);
		
	}
		
}

public class Abstract_and_Concreate_Methods_Assignment extends Command_Prompt1 
{
	
	void add1() 
	{
		System.out.println("Addition of two numbers");
	}

	
	void subtract1()
	{
		System.out.println("Subtraction of two numbers");
	}
	void mod1()
	{
		System.out.println("Modulus one");
	}
	void mod2()
	{
		
		System.out.println("Modulus two ");
	}

	public static void main(String[] args)
	{
		new Abstract_and_Concreate_Methods_Assignment().add();
		new Abstract_and_Concreate_Methods_Assignment().add1();
		new Abstract_and_Concreate_Methods_Assignment().subtract();
		new Abstract_and_Concreate_Methods_Assignment().subtract1();
		new Abstract_and_Concreate_Methods_Assignment().mul();
		new Abstract_and_Concreate_Methods_Assignment().div();
		new Abstract_and_Concreate_Methods_Assignment().mod1();
		new Abstract_and_Concreate_Methods_Assignment().mod2();
		

	}

	

}
