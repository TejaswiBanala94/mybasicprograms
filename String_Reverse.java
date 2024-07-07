package assignment1;

public class String_Reverse {

	public static void main(String[] args) 
	{
		String name = "My name is Tejaswi";
		String input = name.toLowerCase();
		System.out.println(input);
		String reverse = "";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1 = input.charAt(i);
			reverse  = reverse + c1 ;	
		}
		System.out.println(reverse);
		
	}

}
