package assignment1;

public class Array_Finding_an_Index 
{
	static int no_to_check =20;

	public static void main(String[] args) 
	{
		int no1[] = new int[5];
		no1[0] = 10;
		no1[1] = 20;
		no1[2] = 30;
		no1[3] = 40;
		no1[4] = 50;
		
		for(int i = 0 ; i<no1.length;i++)
		{
			if(no_to_check == no1[i])
			{
			System.out.println("number 20 is present in the given array and the index of the array is-->" +i);	
			}
		}
		System.out.println("there is no such number in the given array");
	}

}
