package problembase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomArraySort {
    public static void main(String[] args) {
        // Create an array of objects (e.g., Integer)
        Integer[] arr = {1, 2, 3, 4, 5};

        // Convert the array to a List
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Shuffle the List randomly
        Collections.shuffle(list);

        // Convert the List back to an array (if needed)
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println(Arrays.toString(shuffledArray));
        
        
       

      
//                int[] arr = {1, 2, 3, 4, 5};
//
//                // Create a random number generator
//                Random rand = new Random();
//
//                // Perform the Fisher-Yates shuffle algorithm
//                for (int i = arr.length - 1; i > 0; i--) {
//                    int j = rand.nextInt(i + 1);
//
//                    // Swap arr[i] and arr[j]
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//                // Print the shuffled array
//                System.out.println(Arrays.toString(arr));
            
        

    }
}
