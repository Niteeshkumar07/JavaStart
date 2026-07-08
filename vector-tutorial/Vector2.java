import java.util.Scanner;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of vector");
        int n = sc.nextInt();

        System.out.println("Enter the " + n +  " value of vector");
        
        Vector<Integer> arr = new Vector<>();

        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        System.out.println("Print the value of vector");
        System.out.println(arr);

        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }

        sc.close();
    }
}
