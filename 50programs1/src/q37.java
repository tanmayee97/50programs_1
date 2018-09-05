import java.util.*;
public class q37 
{
	public static void main(String[] args) 
	 {
		int s,r=0,n=153;
		int i=n;
		while(n!=0)
		{
			s=n%10;
			r=r+s*s*s;
			n=n/10;
		}
		if(i==r)
		{
			System.out.println("Given Number is Armstrong");
		}
		else
		{
			System.out.println("Given Number is not Armstrong");

		}
	}

}
