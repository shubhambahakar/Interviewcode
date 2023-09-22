package Arrays;

public class LargestSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// largest element is 
		int arr[]= {9,2,5,6,8};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
				max=arr[i];
			}
		System.out.println("largest ele : "+max);
		System.out.println("*************");
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min)
				min=arr[i];
			}
		System.out.println("smallest ele : "+min);
           //sum of all element in array
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res=res+arr[i];
			 
			}
		System.out.println(res);
		}
	}


