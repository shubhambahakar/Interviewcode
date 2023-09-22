package Arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] arr1= {1,5,6,8};
		int[] arr2= new int [arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
			
		}
		 //Arrays ntr Control + space dabun import karaych 
		System.out.println(Arrays.toString(arr2));
	}

}
