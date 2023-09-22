import java.util.Scanner;

public class Check_prime {

	public static void main(String[] args) 
	{
       System.out.println("Enter the number ");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count = 0,i;
       for(i=1;i<=n;i++)
       {
    	  if(n%i==0)
    	  {
    		  count++;
    	  }
       }
      if( count==2)
    	  System.out.println(" num is prime  ");
      else
    	  System.out.println("num is not prime  ");
	}

}
