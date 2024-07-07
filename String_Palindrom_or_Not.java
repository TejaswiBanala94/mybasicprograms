package assignment1;

public class String_Palindrom_or_Not 
{

	public static void main(String[] args) 
	{
	String name = "rotator";
	String input = name.toLowerCase();
	String reverse = "";
	for(int i = input.length()-1;i>=0;i--)
	{
		char c1 = input.charAt(i);
		reverse  = reverse + c1 ;	
	}
	System.out.println(reverse);
	
	boolean result = input.equals(reverse);
	System.out.println(result);
	if(result == true)
	{
		System.out.println("it is a palindrom");

	}
	else
	{
		System.out.println("it is  not a palindrom");
	}

}
}
