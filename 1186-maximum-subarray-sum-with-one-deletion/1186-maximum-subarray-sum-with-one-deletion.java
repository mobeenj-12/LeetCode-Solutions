class Solution {
    public int maximumSum(int[] arr) {
        int noDelete=arr[0],res=arr[0],oneDelete=Integer.MIN_VALUE;
        int curr;
        for(int i=1;i<arr.length;i++){
            int prevNoDelete=noDelete;
            int prevOneDelete=oneDelete;
            noDelete=Math.max(noDelete+arr[i],arr[i]);
            if(prevOneDelete==Integer.MIN_VALUE){
                curr=arr[i];
            }
            else{
                curr=prevOneDelete+arr[i];
            }
            oneDelete=Math.max(curr,prevNoDelete);
            res=Math.max(res,Math.max(noDelete,oneDelete));

        }
        return res;
    }
}