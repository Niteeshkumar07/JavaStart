import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        
        Set<Integer> s = new HashSet<>();

        Vector<Integer> arr = new Vector<>(Arrays.asList(1,2,3,4,1,2,3,4));

        for(int i=0; i<arr.size(); i++){
            s.add(arr.get(i));
        }
        System.out.println(s.size());

        for(int num : s){
            System.out.println(num);
        
        }

    }
    
}
