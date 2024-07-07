package assignment1;
import java.util.*;
public class String_howmany_Numericletters {
static int count_of_digit;
	public static void main(String[] args) 
	{
		String s1 = "50cent";
		char c1[] = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i = 0; i<s1.length();i++)
		{
			boolean b1 = Character.isDigit(c1[i]);
			System.out.println(b1);
			if(b1 == true)
			{
				count_of_digit++;
				
			}
		}
		System.out.println("the number of digits in the given string is -->"+ count_of_digit);
		
		
		
	}

}
