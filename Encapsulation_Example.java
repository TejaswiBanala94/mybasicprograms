package encapsulationprograms;
class Google_auth
{
	private int age = 20;

//	public int getAge() {        //by generating
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	public int  getAge()  //to get the new age
	{
        return age;            		
	}
	public void setAge(int age) //set the age
	{
		this.age = age;
		
	}

  private String un = "TejaswiBanala";

  public String getUn() 
  {
	return un;
  }
  public void setUn(String un)
  {
	this.un = un;
  }
 }

public class Encapsulation_Example  //Author:teju
{

	public static void main(String[] args) 
	{
		Google_auth g1 = new Google_auth();
		g1.setAge(65);
		System.out.println(g1.getAge());
		g1.setUn("TejaswiAakuthota");
		System.out.println(g1.getUn());

	}

}
