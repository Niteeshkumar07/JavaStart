
import java.util.*;
public class Vector1 {
    public static void main(String[] args) {
        
        Vector<Integer> arr = new Vector<>();
        
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr);

        arr.add(3,40);
        arr.add(4,50);

        System.out.println(arr);

        arr.remove(4);

        System.out.println(arr);

        int n = arr.size();

        System.out.println(n);


    }
}
