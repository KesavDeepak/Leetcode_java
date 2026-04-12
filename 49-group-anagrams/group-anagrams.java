import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Map: key -> character count signature, value -> list of anagrams
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            
            int[] count = new int[26]; // for 'a' to 'z'
            
            // Count characters
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            // Convert count array to string key
            StringBuilder keyBuilder = new StringBuilder();
            for (int num : count) {
                keyBuilder.append(num).append("#"); // delimiter to avoid ambiguity
            }
            
            String key = keyBuilder.toString();
            
            // Add to map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());

        // iterate through each string
        // count the nof of characters and convert it into string and take it as key
        // create a list for that key as value and append the string that satisfies the condition.
    }
}