package assignment1;

import java.util.Arrays;

public class Array_Reverse_of_Array 
{
	static int k =0;

	public static void main(String[] args)
	{
		int rollno[] = {14,25,36,47,46};
		int rollno_reverse[] = new int[rollno.length];
		
		for(int i = rollno.length-1;i>=0;i--)
		{
		
			rollno_reverse[i] = rollno[k];
			k++;
			
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno_reverse));
	}

}
