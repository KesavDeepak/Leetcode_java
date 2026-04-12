class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longeststreak = 0;
        for(int i:set){
            if(!set.contains(i-1)){
                int currentstreak = 1;
                int current = i;
                while(set.contains(current+1)){
                    current++;
                    currentstreak++;
                }
                longeststreak = Math.max(longeststreak, currentstreak);
                
            }
            
        }
        return longeststreak;
    }
}