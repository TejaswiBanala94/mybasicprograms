package assignment1;

import java.util.Scanner;

public class Circumference_of_Circle_Using_Scanner_Class 
{
	static double pi_value = Math.PI;

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter r value");
		int r = s1.nextInt();
		double cir = 2 * Math.PI * r;
		System.out.println("The circumference of a circle is->" + cir);
		

	}

}
