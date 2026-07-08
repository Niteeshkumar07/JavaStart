package Intro;
import java.util.Scanner;
import java.util.Vector;

public class Start7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Vector<Integer> arr = new Vector<>(5);


        for(int i=0; i<5; i++){
            arr.add(sc.nextInt());
        }


        for(int i=0; i<5; i++){
           int num = arr.get(i) + 10;
           arr.set(i,num);
        }

        System.out.println(arr);

        sc.close();


    }
}
