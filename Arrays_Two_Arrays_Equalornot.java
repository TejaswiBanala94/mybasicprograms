package assignment1;

import java.util.Arrays;

public class Arrays_Two_Arrays_Equalornot
{

	public static void main(String[] args)
	{
		int rollno[] = {12,15,16,17,19};
		int marks[] = {22,51,16,71,19};
		
		boolean b1 = Arrays.equals(rollno, marks);
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(marks));
		if(b1==true)
		{
	    System.out.println("the given two arrays are equal to each other");
	    
		}
		else
		{
			System.out.println("the given two arrays are not equals to each other");
			
		}
			
	}

}
