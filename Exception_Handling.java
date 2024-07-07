package assignment1;

public class Exception_Handling
{
  public static void main(String[] args)
	{
		try {
			int a =1/0;//b from parent class and c from grand parent
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("handled the execution");
		}
		

	}

}
