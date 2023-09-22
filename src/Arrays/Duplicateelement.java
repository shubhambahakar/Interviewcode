package Arrays;

public class Duplicateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,3,6,5,2,6,3,9,8};
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
				
			}
		}

	}

}
