package assignment1;

import java.util.Scanner;

public class Switch_Case_Example 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Choose which browser to launch");
		System.out.println("Remember 1 for Firefox,2 for chrome,3 for safari,4 for edge browser");
		int a = s1.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Lanching Firefox browser");
			break;
		case 2:
			System.out.println("Lanching chrome browser");
			break;
		case 3:
			System.out.println("Lanching safari browser");
			break;
		case 4:
			System.out.println("Lanching edge browser");
			break;
			default:
				System.out.println("None of the option selected,can u please select...");
		}


	}

}
