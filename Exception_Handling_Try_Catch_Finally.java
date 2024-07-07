package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling_Try_Catch_Finally 
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		try
		{
		System.out.println("Enter the valid age");
		int age =s1.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Age must be valid numeric value,please enter again");
			Scanner s2 =new Scanner(System.in);
			System.out.println("Enter the valid age");
			try
			{
			int age1 =s2.nextInt();
			}
			catch(InputMismatchException a2)
			{
				System.out.println("Again you entered an invalid input,please enter again");
				Scanner s3 = new Scanner(System.in);
				System.out.println("Enter the valid age");
				int age2 =s3.nextInt();
			}
		}
		finally
		{
			System.out.println("No matter i will always be there");
		}
		

	}

}
