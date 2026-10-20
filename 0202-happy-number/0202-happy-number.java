class Solution {
    public static int squareDig(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        while(fast!=1){
            slow=squareDig(slow);
            fast=squareDig(fast);
            fast=squareDig(fast);
            if(slow==fast && fast!=1) return false;
        }
        return true;
    }
}