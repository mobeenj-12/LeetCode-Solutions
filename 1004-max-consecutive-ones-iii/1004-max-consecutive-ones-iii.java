class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0,high=0,zeroCount=0,maxLen=-10;
        for(high=0;high<nums.length;high++){
            if(nums[high]==0){
                zeroCount++;
            }
            if(zeroCount>k){
                if(nums[low]==0){
                     zeroCount--;
                }
                low++;
            }

            maxLen=Math.max(maxLen,high-low+1);
        }
        return maxLen;
    }
}