package assignment1;

public class Add_Sub_Mul_Div
{
	static void add()
	{
		int no1 = 30;
		int no2 = 20;
		
		int sum = no1 + no2;
		System.out.println(sum);
	}
	static void sub()
	{
		int no1 = 20;
		int no2 = 10;
		
		int sub = no1 - no2;
		System.out.println(sub);
	}
	static void mul()
	{
		int no1 = 24;
		int no2 = 11;
		
		int mul = no1 * no2;
		System.out.println(mul);
	}
	static void div()
	{
		int no1 = 12;
		int no2 = 11;
		
		int div = no1 / no2;
		System.out.println(div);
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
	}

}
