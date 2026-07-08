import java.util.*;

public class Vector5 {

    // Void return type because we are modifying the original vector directly
    public static void opertionInPlace(Vector<Integer> vc) {
        // If the vector is too small, there is nothing to pair up
        if (vc.size() < 2) {
            return; 
        }

        // Loop through the elements up to the second-to-last item
        for (int i = 0; i < vc.size() - 1; i++) {
            int currentSum = vc.get(i) + vc.get(i + 1);
            
            // Overwrite the item at index i with the calculated sum
            vc.set(i, currentSum);
        }

        // Remove the very last element since it doesn't have a right-side neighbor to pair with
        vc.remove(vc.size() - 1);
    }

    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Before: " + vc);

        // Call the in-place method
        opertionInPlace(vc);

        // The original 'vc' variable has now permanently changed!
        System.out.println("After:  " + vc); 
    }
}
