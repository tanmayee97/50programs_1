
public class q20 {

	public static void main(String[] args)
	{
		int n=75;
		if(n<0 || n>100)
		{
			System.out.println("InValid Input");
		}
		
		else if(n<90 || n>100)
		{
			System.out.print("Super Smart");
		}
		else if(n<80 || n>90)
		{
			System.out.println("Smart");
		}
		else if(n<70 || n>80)
		{
			System.out.println("Just Smart");
		}
		else if(n<60 || n>70)
		{
			System.out.println("No Smart");
		}
		else
		{
			System.out.println("Dump");
		}
	}
}
