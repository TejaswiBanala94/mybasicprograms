package assignment1;

import java.util.Arrays;

public class String_to_Array_Convertion {

	public static void main(String[] args)
	{
		String s1 = "my batch name";
	//  char c1[] = s1.toCharArray(); //converting to char and printing the array
		
		String c1[] =s1.split(" ",3); //splitting the array into 3 string
		
		System.out.println(Arrays.toString(c1));
	}

}
