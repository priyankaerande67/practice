package ExceptionHandling;

import java.util.Scanner;

public class Accept_input_from_user
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println("Square of Number : "+ num*num);
	}
}
