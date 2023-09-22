import java.util.Scanner;

public class Addtiondigit_no {

	public static void main(String[] args) 
	{
		System.out.println(" enter the number ");
	       Scanner sc=new Scanner (System.in);
	       int n=sc.nextInt();
	      int s=0,r;
	       while(n>0) 
	       {
	    	 r=n%10;
	    	 s=s+r;
	    	 n=n/10;
	       }
	       System.out.println("Addition of number is: "+s);
	}

}
