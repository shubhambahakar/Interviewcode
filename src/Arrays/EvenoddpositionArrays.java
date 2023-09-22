package Arrays;

import java.util.Arrays;

public class EvenoddpositionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,6,8};
		//even position;
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]);
		}
		
		// position start from direct 1234567
		// odd position
		System.out.println("\n");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]);
		}

	}

}
