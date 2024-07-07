package assignment1;

import java.util.Arrays;

public class String_howmany_SpecialChar 
{
	static int total;
	static int count_of_Digit;
	static int count_of_Alphabets;
	static int count_of_Space;
	static int count_of_SpecialChar;

	public static void main(String[] args)
	{
		String s1 = "tejaswi@ 4%#^% 5 $$";
		char c1[] = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		//System.out.println(s1.length());
		total = s1.length();
		System.out.println(total);
		
		for(int i = 0; i<s1.length();i++)
		{
			boolean b1 = Character.isDigit(c1[i]);
			System.out.println(b1);
			if(b1 == true)
			{
				count_of_Digit++;
			}
			boolean b2 = Character.isLetter(c1[i]);
			System.out.println(b2);
			if(b2 == true)
			{
				count_of_Alphabets++;
			}
			boolean b3 = Character.isSpaceChar(c1[i]);
			System.out.println(b3);
			if(b3 == true)
			{
				count_of_Space++;
			}
			
		} 
		count_of_SpecialChar = total-(count_of_Digit + count_of_Alphabets+count_of_Space);
		
//		int remaining = count_of_Digit + count_of_Alphabets+count_of_Space;
//		count_of_SpecialChar = total - remaining;
		
		System.out.println("the special character in the given string is-->"+ count_of_SpecialChar);
		System.out.println("the special character in the given string is-->"+ count_of_Digit);
		System.out.println("the special character in the given string is-->"+ count_of_Alphabets);
		System.out.println("the special character in the given string is-->"+ count_of_Space);
		

	}

}
