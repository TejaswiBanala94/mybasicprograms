package assignment1;

public class Array_no15_Present_r_not
{
	static int no_to_check = 15;

	public static void main(String[] args) 
	{
		int rollno[] = new int[5];
		rollno[0] = 10;
		rollno[1] = 13;
		rollno[2] = 14;
		rollno[3] = 11;
		rollno[4] = 90;
		
		
		for(int i = 0; i<rollno.length;i++)
		{
			if(no_to_check == rollno[i])
			{
				System.out.println("15 is present in the given Array and its index is-->"+i);
			}	
		}
	
			System.out.println("there is no such number in the given Array");
			
	}

}
