
import java.util.*;
public class Pra4{
    public static void main(String[] args) {
        
        HashMap<Character, Integer> mp = new HashMap<>();
        String str = "aabbccddee";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            int count = mp.getOrDefault(ch, 0) +1;

            mp.put(ch,count);

        }

        for(char key : mp.keySet()){
            int num = mp.get(key);
            System.out.println("Key="+key + "num="+num);
        }

    }
}
