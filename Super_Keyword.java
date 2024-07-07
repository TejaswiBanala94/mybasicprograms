package inheritance.program.java;
class Parent_Class_for_Super
{
	void add()
	{
		int a = 46;
		int b = 45;
		int sum = a+b;
		System.out.println(sum);
	}
	
}
public class Super_Keyword extends Parent_Class_for_Super
{
	void add()
	{
		int a = 6;
		int b = 5;
		int sub = a-b;
		super.add();
		System.out.println(sub);
	}

	public static void main(String[] args)
	{
		Super_Keyword s1 = new Super_Keyword();
				s1.add();

	}

}
