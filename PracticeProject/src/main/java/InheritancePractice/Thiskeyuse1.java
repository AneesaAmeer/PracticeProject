package InheritancePractice;

public class Thiskeyuse1 {
	class ThisKeyUse2
	{
	public void phrase()
	{
	System.out.println("Hi");
	this.display();
	}
	public void display()
	{
	System.out.println("Hello");
	}
	public static void main(String args[])
	{
	Thiskeyuse1 obj=new Thiskeyuse1();	
	obj.phrase();
	}
	}
}



	


