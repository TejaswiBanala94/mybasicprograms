package assignment1;

public class Or_Operator_with_Not {

	public static void main(String[] args)
	{
		char gender = 'F';
		int salary=20000;
		if(!(salary == 20000 || gender=='F'))//t t =!t=f
		{
			System.out.println("If any one is true,it will execute");
		}
		if(!(salary == 20000 || gender=='M'))//t f=!t=f 
		{
			System.out.println("If any one is true,it will execute");
		}
		if(!(salary == 10000 || gender=='F'))//f t=!t=f 
		{
			System.out.println("If any one is true,it will execute");
		}
		if(!(salary == 10000 || gender=='M'))//f f =!f=t
		{
			System.out.println("If any one is true,it will execute....");
		}
	

	}

}
