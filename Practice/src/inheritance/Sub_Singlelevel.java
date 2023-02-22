
package inheritance;

public class Sub_Singlelevel extends Super_Single_level
{
	public void m2()
	{
		System.out.println("This is the sub class");
	}
	public static void main(String[] args)
	{
		Sub_Singlelevel s=new Sub_Singlelevel();
		s.department();
		s.m1();
		s.m2();
		
	}
}
