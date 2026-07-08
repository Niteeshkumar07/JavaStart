import java.util.HashMap;

public class Start9 {
    public static void main(String[] args) {
        
        HashMap<Character, Integer> mp = new HashMap<>();

        String val = "aabbccddee";

        for(int i=0; i<val.length(); i++){
            mp.put(val.charAt(i), i); 
        }

    }


}

// for(int i = 0; i < val.length(); i++){
//     char letter = val.charAt(i);

//     // 1. Check if the letter is already in the map
//     if (mp.containsKey(letter)) {
//         // If it exists, get the current count and add 1
//         int oldCount = mp.get(letter);
//         mp.put(letter, oldCount + 1);
//     } else {
//         // If it is a brand new letter, start its count at 1
//         mp.put(letter, 1);
//     }
// }


// for(int i = 0; i < val.length(); i++){
//     char letter = val.charAt(i);
    
//     // Get the current count (or 0 if it's not there yet), then add 1
//     mp.put(letter, mp.getOrDefault(letter, 0) + 1);
// }


