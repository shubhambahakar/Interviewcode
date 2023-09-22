package Arrays;
//Coupa
import java.util.HashSet;

public class PairTarget {
    public static void findPairs(int[] arr, int targetSum) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
        	      //2 = 10 -8 
            int complement = targetSum - num;

            // Check if the complement exists in the HashSet
            if (seen.contains(complement)) {
                System.out.println("Pair found: " + num + " and " + complement);
            }

            // Add the current number to the HashSet
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 3, 6, 1};
        int targetSum = 10;
        
        findPairs(arr, targetSum);
    }
}
