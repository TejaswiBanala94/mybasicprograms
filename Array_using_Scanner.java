package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_using_Scanner 
{
	static Scanner s1 = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int rollno[] = new int[s1.nextInt()];
		
//		rollno[0] = s1.nextInt();
//		rollno[1] = s1.nextInt();
//		rollno[2] = s1.nextInt();   //instead of writing like this we can use for loop
//		rollno[3] = s1.nextInt();
//		rollno[4] = s1.nextInt();
		
		for(int i=0 ;i<rollno.length;i++)
		{
			rollno[i] = s1.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));	

	}

}
