class Solution {
    public int trailingZeroes(int num) {
        int sum=0,mul=5;
        while(num>=mul){
            sum+=num/mul;
            mul*=5;
        }
        return sum;
    }
}