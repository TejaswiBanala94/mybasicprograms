package sibiibprograms;

public class SIB_IIB_Constructor_With_and_Without_Para
{
	static
	{
		System.out.println("SIB");
	}
	SIB_IIB_Constructor_With_and_Without_Para()
	{
		System.out.println("constructor without para");
	}
	SIB_IIB_Constructor_With_and_Without_Para(int a)
	{
		System.out.println("Constructor with para");
	}
	//IIB
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB 1");
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new SIB_IIB_Constructor_With_and_Without_Para();
		//System.out.println("Main method"); //sib ,mainmethod,iib,iib1,con-nonpara,iib,iib1,con-para
		new SIB_IIB_Constructor_With_and_Without_Para(200);
		

	}

}
