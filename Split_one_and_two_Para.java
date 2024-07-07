package assignment1;

import java.util.Arrays;

public class Split_one_and_two_Para {

	public static void main(String[] args)
	{
		String s4 = "my name is tejaswi";
		String s5[] = s4.split(" ");
		//s5[0]=my
		//s5[1]=name
		//s5[2] = is
		//s5[3] = tejaswi
		
		//System.out.println(s5[0]);
		System.out.println(Arrays.toString(s5)); //split with one para(String)
		
		String s6[] = s4.split(" ", 3);//split (string,limit)two para
		System.out.println(Arrays.toString(s6));
		

	}

}
