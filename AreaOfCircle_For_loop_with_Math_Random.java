package assignment1;

public class AreaOfCircle_For_loop_with_Math_Random 
{
	static double pi_value = Math.PI;

	public static void main(String[] args)
	{
		for( int i=1;i<=10;i++)
		{
			double r = Math.random();
			double area = Math.PI * r*r;
			System.out.println("Area of circle is-->"+area);
		}
		

	}

}
