package assignment1;

import java.util.Arrays;

public class String_howmany_Spaces 
{

	static int count_of_Space;
	public static void main(String[] args)
	{
		String s1 = "my name is tejaswi";
		
		char c1[] = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i = 0 ; i<s1.length(); i++)
		{
			
			boolean b1 = Character.isSpaceChar(c1[i]);
			System.out.println(b1);
		
		if(b1 == true)
		{
			count_of_Space++;
			
		}
		
		}
		System.out.println("the spaces of the given string is--> "+count_of_Space);
	}
	

}
