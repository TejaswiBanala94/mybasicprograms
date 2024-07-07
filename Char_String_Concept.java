package assignment1;

public class Char_String_Concept 
{

	public static void main(String[] args)
	{
		String a ="I love my India";
		char first_char = a.charAt(14);
		System.out.println(first_char);
		
		int i1 = a.indexOf('i');
		System.out.println(i1);
		
		String trimmed = a.trim();
		System.out.println(trimmed);
		String b = "    hello boy how are you   ";
		System.out.println(b);
		System.out.println(b.trim());
		
		String c ="Hello Tejaswi";
		String c1 = c.substring(6);
		System.out.println(c1);
		String c2 = c.substring(6,13);
		System.out.println(c2);
		
		String input ="manish kumar tiwari";
			String c3 = input.substring(13,19);
			System.out.println(c3);
		
		

	}

}
