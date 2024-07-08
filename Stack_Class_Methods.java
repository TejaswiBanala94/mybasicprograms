package legacyclass;

import java.util.Stack;

public class Stack_Class_Methods {

	public static void main(String[] args) 
	{
		Stack s1 = new Stack();
		s1.add("Teju");
		s1.add("Raju");
		s1.add("Mahi");
		s1.add("Sneha");
		s1.add("Khushi");
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		s1.push("Rohith");
		System.out.println(s1);

	}

}
