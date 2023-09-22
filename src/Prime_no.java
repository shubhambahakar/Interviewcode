 
import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args)
	{
        System.out.println("Enter the two number");
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
         int i,j;
         for(i=n1;i<=n2;i++)
         {
        	 for(j=2;j<=i;j++)   // j ha print hoil prime no
        	 {
        		 if(i%j==0)
        			 break;
        	 }
        	 if(i==j)
        	 System.out.print(j+" ");
         }
	}

}
