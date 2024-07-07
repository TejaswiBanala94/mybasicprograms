package abstractclassprograms;

public class Access_Specifier_Methods
{
	public void add()
	{
		System.out.println("public");
	}
	protected void sub()
	{
		System.out.println("protected");
	}
	private void mul()
	{
		System.out.println("private");
	}
	void div()
	{
		System.out.println("default");
	}
	

	public static void main(String[] args) 
	{
		new Access_Specifier_Methods().add();
		new Access_Specifier_Methods().sub();
		new Access_Specifier_Methods().mul();
		new Access_Specifier_Methods().div();

	}

}
