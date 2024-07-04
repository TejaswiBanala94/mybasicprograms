package basic_additions;

public class If_Multiple_Block 
{

	public static void main(String[] args)
	{
		int a=100;
		int b=400;
//		int c=650;
		if(a>b)//false
		{
			System.out.println("1");
		}
		if(a<b)//true
		{
			System.out.println("2");
			
		}
		if(a==b)//false
		{
			System.out.println("3");
		}
		if(a>=b)//false
		{
			System.out.println("4");
		}
		if(a<=b)//true
		{
			System.out.println("5");
		}
		if(a!=b)//true
		{
			System.out.println("6");
		}
		
	}
}
