import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Step 1: Count frequency
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets
        ArrayList<ArrayList<Integer>> freq = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            freq.add(new ArrayList<>());
        }

        // Step 3: Fill buckets
        for (int key : count.keySet()) {
            int f = count.get(key);
            freq.get(f).add(key);
        }

        // Step 4: Collect top k elements
        int[] result = new int[k];
        int index = 0;

        for (int i = freq.size() - 1; i >= 0 && index < k; i--) {
            for (int num : freq.get(i)) {
                result[index++] = num;
                if (index == k) break;
            }
        }

        return result;
    }
}