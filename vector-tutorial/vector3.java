// import java.util.Scanner;
import java.util.Vector;


public class vector3 {

    public static Vector<Integer> addvalue(int[] arr){

        Vector<Integer> vc = new Vector<>();
        for(int i=0; i<arr.length-1;i++){
            vc.add(arr[i] + arr[i+1]);
        }
        return vc;

    }
    public static void main(String[] args) {
        
        int []arr = {1,2,3,4,5};
        System.out.println(addvalue(arr));

    }
}


// import java.util.Arrays;

// public class vector3 {

//     public static int[] addvalue(int[] arr) {
//         // Loop stops at arr.length - 1 so we don't go out of bounds
//         for (int i = 0; i < arr.length - 1; i++) {
//             // Correct array syntax using square brackets []
//             arr[i] = arr[i] + arr[i + 1]; 
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
        
//         // Pass the array to the method
//         int[] result = addvalue(arr);
        
//         // Use Arrays.toString() to safely print the array elements
//         System.out.println(Arrays.toString(result));
//     }
// }

