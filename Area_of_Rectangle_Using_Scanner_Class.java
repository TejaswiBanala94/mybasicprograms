package assignment1;

import java.util.Scanner;

public class Area_of_Rectangle_Using_Scanner_Class
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter length and width for finding Area");
		int length = s1.nextInt();
		int width = s1.nextInt();
		int area = length * width;
		System.out.println("The Area of Rectangle is->"+ area);
		
		

	}

//	static Scanner s1 = new Scanner(System.in);
//	
//	 void area()
//	{
//		System.out.println("Enter length and width for finding Area");
//		int length = s1.nextInt();
//		int width = s1.nextInt();
//		int area = length * width;
//		System.out.println("The Area of Rectangle is->"+ area);
//		
//		
//	}
//	
//	public static void main(String[] args)
//	{
//		Area_of_Rectangle_Using_Scanner_Class a1 = new Area_of_Rectangle_Using_Scanner_Class();
//		
//		a1.area();
		
//		
//	}
//
}
