package inheritance;

public class Hirarchical_inheritance
{
	public static void main(String[] args) {
		
		System.out.println("Dauther's property:");
		System.out.println("----------------------");
		Dauther d=new Dauther();
		d.car();
		d.money();
		d.home();
		d.mobile();
		
		System.out.println("Son's Property:");
		System.out.println("-------------------");
		son s=new son();
		s.car();
		s.money();
		s.bike();
		s.laptop();
	}
}
