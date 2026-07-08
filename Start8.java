
import java.util.ArrayList;
import java.util.Scanner;

public class Start8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for a loop");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(n);

        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        System.out.println(arr);
        sc.close();
    }
}
