package ExceptionHandling;

import java.util.Scanner;

public class Accept_string_input_from_user 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s1=sc.next();
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
	}
}
