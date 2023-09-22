import java.util.Scanner;
//  write the program sum of n number problem
public class Sumno
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;
		System.out.println(" enter the value of n...");
		 n=sc.nextInt();
		 
		for(i=1;i<=n;i++)
		{
			 sum+=i;
		}
           System.out.println(sum);
	}

}
