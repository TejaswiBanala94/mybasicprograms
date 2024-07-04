package basic_additions;

public class NonStaticmethod_Overloading 
{
	void add(double a)
	{
		double sum=6+a;
		System.out.println(sum);
	}
	void add(int a)
	{
		int sum = a+6;
		System.out.println(sum);
		
	}

	public static void main(String[] args) 
	{
		NonStaticmethod_Overloading n1 = new NonStaticmethod_Overloading();
		n1.add(90);
		n1.add(3.76);
		

	}

}
