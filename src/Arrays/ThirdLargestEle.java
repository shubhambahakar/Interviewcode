package Arrays;

public class ThirdLargestEle {
	
	
	public static int thildLargestele(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++ ) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		// for largest ele
		return a[total-3];
		
		
		// for smallest return no 3rd pahilje tar a[2] because index start 0;
		//return a[2];
	}

	public static void main(String[] args) {
		int a[]= {7,5,6,8,9,3};
		int b[]= {75,522,6,8,96,3,56};

		System.out.println("thirld largest ele:"+thildLargestele(a,6));
		System.out.println("thirld largest ele:"+thildLargestele(b,7));

	}

}
