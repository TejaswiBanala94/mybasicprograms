package assignment1;

import java.util.Scanner;

public class Scanner_Class_Arithmetic_Operators
{
	 static Scanner s1 = new Scanner(System.in);
	
	static void add()
	{
		System.out.println("Enter a and b values for addition");
		int a =s1.nextInt();
		int b = s1.nextInt();
		int sum = a + b ;
		System.out.println("the addition of a and b is ->"+sum);
		
	}
	static void sub()
	{
		System.out.println("Enter a and b values for subtraction");
		int a =s1.nextInt();
		int b = s1.nextInt();
		int sub = a - b ;
		System.out.println("the subtraction of a and b is ->"+sub);
		
	}
	static void mul()
	{
		System.out.println("Enter a and b values for multiplication");
		int a =s1.nextInt();
		int b = s1.nextInt();
		int mul = a * b ;
		System.out.println("the multiplication of a and b is ->"+mul);
		
	}
	static void div()
	{
		System.out.println("Enter a and b values for division");
		int a =s1.nextInt();
		int b = s1.nextInt();
		int div = a / b ;
		System.out.println("the divition of a and b is ->"+div);
		
	}
	
	static void mod()
	{
		System.out.println("Enter a and b values for modulus");
		int a =s1.nextInt();
		int b = s1.nextInt();
		int mod = a % b ;
		System.out.println("the modulus of a and b is ->"+mod);
		
	}

	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
		mod();
		
		

	}

}
