
public class q49 {

	public static void main(String[] args)
	{
		int count=0,n=64797823;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Number of digits:"  +count);
	}

}
