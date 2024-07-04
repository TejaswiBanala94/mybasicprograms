package basic_additions;

public class MethodOverloading {
	
	static void add(int a)//1 parameter
	{
		int sum = a+6;
		System.out.println(sum);
	}
	static void add(int a,int b)//2 parameter
	{
		int sum = a+b;
		System.out.println(sum);
	}
	static void add()//0 parameter
	{
		System.out.println("add");
	}
	

	public static void main(String[] args) {
		add(6);
		
		add();
		add(6,7);
		

	}

}
