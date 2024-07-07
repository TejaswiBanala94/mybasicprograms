package abstractclassprograms;
abstract class Grand_Parent
{
	abstract void add();
}
abstract class Parent_Class extends Grand_Parent
{
	
	 void subtract()
	 {
		System.out.println("Subtraction"); 
	 }
}
public class Child_Class extends Parent_Class
{
	void add()
	{
		System.out.println("Addition");
	}
	
	void multiply()
	{
		System.out.println("Multiplication");
	}

	public static void main(String[] args) 
	{
		new Child_Class().add();
		new Child_Class().subtract();
		new Child_Class().subtract();
		
	}

}
