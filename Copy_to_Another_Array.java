package assignment1;

import java.util.Arrays;

public class Copy_to_Another_Array 
{

	public static void main(String[] args) 
	{	
		int rollno[] = new int[5];
		rollno[0] = 10;
		rollno[1] = 13;
		rollno[2] = 14;
		rollno[3] = 15;
		rollno[4] = 90;	
		
		int rollno_copied[]=new int[rollno.length];//5
		for(int i=0;i<rollno.length;i++)
		{
			rollno_copied[i]=rollno[i];

		}
		
	System.out.println(Arrays.toString(rollno));
	System.out.println(Arrays.toString(rollno_copied));
	
	
	}

}
