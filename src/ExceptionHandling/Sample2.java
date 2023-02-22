package ExceptionHandling;

public class Sample2 
{
	public static void main(String[] args) {
		String s1="Priyanka";
		
		
		try
		{
			System.out.println(s1.charAt(9));
		}
		catch(Exception e)
		{
			System.out.println("String index out of bound Exception HAndled");
		}
		
		System.out.println("String index out of bound Exception");
	}
}
