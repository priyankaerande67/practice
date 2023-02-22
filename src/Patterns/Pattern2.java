package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		//1
		//22
		//333
		//4444
		//55555
		int row=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
