package inheritance.program.java;
interface Amazon
{
	void login_with_email_id();
	void login_with_Mobile_no();
}
public class GroTechMinds implements Amazon  
{
    public void login_with_Mobile_no()
    {
		System.out.println("Keep the real logic of login with mobile no");
		
	}

	
	public void login_with_email_id()
	{
		System.out.println("Keep the real logic of login with email id");
		
	}

	public static void main(String[] args)
	{
		new GroTechMinds().login_with_Mobile_no();
		new GroTechMinds().login_with_email_id();
	}

	
	

}
