package assignment1;

public class Or_Operator {

	public static void main(String[] args) {
//		int age=30;
		char gender = 'F';
		int salary=20000;
		if(salary == 20000 || gender=='F')//t t 
		{
			System.out.println("If any one is true,it will execute");
		}
		if(salary == 20000 || gender=='M')//t f 
		{
			System.out.println("If any one is true,it will execute");
		}
		if(salary == 10000 || gender=='F')//f t 
		{
			System.out.println("If any one is true,it will execute");
		}
		if(salary == 10000 || gender=='M')//f f 
		{
			System.out.println("If any one is true,it will execute");
		}
	
	}

}
