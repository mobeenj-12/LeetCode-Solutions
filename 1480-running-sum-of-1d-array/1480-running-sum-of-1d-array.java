class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum[]=new int[nums.length];
        int high=0,curSum=0;
        while(high<nums.length){
            curSum+=nums[high];
            runningSum[high]=curSum;
            high++;
        }
        return runningSum;
    }
}