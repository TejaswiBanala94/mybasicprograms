package package1_Con;

public class Constructor_Without_Subcls
{
	public Constructor_Without_Subcls()
	{
		System.out.println("Constructor having the access specifier as public");
	}
	private Constructor_Without_Subcls(int a)
	{
		System.out.println("Constructor having the access specifier as private");
	}
	protected Constructor_Without_Subcls(double d)
	{
		System.out.println("Constructor having the access specifier as protected");
	}
	Constructor_Without_Subcls(String name )
	{
		System.out.println("Constructor having the access specifier as default");
	}
	

}
