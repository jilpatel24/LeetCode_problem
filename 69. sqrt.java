class Solution {
    public int mySqrt(int x) {
        int start = 0;
       int end = x;
       int ans=0;
       int mid;

       while(start <= end){
       mid = start + (end-start)/2;
       long square =(long) mid * mid;//in some case may (mid*mid) size bcom largerthan the size so important to convert in long
        if(square == x){
         return mid;
        }
        if(square < x){
         ans = mid;
         start = mid + 1;
        }else{
         end = mid - 1;
        }
       }
return ans;
    }
}
