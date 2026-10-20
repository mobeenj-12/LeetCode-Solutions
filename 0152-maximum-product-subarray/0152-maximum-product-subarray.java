class Solution {
    public int maxProduct(int[] nums) {
        int maxEnd=nums[0],minEnd=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i]*maxEnd;
            int v2=nums[i]*minEnd;
            int v3=nums[i];
            maxEnd=Math.max(v1,Math.max(v2,v3));
            minEnd=Math.min(v1,Math.min(v2,v3));
           ans=Math.max(ans,Math.max(maxEnd,minEnd));
        }
        return ans;
    }
}