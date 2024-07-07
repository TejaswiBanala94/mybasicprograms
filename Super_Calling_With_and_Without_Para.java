package inheritance.program.java;

class Set_URL
{
	Set_URL()
	{
		System.out.println("Set_URL");
	}
}
class Launch_the_browser extends Set_URL
{
	Launch_the_browser(String name)
	{
	
		System.out.println("Launch_the_browser");
	}
}
public class Super_Calling_With_and_Without_Para extends Launch_the_browser 
{
	Super_Calling_With_and_Without_Para()
	{
		super("Tejaswi");
		System.out.println("SuperClass_with_Para_without_Pr");
	}

	public static void main(String[] args)
	{
		Super_Calling_With_and_Without_Para s1 = new Super_Calling_With_and_Without_Para();

	}

}
