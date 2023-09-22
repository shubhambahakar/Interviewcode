import java.util.Scanner;
// check number is palindrome or not 
public class Palindromwe_no {

	public static void main(String[] args) 
	{
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c,s=0,r;    // counter ,sum,result
        c =n;
        while(n>0)
        {
        	r=n%10;
        	s=(s*10)+r;
        	n=n/10;
        }
        if(c==s)
        {
        	System.out.println("number is palindrome");
        }else
        {
        	System.out.println("number is not palindrome");
        }
	}
}
        
        
	


