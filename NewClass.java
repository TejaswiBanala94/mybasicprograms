package abstractclassprograms;
 abstract class NewClassTwo
{
	abstract void add();
	abstract void subtract();
	
}
abstract class NewClassOne extends NewClassTwo
{
	abstract void add1();
	abstract void subtract1();
}
public class NewClass extends NewClassOne
{
	static void mul()
	{
		System.out.println("Multiplication");
	}
	void div()
	{
		System.out.println("Division");
	}
	void add1()
	{
		
		System.out.println("Abstract add1");
	}
	void subtract1()
	{
		System.out.println("Abstract subtrct1");
		
	}
	void add() 
	{
		System.out.println("Addition of two numbers");
		
	}
	void subtract() 
	{
		
		System.out.println("Subtraction of two numbers");
	}


	
	public static void main(String[] args)
	{
		mul();
		new NewClass().add();
		new NewClass().subtract();
		new NewClass().add1();
		new NewClass().subtract1();
		new NewClass().div();
			
	}
	
	
}
