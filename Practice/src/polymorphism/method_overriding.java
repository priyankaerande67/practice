package polymorphism;

public class method_overriding 
{

	public static void main(String[] args)
	{
		Father f=new Father();
		
		f.car();
		f.home();
		
		son s=new son();
		s.car();
		s.laptop();
	}
}
