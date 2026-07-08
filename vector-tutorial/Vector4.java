
import java.util.*;
public class Vector4 {

    public static Vector<Integer> opertion(Vector<Integer> vc){

        Vector<Integer> arr = new Vector<>();
        
        for(int i=0; i<vc.size()-1;i++){

            arr.add(vc.get(i) + vc.get(i+1));

        }
        return arr;
    }
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(opertion(vc));

        Vector<Integer> result = opertion(vc);
        System.out.println("Result: " + result);

    }
}
