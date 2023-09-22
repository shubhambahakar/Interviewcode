package Arrays;

import java.util.Arrays;

public class RotateArrays {

	public static void main(String[] args) {


		int a[]= {1,5,9,6,4,3};
		System.out.println("Arrays is :");
		System.out.println(Arrays.toString(a));
		
		// first la 0 element assign kela 
		int first=a[0];
		//ha loop last element parat nahi jat mhnun -1 kela 
		for(int j=0;j<a.length-1;j++) {
			// jo ele tya index var ahe tyala index +1 kela 
			a[j]=a[j+1];
		}
		//1st ele la last ele Assign kela 
		a[a.length-1]=first;
		System.out.println("After left  rotate arr is:");
		System.out.println(Arrays.toString(a));
		
		System.out.println("***************");
		int arr[]= {1,5,6,3,4};
		//tevde ele ch rotate karin
		int n=1;
		System.out.println(Arrays.toString(arr));
		System.out.println("After Right  rotate arr is:");
		for(int i=0;i<n;i++) {
			int j,last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
