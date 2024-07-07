package assignment1;

public class If_else_If_block 
{
	
	static void grade(int marks)
	{
		
		if(marks>=90 && marks<=100)
			{
				System.out.println("Print the Grade as A");
			}
			else if(marks>=80 && marks<=89)
			{
				System.out.println("Print the Grade as B");
			}
			else if(marks>=70 && marks<=79)
			{
				System.out.println("Print the Grade as C");
			}
			else if(marks>=60 && marks<=69)
			{
				System.out.println("Print the Grage as D");
			}
			else if(marks >=35 && marks<=59)
			{
				System.out.println("Print the Grade as E");
			}
			else
			{
				System.out.println("You Failed the Exam");
				
			}
		
	}
	public static void main(String[] args) 
	{
		
		 grade(38);
	}
	
}
