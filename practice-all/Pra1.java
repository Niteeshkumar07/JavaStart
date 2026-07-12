
import java.util.Scanner;

public class Pra1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
