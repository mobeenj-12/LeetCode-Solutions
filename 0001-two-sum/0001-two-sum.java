class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> freqIndices =new HashMap<>();
     
        for(int i=0;i<nums.length;i++){
           int complement=target-nums[i];
            if(freqIndices.containsKey(complement)){
                return new int[]{freqIndices.get(complement),i};
            }
            freqIndices.put(nums[i],i);
        }   
        return new int[0];     
    }
}