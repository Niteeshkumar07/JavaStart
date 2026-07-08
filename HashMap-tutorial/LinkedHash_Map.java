import java.util.*;

public class LinkedHash_Map {
    public static void main(String[] args) {
        
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();

        String str = "llaabbcfbcbbredfg";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            int count = mp.getOrDefault(ch, 0) + 1;

            mp.put(ch,count);
        }

        for(char ch : mp.keySet()){
            int count = mp.get(ch);
            System.out.println("keys " + ch + " count " + count);
        }

    }
    
}


