package assignment1;

public class Static_Method_Inside_Mainmethod
{
	static void addition()
	{
		System.out.println("Addition of 2 numbers");
	}
	static void subtraction(int a,int b)
	{
		int sub= a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) 
	{
		addition();
		subtraction(40,20);
		
	}

}
