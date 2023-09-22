import java.util.Scanner;

public class Evenno_sum {

	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		System.out.println("even num is : ");
		for(int i=0;i<=n;i++) {
			int n1=i*2;
			sum=sum+n1;
			System.out.print("  "+n1);
		}
		System.out.println(" Sum of the even number is : "+sum);
		
	}
	
}
