package inheritance.program.java;
class ParentClass
{
	static void add()
	{
		int a = 10;
		int b = 3;
		int sum = a+b;
		System.out.println(sum);
	}
	
}

public class Single_Level_Inheritance extends ParentClass
{
	 void sub()
	{
		int a = 10;
		int b = 3;
		int sub = a-b;
		System.out.println(sub);
	}
	

	public static void main(String[] args)
	{
		Single_Level_Inheritance s1 = new Single_Level_Inheritance();
		s1.sub();
		add();
		
		

	}

}
