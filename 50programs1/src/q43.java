
public class q43
{
	public static void main(String[] args)
	{
		int n=15,m=10,a;
		while(m!=0)
		{
			 a=n%m;
			 n=m;
			 m=a;
		}
		System.out.println(n);
	}
}
