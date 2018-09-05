import java.util.*;
public class q30
{
	public static void main(String[] args)
	{
		int n=4567;
		int s;
		int sum=0;
		while(n!=0)
		{
			s=n%10;
			sum=sum+s;
			n=n/10;
		}
		System.out.println(sum);
		 }
		}
	
