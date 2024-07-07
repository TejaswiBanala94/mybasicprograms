package assignment1;

import java.util.Arrays;

public class String_Function 
{

	public static void main(String[] args)
	{
		String name = "i am tejaswi";
		boolean answer = name.contains("am");
		System.out.println(answer);
		boolean answer1 = name.endsWith("tejaswi");
		System.out.println(answer1);

		String s1 = "manual";
		char c1[] = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
	}

}
