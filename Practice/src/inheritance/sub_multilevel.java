package inheritance;

public class sub_multilevel  extends Education

{
	public void m1()
	{
		System.out.println("This is the Example of Multi Level Inheritance");
	}
	
	public static void main(String[] args) {
		
		sub_multilevel m=new sub_multilevel();
		
		m.m1();
		
		m.rollno();
		
		m.name();
		
		m.department();
		
	}
}
