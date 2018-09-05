
public class q32 {

	public static void main(String[] args) 
	{
	    int sum=0;
		int avg=0;
		for(int i=25;i<=100;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}	
				if(c==2)
				{
					sum=sum+i;
					avg++;
				}
			}
		System.out.print(sum/avg);
		}
	}	
