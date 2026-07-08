import java.util.*;
public class HashMap_Start {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();

        mp.put(2,2);
        mp.put(3,3);

        for(int num : mp.keySet()){
            // if(mp.containsKey(2)){
            if(num == 2){
                System.out.println("Key Exists");
            }else{
                System.out.println("Key not Exists");
            }
        }
    }
    
}
