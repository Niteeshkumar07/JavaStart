import java.util.Scanner;
import java.util.Vector;

public class Start10 {
    public static void main(String[] args) {
        
        Vector<Integer> arr = new Vector<>();
        Scanner sc = new Scanner(System.in);

        arr.add(10);
        arr.add(20);
        arr.add(2,30);

        arr.remove(1);

        arr.add(1,100);

        for(int i=0; i<5; i++){
            arr.add(sc.nextInt());
        }

        System.out.println(arr);

        sc.close();

    }
}
