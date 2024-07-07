package assignment1;

//import java.util.IllegalFormatException;
//
//import java.util.InputMismatchException;
import java.util.*;

public class Exception_Handling_Onetry_many_catches
{
public static void main(String[] args) 
	{
		int rollno[] = new int[3];//Array
		rollno[0] = 15;
		rollno[1] = 19;
		rollno[2] = 20;
try {
		rollno[3] = 40;
		
}
catch(ArrayIndexOutOfBoundsException e1)
{
	System.out.println("you exeeded the size");
	
}
catch(NullPointerException e2)
{
	System.out.println("handled the exception NPE");
	
}
catch(InputMismatchException e3)
{
	System.out.println("handled the exception IME");
	
}
catch(IllegalFormatException e4)
{
	System.out.println("handled the exception IFE");
	
}
finally
{
	System.out.println("No matter exception is occure r not finally will execute");
}

	}

}
