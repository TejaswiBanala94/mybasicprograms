package inheritance.program.java;
class SuperMostClass
{
	 void add()
	{
		int a = 20;
		int b = 45;
		int sum = a+b;
		System.out.println(sum);
		  
	}
	
}
class SuperClass extends SuperMostClass
{
	 void sub()
	{
		int a = 20;
		int b = 24;
		int sub = a-b;
		System.out.println(sub);
		  
	}
	
}

public class Multi_level_Inheritance extends SuperClass
{
	static void mul()
	{
		int a = 20;
		int b = 24;
		int mul = a*b;
		System.out.println(mul);
		  
	}

	public static void main(String[] args)
	{
		Multi_level_Inheritance m1 = new Multi_level_Inheritance();
		m1.add();
		m1.sub();
		mul();
		
	}

}
