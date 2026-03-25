class Solution {
    public int trap(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length -1;
        int leftMax =height[l];
        int rightMax = height[r];
        while(l<r){
            if(leftMax < rightMax){
                l+=1;
                leftMax = Math.max(leftMax, height[l]);
                res+= leftMax - height[l];
            }
            else{
                r-=1;
                rightMax = Math.max(rightMax, height[r]);
                res+= rightMax - height[r];
            }
            

        }
        return res;

    }
}