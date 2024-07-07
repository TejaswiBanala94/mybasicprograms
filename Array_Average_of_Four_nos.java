package assignment1;

public class Array_Average_of_Four_nos
{
	static int sum = 0;
	static double average = 0;

	public static void main(String[] args) 
	{
		int no[] = new int[4];
		no[0] = 75;
		no[1] = 72;
		no[2] = 55;
		no[3] = 36;
		
		//int number[] = {77,72,55,36};  another way to write an array
		
		for(int i = 0; i<no.length; i++)
		{
			sum = sum+no[i];
		}
		System.out.println("the addition of 4 nos in array is"+sum);
		average = sum/no.length;
		System.out.println("the average of 4 numbers are-->"+average);
		 
		

	}

}
