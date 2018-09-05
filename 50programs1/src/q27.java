import java.util.*;
public class q27 
{
	public static void main(String[] args)
	{
		int i,n;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		}
}
