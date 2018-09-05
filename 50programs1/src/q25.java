import java.util.Scanner;

public class q25 {

	public static void main(String[] args)
	{
		int i,n,flag=0;
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a number :");
		  n=sc.nextInt();
		  for(i=2;i<=n/2;i++)
		  {
			  if(n%i==0)
			  {
				  flag=1;
				  break;
			  }
		  }
		if(flag==0)
		{
			System.out.println("Prime");
		}
			else
			{
				System.out.println("Not prime");	
		     }
	}
}
