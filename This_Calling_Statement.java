package inheritance.program.java;

public class This_Calling_Statement
{
	 This_Calling_Statement(int a)
	 {
		 System.out.println("1");
	 }
	 This_Calling_Statement(int a,double b)
	 {
		 this(23);
		 System.out.println("2");
	 }
	 This_Calling_Statement(int a,int b)
	 {
		 this(10,27.34);              
		 System.out.println("3");
	 }
	public static void main(String[] args)
	{
		new  This_Calling_Statement(23,45);
		 
		

	}

}
