package assignment1;

import java.util.Arrays;

public class Anagram_Problem 
{

	public static void main(String[] args)
	{
		String a1 = "eagle";
		String a2 = "angel";
		
		if(a1.length()!= a2.length())
		{
			System.out.println("Its not an anagram");
		}
		else
		{
			System.out.println("Eligible to become an anagram but see...");
			
			char c1[] = a1.toCharArray();
			char c2[] = a2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			boolean b1 =Arrays.equals(c1, c2);
			
			if(b1 == true)
			{
				System.out.println("the given two strings are Anagram");
			}
			else
			{
				System.out.println("the given two strings are not Anagram");
			}
		
		}
		

	}

}
