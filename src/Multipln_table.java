import java.util.Scanner;

public class Multipln_table {

	public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value to show table");
        int n=sc.nextInt();
        for(int i=1;i<=10; i++)
        {
        	System.out.println(n + "*" + i + "=" + (n * i));
        }
	}
	

}
