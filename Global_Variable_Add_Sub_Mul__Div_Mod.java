package assignment1;

public class Global_Variable_Add_Sub_Mul__Div_Mod
{
	int a = 40;
	int b = 20;
	
	void add()
	{
		int sum = a+b;
		System.out.println(sum);
	}
	void sub()
	{
		int sub = a-b;
		System.out.println(sub);
	}
	void mul()
	{
		int mul = a*b;
		System.out.println(mul);
	}
	void div()
	{
		int div = a/b;
		System.out.println(div);
	}
	void mod()
	{
		int mod = a%b;
		System.out.println(mod);
	}
	

	public static void main(String[] args)
	{
		Global_Variable_Add_Sub_Mul__Div_Mod g1 = new Global_Variable_Add_Sub_Mul__Div_Mod();
		g1.add();
		g1.sub();
		g1.mul();
		g1.div();
		g1.mod();

	}

}
