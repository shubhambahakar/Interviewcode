import java.util.Scanner;

public class Vowel {
	static public void main(String [] args) {
		System.out.println(" please enter character");
		//char c;
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if( c=='a' || c== 'e' || c== 'i' || c== 'o' || c=='u') {
			System.out.println(" charcter is Vowel");
		}else {
			System.out.println("character is conconent");
		}
		
	}

	

}
