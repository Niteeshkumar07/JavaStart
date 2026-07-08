
public class Array1 {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5};

        // arr[2] = 6;
        // arr[3] = 7;

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i] + arr[i+1];
        }

        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }

        
    }
}
