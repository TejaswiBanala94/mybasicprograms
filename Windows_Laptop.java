package abstractclassprograms;
abstract class Command_Prompt//abstract class
{
	abstract void add(); //abstract method
}
public class Windows_Laptop extends Command_Prompt  //concreate class  
{

	void add()
	{
		System.out.println("The real implementation will be here");
		
		
	}
	public static void main(String[] args)   //concreate method
	{
		new Windows_Laptop().add();
		

	}

	
}
