package Patterns;

public class Example5 {
public static void main(String[] args) {
	
	int orgnum=123;
	int sum=0;
	
	for(int i=orgnum;i>0;i=i/10)
	{
		int rem=i%10;
        sum=sum+(rem*rem*rem);
        
	}
	if(orgnum==sum)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not Armstrong");
	}
}
}
