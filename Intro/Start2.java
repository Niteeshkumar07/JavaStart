package Intro;
import java.util.*;
public class Start2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {1,2,3,4,5};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > second){
                second = arr[i];
            }
        }
        System.out.println(second);
        sc.close();
    }
}
