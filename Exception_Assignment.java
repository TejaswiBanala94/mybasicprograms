package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Assignment 
{
	public static void main(String[] args) 
	{
		
	try
	{
	    Scanner s1 =new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = s1.nextInt();
		System.out.println("Please enter your salary");
		double salary = s1.nextDouble();
		System.out.println("Please enter your weight");
		float weigth = s1.nextFloat();
		System.out.println("Are you a student");
		boolean student = s1.nextBoolean();
		
	}
	catch(InputMismatchException a1)
	{
		System.out.println("Please fill the form again");
		Scanner s2 = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = s2.nextInt();
		System.out.println("Please enter your salary");
		double salary = s2.nextDouble();
		System.out.println("Please enter your weight");
		float weigth = s2.nextFloat();
		System.out.println("Are you a student");
		boolean student = s2.nextBoolean();
		
	}
		
	}

}
