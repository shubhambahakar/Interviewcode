import java.util.Scanner;

public class Print_a_z {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the value of character...");
		char c=sc.next().charAt(0);
		for(char i='a';i<=c;i++) {
			System.out.print(i+" ");
		}
	}

}
