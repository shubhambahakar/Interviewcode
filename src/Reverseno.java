import java.util.Scanner;
// write program of reverse no print 
public class Reverseno {

	public static void main(String[] args) 
	{
         int n,i;
         System.out.println("enter the value n");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         for(i=n;i>=1;i--)
         {
        	 System.out.println(i);
         }
	}

}
