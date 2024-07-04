package basic_additions;

public class NonStaticMethod 
{
	void add()
	{
		int a=20;
		int b=40;
		int sum=a+b;
		System.out.println(sum);
	}
	void subtract(int a,int b)
	{
	int sub=a-b;
	System.out.println(sub);
	
		
	}

	public static void main(String[] args) 
	{
		NonStaticMethod n1 = new NonStaticMethod();
		n1.add();
		n1.subtract(40,25);
	
	}

}
