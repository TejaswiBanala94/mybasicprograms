package assignment1;

public class And_with_Not {

	public static void main(String[] args) 
	{
		int age = 30;
		int salary = 20000;
		
		if(!(age == 20 && salary == 1000))//f  f=!f=t
		{
			System.out.println("And operator with not ");
		}
		if(!(age == 30 && salary == 10000))//t f=!f=t
		{
			System.out.println("And operator with not ");
		}
		if(!(age == 20 && salary == 20000))//f t=!f=t
		{
			System.out.println("And operator with not ");
		}
		if(!(age == 30 && salary == 20000))//t t=!t=f
		{
			System.out.println("And operator with not ");
		}
		

	}

}
