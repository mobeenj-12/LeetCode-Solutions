class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> findDuplicates=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(findDuplicates.containsKey(nums[i])){
                return nums[i];
            }
            findDuplicates.put(nums[i],1);
        }
        return -1;
    }
}