package inheritance.program.java;
class Method_Parent
{
	void login()
	{
		
		System.out.println("Login from the mobile number");
	}
}
public class MethodOverriding extends Method_Parent
{                                                                     
	void login()
	{
		
		System.out.println("Login from Email id");
	}
	

	public static void main(String[] args) 
	{
		MethodOverriding m1 = new MethodOverriding();
		m1.login();

	}

}
