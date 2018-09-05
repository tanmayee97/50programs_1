
public class q21 {

	public static void main(String[] args) 
	{
		int a=56;
		int b=88;
		int c=125;
		int sum=0;
		int avg=0;
		for(int i=56;i<=125;i++)
		{
			System.out.println(i);
		}
		for(int j=56;j<=88;j++)
		{
			if(j%2!=0)
			{
				System.out.println(j);
			}	
		}
			for(int i=56;i<=125;i++)
			{
				sum=sum+i;
			}
			System.out.println(sum);

	for(int i=56;i<=125;i++)
	{
		avg++;
	}
	System.out.println(sum/avg);
	System.out.println("ENDED");
}
}

