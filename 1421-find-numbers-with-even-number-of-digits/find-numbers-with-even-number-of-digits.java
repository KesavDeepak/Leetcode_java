class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int i: nums){
            int digits = (int)Math.floor(Math.log10(i))+1;
            if(digits%2 == 0){
                c = c+1;
            }

        }
        return c;
    }
}