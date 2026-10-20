class Solution {
    public int maxSubArray(int[] nums) {
        int bestEnd=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            bestEnd=Math.max(nums[i],nums[i]+bestEnd);
            ans=Math.max(ans,bestEnd);
        }
        return ans;
    }
}