package star_pattern;

import java.util.Scanner;
//incresing Pyramid
public class SarkhaPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		  for(int j=1;j<=i;j++)
		  {
			System.out.print("*");  
		  }
		  System.out.println("");
		}

	}

}
