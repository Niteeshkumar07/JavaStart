import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // 1. Count the occurrences of each number
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = mp.getOrDefault(num, 0) + 1;
            mp.put(num, count);
        }

        // 2. Iterate through the map to find the majority element
        int n = nums.length;
        
        // Loop through every single key (number) inside the map
        for (int key : mp.keySet()) {
            // Get the count for the current key
            int count = mp.get(key); 
            
            // Check if the count is strictly greater than n / 2
            if (count > n / 2) {
                return key; // Found it! Return the number immediately
            }
        }

        return 0; // Safety backup return
    }
}
