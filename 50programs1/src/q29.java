import java.util.Scanner;
public class q29
{
	public static void main(String[] args)
	{
        int n, m, r = 0,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = sc.nextInt();
        m = n;
        while(n > 0)
        {
            s = n % 10;
            r = r * 10 + s;
            n = n / 10;
        }
        if(r == m)
        {
            System.out.println("Given number "+m+" is Palindrome");
        }
        else
        {
            System.out.println("Given number "+m+" is Not Palindrome");
        }
    }
}
