package stringbufferprograms;

public class StringBuffer_Methods {

	public static void main(String[] args) 
	{	
		StringBuffer sb1 = new StringBuffer("Tejaswi");
		System.out.println(sb1.append(" Banala"));  //append
		
		 StringBuffer sb2 = sb1.insert(8,"Aakuthota ");  //insert
		System.out.println(sb2);
		
		StringBuffer sb3 = sb1.replace(18, 24, "Student"); //replace
		System.out.println(sb3);
		System.out.println(sb1);
		
		StringBuffer sb4 = sb1.delete(18, 25);  //delete
		System.out.println(sb4);
		
		System.out.println(sb1.reverse());  //reverse
		
		StringBuffer s1 = new StringBuffer("Ayaansh");
		System.out.println(s1.capacity()); //capacity
		
		char sb5 = s1.charAt(5);  //charAt
		System.out.println(sb5);
		System.out.println(s1.length()); //length
		
		String s2 = s1.substring(3); //substring with one para
		System.out.println(s2);
		System.out.println(s1);
		
		String s3 = s1.substring(1, 6); //substring with two para
		System.out.println(s3);		

	}

}
