package ExceptionHandling;

public class Sample1 
{
	public static void main(String[] args) {
		int ar[]=new int[5];    //return 0 to 4 index
		
		
		
		ar[0]=15;
		
		
		
		
		try
		{
			ar[7]=89;  //risky code
		}
		catch(Exception e)
		{
			System.out.println("Array index out of bouynd exception handle.");
		}
		System.out.println("Array index out of bound Exception.");
	}
}
