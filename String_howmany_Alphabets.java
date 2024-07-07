package assignment1;

import java.util.Arrays;

public class String_howmany_Alphabets {

	static int  count_of_Alphabets;
	
	public static void main(String[] args)
	{
		String s1 = "100cents";
		char c1[] = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i = 0; i<s1.length(); i++)
		{
			boolean b1 = Character.isLetter(c1[i]);
			System.out.println(b1);
			
			if(b1 == true)
			{
				count_of_Alphabets++;
				
			}			
		}
		System.out.println("the no of letters in the given string is -->"+ count_of_Alphabets);

	}

}
