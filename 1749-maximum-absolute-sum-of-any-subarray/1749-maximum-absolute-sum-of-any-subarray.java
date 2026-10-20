class Solution {
    public static int posMax(int nums[]){
        int bestEnd=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int cur=nums[i]+bestEnd;
            bestEnd=Math.max(nums[i],cur);
            ans=Math.max(ans,bestEnd);
        }
        return  Math.abs(ans);
    }

     public static int negMax(int nums[]){
        int bestEnd=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int cur=nums[i]+bestEnd;
            bestEnd=Math.min(nums[i],cur);
            ans=Math.min(ans,bestEnd);
        }
        return Math.abs(ans);
    }

    public int maxAbsoluteSum(int[] nums) {
        int posAns=posMax(nums);
        int negAns=negMax(nums);
        return Math.max(posAns,negAns);
         
    }
}