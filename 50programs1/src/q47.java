
public class q47 {

	public static void main(String[] args)
	{
		int a,n=25891;
		int max=1;
		while(n!=0)
		{
			a=n%10;
			
				if(a>max)
				{
					max=a;
				}
				n=n/10;
				
			}
		System.out.println(max);
		}
	}

