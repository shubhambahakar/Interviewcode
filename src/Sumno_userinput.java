import java.util.Scanner;

public class Sumno_userinput {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m,sum=0;
		System.out.println(" enter the value of number");
		 n=sc.nextInt();
		 while(n>0)
		 {
			 m=n%10;
			 sum=sum+m;
			 n=n/10;
		 }
		 System.out.println("sum of number : "+sum);
		 
		 
	}

}
