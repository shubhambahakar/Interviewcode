import java.util.Scanner;

public class Armstromno {

	
	// arm no 153 tya num ca cube single + add is equal to no
	public static void main(String[] args)
	{
       System.out.println(" enter the number ");
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int r, arm=0;
       int c=n;
       while(n>0) 
       {
    	 r=n%10;
    	 arm=(r*r*r)+arm;
    	 n=n/10;
       }
       if(c==arm)
       {
    	   System.out.println("num is armstroam");
       }else
       {
    	   System.out.println("num is not armstroam");
       }
	}

}
