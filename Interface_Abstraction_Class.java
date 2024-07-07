package abstractclassprograms;
interface Grand_Parent1
{
	void add1();
	void add2();
}
abstract class Parent_Class1 implements Grand_Parent1
{
	abstract void sub1();
	abstract void sub2();
	
	static void mul1()
	{
		System.out.println("Multiplication of two numbers");
	}
	void mul2()
	{
		System.out.println("Multiplication2");
	}
    public void add1()
    {
	  System.out.println("Add1 from interface");	
		
	}
	public void add2() 
	{
		System.out.println("Add2 from interface");
		
	}
}

public class Interface_Abstraction_Class extends Parent_Class1 
{
	static void div1()
	{
		System.out.println("Div1");
	}
	static void div2()
	{
		System.out.println("Div2");
	}
    void sub1()
    {
    	System.out.println("sub1 from abstraction class");
		
	}
	void sub2() 
	{
		System.out.println("sub2 from abstraction class");
		
	}
	
	public static void main(String[] args)
	{
		new Interface_Abstraction_Class().add1();
		new Interface_Abstraction_Class().add2();
		new Interface_Abstraction_Class().sub1();
		new Interface_Abstraction_Class().sub2();
		new Interface_Abstraction_Class().mul2();
		mul1();
		div1();
		div2();
		
		
	}

	

	
	
}
