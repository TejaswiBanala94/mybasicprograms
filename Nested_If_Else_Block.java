package assignment1;

public class Nested_If_Else_Block {
	
	public static void main(String[] args)
	{
		
		int a=120;
		int b=200;
		int c=120;
		if(a<b)//true
		{
			if(a<c)//false
			{
				System.out.println("a is lesser than b");
				
				if(b<c)//false
				{
					System.out.println("a is lesser than c ");
					
				}
					
				else
				{
					System.out.println("b is greater than a");
				}
			 
			}
			else
			{
				System.out.println("b is greater than c");
			}
			
		}
	  else
		{
		  System.out.println("c is bigger");
		}
		

	}

}
