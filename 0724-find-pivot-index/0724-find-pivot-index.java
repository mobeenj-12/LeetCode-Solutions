class Solution {
    public int pivotIndex(int[] nums) {
        int prefixSum=0,suffixSum=0;
        int start=0,sum=0;
        while(start<nums.length){
            sum+=nums[start];
            start++;
        }
        
        for(int i=0;i<nums.length;i++){
            suffixSum=sum-nums[i]-prefixSum;
            if(prefixSum==suffixSum){
                return i;
            }
             prefixSum+=nums[i];
        }
        return -1;
    }
}