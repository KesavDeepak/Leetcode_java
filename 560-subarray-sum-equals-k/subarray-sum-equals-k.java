class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int currSum = 0;
        for(int num:nums){
            currSum += num;
            int diff = currSum - k;
            res+= map.getOrDefault(diff,0);
            map.put(currSum,1+map.getOrDefault(currSum,0) );
        }
        return res;
    }
}