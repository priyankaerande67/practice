package ExceptionHandling;

public class Sample4 
{
	public static void main(String[] args)
	{
		int ar[]=new int[5];
		
		
		try
		{
			ar[6]=67;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmatic Exception Handled");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array Index Out Of Bound Exception Handled");
		}
	}
}
