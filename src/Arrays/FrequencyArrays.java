package Arrays;

public class FrequencyArrays {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,2,2,3,1};
		int freq[]=new int[arr.length];
		int visited =-1;
		
		for(int i=0;i<arr.length;i++) {
			int count =1;
			// 1st element natr  ce check karin 
			for(int j=i+1;j<arr.length;j++) {
				// jevha donhi sME betle tevha count ++ karin eg 2=2
				if(arr[i] ==arr[j]) {
					count++;
					// left made jatana 2 pahile sapdalla mhnum visted
					freq[j]= visited;
					
				}
				// ntr  
				//2nd element kiti time yete eg 8 ha kiti da yete list made
				if(freq[i]!=visited) {
					freq[i]=count;
				}
			}
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=visited)
			{
				System.out.println(arr[i] + " "+"ele" +" "+freq[i]+" "+"freq");
			}
		}
		
	}

}
