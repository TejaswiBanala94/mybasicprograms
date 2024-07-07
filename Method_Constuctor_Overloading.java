package assignment1;

public class Method_Constuctor_Overloading 
{
	static void add(double b)
	{
		double sum = 1+b;
		System.out.println(sum);
		
	}
	static void add(int a, int b)
	{
		double sum = a+b;
		System.out.println(sum);
		
	}
	
	
	  void multiply(double a) 
	  { 
		  double mul = a*1;
		  System.out.println(mul);
	  
	  }
	 
	
	  void multiply(int b,int c)
	  {
		  int mul = b*c;
		  System.out.println(mul);
	  
	  }
	 
		
		  Method_Constuctor_Overloading(int a,int b) 
		  {
			  int mul = a*b;
		  System.out.println(mul);
		  
		  } 
		  
		  Method_Constuctor_Overloading(char c)
		  {
		  
		  System.out.println("char datatype");
		  
		  }
		 
	
	public static void main(String[] args)
	{
		add(17.83);
		add(50,60);
		
		  Method_Constuctor_Overloading m1 = new Method_Constuctor_Overloading(10,30);
		  m1.multiply(12.46);
		  m1.multiply(20,30);
		  Method_Constuctor_Overloading m2 = new Method_Constuctor_Overloading('B');
			 
		 
		 
		 
	}

}
