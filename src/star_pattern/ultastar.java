package star_pattern;

// decresing  Pyramid
import java.util.Scanner;

public class ultastar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		  for(int j=n;j>=i;j--)
		  {
			System.out.print("*");  
		  }
		  System.out.println("");
		}

	}

}
