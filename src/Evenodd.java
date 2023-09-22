import java.util.Scanner;

// program for check no is even or odd
public class Evenodd {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of N...");
		int n;
		n=sc.nextInt();
		if(n%2==0)
		System.out.println("number is even"+n);
		else
	    System.out.println("number is odd"+n);
	}

}
