package assertkeyword;

public class AssertKeyword {

	public static void main(String[] args)
	{
//		String name = "Ram";
//		assert name.length()>1; //condition is false
//		//assert name.isEmpty()!=true;
//		System.out.println(name.concat(" Tiwari"));
//		

	int a = 10;
	int b = 20;
	assert a>5:"Sorry the condition is wrong";
	int sum = a+b;
	System.out.println(sum);
	}

}
