class Solution {
    public int distributeCandies(int[] candyType) {
        int count=1;
        Arrays.sort(candyType);
        int low=0,high=1;
        while(high<candyType.length){
            if(candyType[low]!=candyType[high]){
                count++;
                low=high;
            }
            high++;
        }
         return Math.min(count,candyType.length/2);
    }
}