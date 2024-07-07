package assignment1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch_Exception
{
	// static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
try {
	System.out.println("enter the valid age");
		int age = s1.nextInt();
		
}
catch(InputMismatchException a1)
{
	System.out.println("Hey age must be a valid numeric value ,please enter gain");
      Scanner s2 = new Scanner(System.in);
	System.out.println("enter the valid age");
	int age = s2.nextInt();
}
       System.out.println("Please enter your name");
      Scanner s3 = new Scanner(System.in);
		String name = s3.next();
		
		
		

	}

}
