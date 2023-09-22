import java.util.Scanner;
// program for print the n number 
public class Printnum {

	public static void main(String[] args)
	{
       Scanner sc= new Scanner(System.in);
       int n,i;
       System.out.print("Enter the value of n....");
       n =sc.nextInt();
       for(i=1;i<=n; i++)
       {
           System.out.println(i);

    	   
       }
       sc.close();

	}
}
