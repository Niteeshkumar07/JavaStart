import java.util.*;

public class Pra3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=5;

        Vector<Integer> arr = new Vector<>(n);
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        for(int i=0; i<n; i++){
            System.out.println(arr.get(i));
        }

        System.out.println("Print array");
        System.out.println(arr);

        sc.close();

    }
    
}
