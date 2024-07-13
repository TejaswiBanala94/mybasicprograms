package sibiibprograms;

public class SIB_IIB_Mainmethod_Constuctor 
{
	//SIB
	static 
	{
		System.out.println("when ever main method is present sib will execute first");
	}
	//IIB
	{
		System.out.println("IIB");
	}
	SIB_IIB_Mainmethod_Constuctor()
	{
		System.out.println("After creating the object IIB will execute after that constructor will execute");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new SIB_IIB_Mainmethod_Constuctor();

	}

}
