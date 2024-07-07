package assignment1;

import java.util.Scanner;

public class Switch_Add_Sub_Mul_Div 
{

	static int a = 20;
	static int b = 10;

	public static void main(String[] args) 
	{
		 Scanner s1 =new Scanner(System.in);
		 System.out.println("Choose any case  1 to 4");
		  
		 int c = s1.nextInt();
		
		switch(c)
		{
		case 1:
			int sum = a+b;
			System.out.println("The Addition of a & is-->"+sum);
			break;
		
		case 2:
			int sub = a-b;
			System.out.println("The subtraction of a & is-->"+sub);
			break;

		case 3:
			
			int mul = a*b;
			System.out.println("The multiplication of a & is-->"+mul);
			break;

		case 4:
			int div = a/b;
			System.out.println("The division of a & is-->"+div);
			break;
		default:
			System.out.println("None of the option selected, please choose any one...");
			
		}
		

	}

}
