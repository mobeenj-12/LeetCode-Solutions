class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,dig;
        int copy=x;
        while(x>0){
            dig=x%10;
            rev=(rev*10)+dig;
            x=x/10;
        }
        if(copy==rev){
            return true;
        }
        return false;
    }
}