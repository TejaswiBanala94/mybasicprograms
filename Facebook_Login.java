package abstractclassprograms;

interface Email
{
	void email_as_un();
}
interface Mobile_No
{
	void mobile_no_as_un();
}
public class Facebook_Login implements Email,Mobile_No
{

	public void mobile_no_as_un()
	{
		System.out.println("Mobile number as unimplementad");
	}
	public void email_as_un() 
	{
		System.out.println("Email as unimplemented");
		
	}

	public static void main(String[] args) 
	{
		new Facebook_Login().mobile_no_as_un();
		new Facebook_Login().email_as_un();
		

	}

	

}
