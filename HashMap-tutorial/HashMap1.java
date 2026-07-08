import java.util.*;
public class HashMap1{
    public static void main(String[] args) {
        
        HashMap<Character, Integer> mp = new HashMap<>();

        String str = "llabcdeacdeabcder";

        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);

            int count = mp.getOrDefault(ch,0) + 1;

            mp.put(ch,count);

        }

        for(char key : mp.keySet()){
            int count = mp.get(key);
            System.out.println("keys " + key + " count " + count);
        }

    }
}