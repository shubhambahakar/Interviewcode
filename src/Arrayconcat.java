

public class Arrayconcat {

	public static int[] concatArrays(int[] arr1, int[] arr2) {
	    int[] result = new int[arr1.length + arr2.length];
	    
	    // Copy elements from arr1 to the result array
	    System.arraycopy(arr1, 0, result, 0, arr1.length);
	    
	    // Copy elements from arr2 to the result array
	    System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
	    
	    return result;
	}
	
	public static void main(String[] args) {
	    int[] arr1 = {1, 2, 3};
	    int[] arr2 = {4, 5, 6};
	    
	    int[] concatenatedArray = concatArrays(arr1, arr2);
	    
	    for (int num : concatenatedArray) {
	        System.out.print(num + " ");
	    }
	
	}
}
